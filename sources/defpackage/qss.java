package defpackage;

import android.content.Context;

/* renamed from: qss reason: default package */
public final class qss implements vua<qsr> {
    private final wlc<Context> a;
    private final wlc<jpb> b;
    private final wlc<uqz> c;
    private final wlc<rgz> d;
    private final wlc<twu> e;
    private final wlc<uqi> f;

    private qss(wlc<Context> wlc, wlc<jpb> wlc2, wlc<uqz> wlc3, wlc<rgz> wlc4, wlc<twu> wlc5, wlc<uqi> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qss a(wlc<Context> wlc, wlc<jpb> wlc2, wlc<uqz> wlc3, wlc<rgz> wlc4, wlc<twu> wlc5, wlc<uqi> wlc6) {
        qss qss = new qss(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qss;
    }

    public final /* synthetic */ Object get() {
        qsr qsr = new qsr((Context) this.a.get(), (jpb) this.b.get(), (uqz) this.c.get(), (rgz) this.d.get(), (twu) this.e.get(), (uqi) this.f.get());
        return qsr;
    }
}
