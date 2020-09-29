package defpackage;

import android.content.Context;

/* renamed from: mhe reason: default package */
public final class mhe implements vua<mhd> {
    private final wlc<Context> a;
    private final wlc<fpt> b;

    private mhe(wlc<Context> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mhe a(wlc<Context> wlc, wlc<fpt> wlc2) {
        return new mhe(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mhd((Context) this.a.get(), (fpt) this.b.get());
    }
}
