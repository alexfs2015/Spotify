package defpackage;

import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginRequest;
import io.reactivex.Single;

/* renamed from: gdd reason: default package */
public final class gdd {
    private final SessionClient a;

    public gdd(SessionClient sessionClient) {
        this.a = sessionClient;
    }

    public final Single<Boolean> a(String str) {
        return this.a.login(LoginRequest.create(LoginCredentials.oneTimeToken(str))).f($$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc.INSTANCE);
    }
}
