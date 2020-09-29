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
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import java.util.UUID;

/* renamed from: hnl reason: default package */
public final class hnl implements got {
    private final hnq a;
    private final SessionClient b;
    private final nxs c;
    private final BootstrapHandler d;
    private final gbm e;
    private boolean f;

    public hnl(hnq hnq, SessionClient sessionClient, nxs nxs, BootstrapHandler bootstrapHandler, gbm gbm) {
        this.a = hnq;
        this.b = sessionClient;
        this.c = nxs;
        this.d = bootstrapHandler;
        this.e = gbm;
    }

    private LoginRequest a(LoginCredentials loginCredentials) {
        return LoginRequest.create(loginCredentials, this.a.a());
    }

    /* access modifiers changed from: private */
    public static gou a(LoginResponse loginResponse) {
        return (gou) loginResponse.map($$Lambda$hnl$VEVeBsWx7LILZOag19xZbSRt_IU.INSTANCE, $$Lambda$hnl$PlyS5o2nwq4lmN3TILiTdldMxbE.INSTANCE, $$Lambda$hnl$1ZNxsT5AkApR6jkmm2TU04fdjXQ.INSTANCE, $$Lambda$hnl$sQNP8d22iRS3Bf_f44fDYmKVebI.INSTANCE, $$Lambda$hnl$KXg5obArergkiMTvZMUyEoju21o.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gov a(BootstrapRequired bootstrapRequired) {
        throw new UnsupportedOperationException("bootstrap required is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gov a(CodeRequired codeRequired) {
        a aVar = new a(codeRequired.challengeId(), codeRequired.codeLength(), codeRequired.canonicalPhoneNumber(), codeRequired.expiresIn());
        return aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gov a(CodeSuccess codeSuccess) {
        return new b(codeSuccess.identifierToken());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gov a(Success success) {
        return new d();
    }

    private Single<gou> a(LoginRequest loginRequest, boolean z) {
        return b(loginRequest, z).f($$Lambda$hnl$6gML8995Ibc7B6A_M55DjFA9QZQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static void a(Error error) {
        if (error.status() == 1) {
            throw new AlreadyLoggedInException();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar) {
        this.e.a(new c(), str, aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar) {
        this.e.b(new c(), str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, gou gou) {
        gou.a((ged<b>) new $$Lambda$hnl$kqJX6dVrZb8FAwOGPqoWPNLyXR0<b>(this, str), (ged<a>) new $$Lambda$hnl$wb9LZEDTaMJP5rSFOAMjEquulBE<a>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Disposable disposable) {
        this.e.a(new c(), str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gou b(BootstrapRequired bootstrapRequired) {
        throw new UnsupportedOperationException("bootstrap required is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gou b(CodeRequired codeRequired) {
        throw new UnsupportedOperationException("code required is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gou b(CodeSuccess codeSuccess) {
        throw new UnsupportedOperationException("code success is not implemented");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gou b(Success success) {
        return new b();
    }

    /* access modifiers changed from: private */
    public static gov b(LoginResponse loginResponse) {
        return (gov) loginResponse.map($$Lambda$hnl$xbfhfdZgvhXIhj9_uEiAeIWV4hM.INSTANCE, $$Lambda$hnl$70bWfx0wu_pIqd9JaVn9Uc_bcuc.INSTANCE, $$Lambda$hnl$Nz0eRIQqHCGqRH9HC1q1_XYZU4.INSTANCE, $$Lambda$hnl$ftX0eAYptUGLn_38xl2KyVGep18.INSTANCE, $$Lambda$hnl$r7hmRMYfcLQEXjWJx8WsUWQOMA.INSTANCE);
    }

    private Single<LoginResponse> b(LoginRequest loginRequest, boolean z) {
        this.f = z;
        this.c.a(z);
        Single login = this.b.login(loginRequest);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return login.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, a aVar) {
        this.e.a(new a(), str, aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, b bVar) {
        this.e.b(new a(), str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, gou gou) {
        gou.a((ged<b>) new $$Lambda$hnl$927dwwLI5Kh_Ei71WjlxpE1YWw<b>(this, str), (ged<a>) new $$Lambda$hnl$dtEfgMM0Ky_MindypHL9H9l2914<a>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, Disposable disposable) {
        this.e.a(new a(), str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gou c(Error error) {
        SpotifyError spotifyError;
        int status = error.status();
        if (status == 19) {
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
                        case 14:
                            break;
                        case 15:
                        case 16:
                            spotifyError = SpotifyError.AP_PROTOCOL;
                            break;
                        case 17:
                            spotifyError = SpotifyError.LOGIN_REGION_MISMATCH;
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
                    spotifyError = SpotifyError.UNKNOWN;
                    break;
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
    public /* synthetic */ void c(String str, a aVar) {
        this.e.a(new b(), str, aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, b bVar) {
        this.e.b(new b(), str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, gou gou) {
        gou.a((ged<b>) new $$Lambda$hnl$2bVPvSQTpks29jitWEk0re9mo7o<b>(this, str), (ged<a>) new $$Lambda$hnl$Y_Y5QmsJ4qbBNNEtfN1EpQdIQcU<a>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, Disposable disposable) {
        this.e.a(new b(), str);
    }

    public final Single<gou> a(String str) {
        return a(a(LoginCredentials.oneTimeToken(str)), true);
    }

    public final Single<gou> a(String str, String str2) {
        String uuid = UUID.randomUUID().toString();
        return a(a(LoginCredentials.spotifyToken(str, str2.getBytes(fbi.c))), false).a((Consumer<? super Disposable>) new $$Lambda$hnl$gzfHV4LLgNaXQ8CMISFdsIBpr8k<Object>(this, uuid)).b((Consumer<? super T>) new $$Lambda$hnl$Mbmkp709dJdTF3OtlzPnwehMFE<Object>(this, uuid));
    }

    public final Single<gou> a(String str, String str2, boolean z) {
        String uuid = UUID.randomUUID().toString();
        return a(a(LoginCredentials.facebook(str, str2)), z).a((Consumer<? super Disposable>) new $$Lambda$hnl$jy7K0Eu6ZpILLdp5lCUeYkzqdNo<Object>(this, uuid)).b((Consumer<? super T>) new $$Lambda$hnl$bNx0EeE8p8PzjYCWKeKafZoxzHk<Object>(this, uuid));
    }

    public final Single<gov> b(String str) {
        return b(a(LoginCredentials.phoneNumber(str)), false).f($$Lambda$hnl$f665fG0vTLTyTwO58qiXRewFk.INSTANCE);
    }

    public final Single<gov> b(String str, String str2) {
        Single verifyCode = this.b.verifyCode(str, str2);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return verifyCode.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient))).f($$Lambda$hnl$f665fG0vTLTyTwO58qiXRewFk.INSTANCE);
    }

    public final Single<gou> b(String str, String str2, boolean z) {
        String uuid = UUID.randomUUID().toString();
        return a(a(LoginCredentials.password(str, str2)), z).a((Consumer<? super Disposable>) new $$Lambda$hnl$rbMksLiAhu6D3cbS1R2twDlYcAs<Object>(this, uuid)).b((Consumer<? super T>) new $$Lambda$hnl$AwrKxS05BUEScaNhm_cIxGE9_Z4<Object>(this, uuid));
    }

    public final Single<gov> c(String str) {
        Single resendCode = this.b.resendCode(str);
        BootstrapHandler bootstrapHandler = this.d;
        SessionClient sessionClient = this.b;
        sessionClient.getClass();
        return resendCode.a(bootstrapHandler.continueWith(new $$Lambda$d6yCDX_aIN3WJfuKqwQIw4vM4(sessionClient))).f($$Lambda$hnl$f665fG0vTLTyTwO58qiXRewFk.INSTANCE);
    }
}
