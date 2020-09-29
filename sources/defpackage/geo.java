package defpackage;

import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginRequest;
import io.reactivex.Single;

/* renamed from: geo reason: default package */
public final class geo {
    private final SessionClient a;

    public geo(SessionClient sessionClient) {
        this.a = sessionClient;
    }

    public final Single<Boolean> a(String str) {
        return this.a.login(LoginRequest.create(LoginCredentials.oneTimeToken(str))).f($$Lambda$Ncl3TRCK02BF7SR4Y1V10rtExQc.INSTANCE);
    }
}
