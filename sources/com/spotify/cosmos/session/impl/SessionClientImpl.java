package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.BootstrapRequired;
import com.spotify.cosmos.session.model.CodeRequired;
import com.spotify.cosmos.session.model.CodeSuccess;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponseBody;
import com.spotify.cosmos.session.model.SessionInfo;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

public class SessionClientImpl implements SessionClient {
    private final LoginResponseFunction mResponseFunction;
    private final SessionCosmosClient mSessionCosmosClient;

    static class LoginResponseFunction implements Function<TypedResponse<LoginResponseBody>, LoginResponse> {
        private LoginResponseFunction() {
        }

        public LoginResponse apply(TypedResponse<LoginResponseBody> typedResponse) {
            int status = typedResponse.status();
            if (status >= 400) {
                String str = (String) typedResponse.headers().get(LogMessage.SEVERITY_ERROR);
                return LoginResponse.error(SessionClientImpl.parseErrorCode(str, status), (String) typedResponse.headers().get("message"));
            }
            LoginResponseBody loginResponseBody = (LoginResponseBody) typedResponse.body();
            if (loginResponseBody instanceof SessionInfo) {
                return LoginResponse.success((SessionInfo) loginResponseBody);
            }
            if (loginResponseBody instanceof CodeSuccess) {
                return LoginResponse.codeSuccess(((CodeSuccess) loginResponseBody).identifierToken());
            }
            if (loginResponseBody instanceof CodeRequired) {
                CodeRequired codeRequired = (CodeRequired) loginResponseBody;
                return LoginResponse.codeRequired(codeRequired.challengeId(), codeRequired.method(), codeRequired.codeLength(), codeRequired.canonicalPhoneNumber(), codeRequired.expiresIn(), codeRequired.retryNumber());
            } else if (loginResponseBody instanceof BootstrapRequired) {
                return LoginResponse.bootstrapRequired(((BootstrapRequired) loginResponseBody).accessToken());
            } else {
                return LoginResponse.error(500, "unsupported_response_type");
            }
        }
    }

    public SessionClientImpl(Cosmonaut cosmonaut, RxRouter rxRouter) {
        this((SessionCosmosClient) cosmonaut.createCosmosService(SessionCosmosClient.class, rxRouter));
    }

    SessionClientImpl(SessionCosmosClient sessionCosmosClient) {
        this.mSessionCosmosClient = sessionCosmosClient;
        this.mResponseFunction = new LoginResponseFunction();
    }

    public Single<LoginResponse> login(LoginRequest loginRequest) {
        return this.mSessionCosmosClient.login(loginRequest).f(this.mResponseFunction);
    }

    public Single<LoginResponse> verifyCode(String str, String str2) {
        return this.mSessionCosmosClient.verifyCode(str, str2).f(this.mResponseFunction);
    }

    public Single<LoginResponse> resendCode(String str) {
        return this.mSessionCosmosClient.resendCode(str).f(this.mResponseFunction);
    }

    public Single<LoginResponse> notifyBootstrapCompleted(byte[] bArr) {
        return this.mSessionCosmosClient.notifyBootstrapCompleted(bArr).f(this.mResponseFunction);
    }

    public Completable logout() {
        return this.mSessionCosmosClient.logout(false);
    }

    public Completable logoutAndForgetCredentials() {
        return this.mSessionCosmosClient.logout(true);
    }

    /* access modifiers changed from: private */
    public static int parseErrorCode(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
