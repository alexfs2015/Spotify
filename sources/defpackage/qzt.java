package defpackage;

import android.content.Context;

/* renamed from: qzt reason: default package */
public final class qzt implements vua<qzs> {
    private final wlc<Context> a;
    private final wlc<kxg> b;
    private final wlc<jpb> c;
    private final wlc<sih> d;
    private final wlc<qzx> e;
    private final wlc<jmd> f;

    private qzt(wlc<Context> wlc, wlc<kxg> wlc2, wlc<jpb> wlc3, wlc<sih> wlc4, wlc<qzx> wlc5, wlc<jmd> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qzt a(wlc<Context> wlc, wlc<kxg> wlc2, wlc<jpb> wlc3, wlc<sih> wlc4, wlc<qzx> wlc5, wlc<jmd> wlc6) {
        qzt qzt = new qzt(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qzt;
    }

    public final /* synthetic */ Object get() {
        qzs qzs = new qzs((Context) this.a.get(), (kxg) this.b.get(), (jpb) this.c.get(), (sih) this.d.get(), (qzx) this.e.get(), (jmd) this.f.get());
        return qzs;
    }
}
