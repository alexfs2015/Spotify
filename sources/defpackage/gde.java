package defpackage;

import com.spotify.cosmos.session.SessionClient;

/* renamed from: gde reason: default package */
public final class gde implements vua<gdd> {
    private final wlc<SessionClient> a;

    private gde(wlc<SessionClient> wlc) {
        this.a = wlc;
    }

    public static gde a(wlc<SessionClient> wlc) {
        return new gde(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gdd((SessionClient) this.a.get());
    }
}
