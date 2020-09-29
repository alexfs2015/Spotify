package defpackage;

import android.content.Context;

/* renamed from: mie reason: default package */
public final class mie implements vua<mid> {
    private final wlc<Context> a;
    private final wlc<mia> b;

    private mie(wlc<Context> wlc, wlc<mia> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mie a(wlc<Context> wlc, wlc<mia> wlc2) {
        return new mie(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mid((Context) this.a.get(), (mia) this.b.get());
    }
}
