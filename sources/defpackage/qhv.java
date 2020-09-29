package defpackage;

import android.content.Context;

/* renamed from: qhv reason: default package */
public final class qhv implements vua<qhu> {
    private final wlc<kf> a;
    private final wlc<Integer> b;
    private final wlc<fpt> c;
    private final wlc<Context> d;

    private qhv(wlc<kf> wlc, wlc<Integer> wlc2, wlc<fpt> wlc3, wlc<Context> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qhv a(wlc<kf> wlc, wlc<Integer> wlc2, wlc<fpt> wlc3, wlc<Context> wlc4) {
        return new qhv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qhu((kf) this.a.get(), ((Integer) this.b.get()).intValue(), (fpt) this.c.get(), (Context) this.d.get());
    }
}
