package defpackage;

import android.content.Context;

/* renamed from: lsf reason: default package */
public final class lsf implements vua<lse> {
    private final wlc<Context> a;
    private final wlc<fpt> b;

    private lsf(wlc<Context> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lsf a(wlc<Context> wlc, wlc<fpt> wlc2) {
        return new lsf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lse((Context) this.a.get(), (fpt) this.b.get());
    }
}
