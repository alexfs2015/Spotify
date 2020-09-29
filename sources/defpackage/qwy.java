package defpackage;

import android.content.Context;

/* renamed from: qwy reason: default package */
public final class qwy implements vua<qwx> {
    private final wlc<Context> a;
    private final wlc<jvy> b;

    private qwy(wlc<Context> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qwy a(wlc<Context> wlc, wlc<jvy> wlc2) {
        return new qwy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qwx((Context) this.a.get(), (jvy) this.b.get());
    }
}
