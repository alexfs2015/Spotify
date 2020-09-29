package defpackage;

import com.spotify.cosmos.router.Request;

/* renamed from: ukb reason: default package */
public final class ukb implements vua<Request> {
    private final wlc<jrs> a;

    private ukb(wlc<jrs> wlc) {
        this.a = wlc;
    }

    public static ukb a(wlc<jrs> wlc) {
        return new ukb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Request) vuf.a(CC.a((jrs) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
