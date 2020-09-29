package defpackage;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponse.BootstrapRequired;
import com.spotify.cosmos.session.model.LoginResponse.CodeRequired;
import com.spotify.cosmos.session.model.LoginResponse.CodeSuccess;
import com.spotify.cosmos.session.model.LoginResponse.Error;
import com.spotify.cosmos.session.model.LoginResponse.Success;
import com.spotify.login.AlreadyLoggedInException;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import io.reactivex.Single;
import java.util.Locale;

/* renamed from: hkt reason: default package */
public final class hkt implements gne {
    private final hky a;
    private final SessionClient b;
    private final nrp c;
    private final BootstrapHandler d;
    private boolean e;

    public hkt(hky hky, SessionClient sessionClient, nrp nrp, BootstrapHandler bootstrapHandler) {
        this.a = hky;
        this.b = sessionClient;
        this.c = nrp;
        this.d = bootstrapHandler;
    }

    public final Single<gnf> a(String str, String str2, boolean z) {
        return a(a(LoginCredentials.facebook(str, str2)), z);
    }

    public final Single<gnf> b(String str, String str2, boolean z) {
        return a(a(LoginCredentials.password(str, str2)), z);
    }

    public final Single<gnf> a(String str, String str2) {
        return a(a(LoginCredentials.spotifyToken(str, str2.getBytes(far.c))), false);
    }

    public final Single<gnf> a(String str) {
        return a(a(LoginCredentials.oneTimeToken(str)), true);
    }

    public final Single<gng> b(String str) {
        return b(a(LoginCredentials.phoneNumber(str)), false).f($$Lambda$hkt$JQI4XPz2QS9DUPNfNxvR8NIa6KI.INSTANCE);
    }

    public final Single<gng> b(String str, String str2) {
        Single verifyCode = this.b.verifyCode(str, str2);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return verifyCode.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient))).f($$Lambda$hkt$JQI4XPz2QS9DUPNfNxvR8NIa6KI.INSTANCE);
    }

    public final Single<gng> c(String str) {
        Single resendCode = this.b.resendCode(str);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return resendCode.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient))).f($$Lambda$hkt$JQI4XPz2QS9DUPNfNxvR8NIa6KI.INSTANCE);
    }

    private Single<gnf> a(LoginRequest loginRequest, boolean z) {
        return b(loginRequest, z).f($$Lambda$hkt$91RYMndtvEJ5sP5Wa7OEMKOk2qc.INSTANCE);
    }

    private Single<LoginResponse> b(LoginRequest loginRequest, boolean z) {
        this.e = z;
        this.c.a(z);
        Single login = this.b.login(loginRequest);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return login.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient)));
    }

    /* access modifiers changed from: private */
    public static void a(Error error) {
        if (error.status() == 1) {
            throw new AlreadyLoggedInException();
        }
    }

    /* access modifiers changed from: private */
    public static gnf a(LoginResponse loginResponse) {
        return (gnf) loginResponse.map($$Lambda$hkt$re4egGzpv9P8ffKHEgkZoVFprQ.INSTANCE, $$Lambda$hkt$7FBlP1MzBsj5w0GKcjVuS3yQ6E.INSTANCE, $$Lambda$hkt$n9jGGhsslv7FZOo3RAl6Kn557k.INSTANCE, $$Lambda$hkt$azcp4Lc476zkcVOcnPm6sb43dE.INSTANCE, $$Lambda$hkt$TWDypgccP1arSZhpJ0w8l6zqwE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gnf c(Error error) {
        SpotifyError spotifyError;
        int status = error.status();
        if (status == 17) {
            spotifyError = SpotifyError.LOGIN_REGION_MISMATCH;
        } else if (status == 19) {
            spotifyError = SpotifyError.LOGIN_BAD_CREDENTIALS;
        } else if (status == 23) {
            spotifyError = SpotifyError.LOGIN_ACCOUNT_EXISTS;
        } else if (status == 29) {
            spotifyError = SpotifyError.AP_PROTOCOL;
        } else if (status != 31) {
            switch (status) {
                case 1:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    spotifyError = SpotifyError.UNKNOWN;
                    break;
                case 2:
                    spotifyError = SpotifyError.LOGIN_BAD_CREDENTIALS;
                    break;
                case 3:
                case 11:
                    spotifyError = SpotifyError.LOGIN_BAD_CREDENTIALS;
                    break;
                case 4:
                    spotifyError = SpotifyError.LOGIN_ACCOUNT_EXISTS;
                    break;
                default:
                    switch (status) {
                        case 37:
                            spotifyError = SpotifyError.AP_SOCKET;
                            break;
                        case 38:
                            spotifyError = SpotifyError.LOGIN_USERPASS;
                            break;
                        case 39:
                            spotifyError = SpotifyError.AP_NETWORK_DISABLED;
                            break;
                        default:
                            spotifyError = SpotifyError.UNKNOWN;
                            break;
                    }
            }
        } else {
            spotifyError = SpotifyError.DNS;
        }
        if (spotifyError == SpotifyError.UNKNOWN) {
            Assertion.c(String.format(Locale.US, "The operation couldn’t be completed. Error: %d, %s, SpotifyError: %d", new Object[]{Integer.valueOf(error.status()), error.error(), Integer.valueOf(spotifyError.mCode)}));
        }
        a(error);
        return new a(spotifyError.mCode);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gnf b(CodeSuccess codeSuccess) {
        throw new UnsupportedOperationException("code success is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gnf b(CodeRequired codeRequired) {
        throw new UnsupportedOperationException("code required is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gnf b(BootstrapRequired bootstrapRequired) {
        throw new UnsupportedOperationException("bootstrap required is not implemented");
    }

    /* access modifiers changed from: private */
    public static gng b(LoginResponse loginResponse) {
        return (gng) loginResponse.map($$Lambda$hkt$j9qgTAgcFMbx41uV1Gamy2NPJM.INSTANCE, $$Lambda$hkt$HZNSHJXbflVb0tRR5DJsQXHWkEA.INSTANCE, $$Lambda$hkt$L3v4eW4kofCVGqDciJ0rj6e_mOU.INSTANCE, $$Lambda$hkt$WPPFn5wMxeYfK88iDdgDGRSd7w.INSTANCE, $$Lambda$hkt$pHCBacAiFOKjYMKWWNsUpu2YBI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gng a(CodeSuccess codeSuccess) {
        return new b(codeSuccess.identifierToken());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gng a(CodeRequired codeRequired) {
        a aVar = new a(codeRequired.challengeId(), codeRequired.codeLength(), codeRequired.canonicalPhoneNumber(), codeRequired.expiresIn());
        return aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gng a(BootstrapRequired bootstrapRequired) {
        throw new UnsupportedOperationException("bootstrap required is not implemented");
    }

    private LoginRequest a(LoginCredentials loginCredentials) {
        return LoginRequest.create(loginCredentials, this.a.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gng a(Success success) {
        return new d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gnf b(Success success) {
        return new b();
    }
}
