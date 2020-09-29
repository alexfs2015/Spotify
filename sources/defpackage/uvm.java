package defpackage;

import com.spotify.cosmos.router.Request;

/* renamed from: uvm reason: default package */
public final class uvm implements wig<Request> {
    private final wzi<juc> a;

    private uvm(wzi<juc> wzi) {
        this.a = wzi;
    }

    public static uvm a(wzi<juc> wzi) {
        return new uvm(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Request) wil.a(CC.a((juc) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
