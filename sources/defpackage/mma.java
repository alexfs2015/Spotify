package defpackage;

import android.content.Context;

/* renamed from: mma reason: default package */
public final class mma implements vua<mlz> {
    private final wlc<Context> a;
    private final wlc<heo> b;

    private mma(wlc<Context> wlc, wlc<heo> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mma a(wlc<Context> wlc, wlc<heo> wlc2) {
        return new mma(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mlz((Context) this.a.get(), (heo) this.b.get());
    }
}
