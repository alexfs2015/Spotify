package defpackage;

import android.content.Context;

/* renamed from: ony reason: default package */
public final class ony implements vua<onx> {
    private final wlc<Context> a;
    private final wlc<fss> b;

    private ony(wlc<Context> wlc, wlc<fss> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ony a(wlc<Context> wlc, wlc<fss> wlc2) {
        return new ony(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new onx((Context) this.a.get(), (fss) this.b.get());
    }
}
