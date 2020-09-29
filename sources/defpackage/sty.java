package defpackage;

import android.view.View;

/* renamed from: sty reason: default package */
public final class sty implements wig<stx> {
    private final wzi<View> a;
    private final wzi<stz> b;
    private final wzi<sto> c;
    private final wzi<str> d;
    private final wzi<sue> e;
    private final wzi<String> f;
    private final wzi<stv> g;

    private sty(wzi<View> wzi, wzi<stz> wzi2, wzi<sto> wzi3, wzi<str> wzi4, wzi<sue> wzi5, wzi<String> wzi6, wzi<stv> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static sty a(wzi<View> wzi, wzi<stz> wzi2, wzi<sto> wzi3, wzi<str> wzi4, wzi<sue> wzi5, wzi<String> wzi6, wzi<stv> wzi7) {
        sty sty = new sty(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return sty;
    }

    public final /* synthetic */ Object get() {
        stx stx = new stx(wif.b(this.a), (stz) this.b.get(), (sto) this.c.get(), (str) this.d.get(), (sue) this.e.get(), (String) this.f.get(), (stv) this.g.get());
        return stx;
    }
}
