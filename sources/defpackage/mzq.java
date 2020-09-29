package defpackage;

import android.content.Context;

/* renamed from: mzq reason: default package */
public final class mzq implements vua<Boolean> {
    private final wlc<Context> a;

    private mzq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mzq a(wlc<Context> wlc) {
        return new mzq(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.c((Context) this.a.get()));
    }
}
