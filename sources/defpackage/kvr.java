package defpackage;

import java.util.concurrent.Callable;

/* renamed from: kvr reason: default package */
public final class kvr implements vua<Callable<Boolean>> {
    private final wlc<fpt> a;
    private final wlc<kvb> b;

    private kvr(wlc<fpt> wlc, wlc<kvb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kvr a(wlc<fpt> wlc, wlc<kvb> wlc2) {
        return new kvr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Callable) vuf.a(CC.a((fpt) this.a.get(), (kvb) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
