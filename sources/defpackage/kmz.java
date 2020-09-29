package defpackage;

import android.content.Context;

/* renamed from: kmz reason: default package */
public final class kmz implements vua<kmy> {
    private final wlc<Context> a;
    private final wlc<rvv> b;

    private kmz(wlc<Context> wlc, wlc<rvv> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kmz a(wlc<Context> wlc, wlc<rvv> wlc2) {
        return new kmz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kmy((Context) this.a.get(), (rvv) this.b.get());
    }
}
