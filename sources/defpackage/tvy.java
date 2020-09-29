package defpackage;

import android.content.Context;

/* renamed from: tvy reason: default package */
public final class tvy implements vua<tvx> {
    private final wlc<Context> a;
    private final wlc<rxw> b;

    private tvy(wlc<Context> wlc, wlc<rxw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tvy a(wlc<Context> wlc, wlc<rxw> wlc2) {
        return new tvy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tvx((Context) this.a.get(), (rxw) this.b.get());
    }
}
