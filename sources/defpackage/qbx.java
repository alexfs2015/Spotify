package defpackage;

import android.content.Context;

/* renamed from: qbx reason: default package */
public final class qbx implements vua<qbw> {
    private final wlc<Context> a;
    private final wlc<fpt> b;
    private final wlc<shg> c;
    private final wlc<Boolean> d;
    private final wlc<Boolean> e;

    private qbx(wlc<Context> wlc, wlc<fpt> wlc2, wlc<shg> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static qbx a(wlc<Context> wlc, wlc<fpt> wlc2, wlc<shg> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5) {
        qbx qbx = new qbx(wlc, wlc2, wlc3, wlc4, wlc5);
        return qbx;
    }

    public final /* synthetic */ Object get() {
        qbw qbw = new qbw((Context) this.a.get(), (fpt) this.b.get(), (shg) this.c.get(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue());
        return qbw;
    }
}
