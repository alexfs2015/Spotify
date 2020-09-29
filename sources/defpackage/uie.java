package defpackage;

import android.content.Context;

/* renamed from: uie reason: default package */
public final class uie implements wig<uid> {
    private final wzi<Context> a;
    private final wzi<ugf> b;
    private final wzi<Boolean> c;
    private final wzi<uia> d;
    private final wzi<uif> e;
    private final wzi<ugi> f;
    private final wzi<uil> g;
    private final wzi<ufg> h;
    private final wzi<uex> i;

    private uie(wzi<Context> wzi, wzi<ugf> wzi2, wzi<Boolean> wzi3, wzi<uia> wzi4, wzi<uif> wzi5, wzi<ugi> wzi6, wzi<uil> wzi7, wzi<ufg> wzi8, wzi<uex> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static uie a(wzi<Context> wzi, wzi<ugf> wzi2, wzi<Boolean> wzi3, wzi<uia> wzi4, wzi<uif> wzi5, wzi<ugi> wzi6, wzi<uil> wzi7, wzi<ufg> wzi8, wzi<uex> wzi9) {
        uie uie = new uie(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return uie;
    }

    public final /* synthetic */ Object get() {
        uid uid = new uid((Context) this.a.get(), wif.b(this.b), ((Boolean) this.c.get()).booleanValue(), (uia) this.d.get(), (uif) this.e.get(), (ugi) this.f.get(), (uil) this.g.get(), (ufg) this.h.get(), (uex) this.i.get());
        return uid;
    }
}
