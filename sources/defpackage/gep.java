package defpackage;

import com.spotify.cosmos.session.SessionClient;

/* renamed from: gep reason: default package */
public final class gep implements wig<geo> {
    private final wzi<SessionClient> a;

    private gep(wzi<SessionClient> wzi) {
        this.a = wzi;
    }

    public static gep a(wzi<SessionClient> wzi) {
        return new gep(wzi);
    }

    public final /* synthetic */ Object get() {
        return new geo((SessionClient) this.a.get());
    }
}
