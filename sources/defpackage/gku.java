package defpackage;

import android.content.Context;

/* renamed from: gku reason: default package */
public final class gku implements wig<gkt> {
    private final wzi<Context> a;
    private final wzi<jlr> b;
    private final wzi<rmf> c;
    private final wzi<jtz> d;
    private final wzi<gkx> e;

    private gku(wzi<Context> wzi, wzi<jlr> wzi2, wzi<rmf> wzi3, wzi<jtz> wzi4, wzi<gkx> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static gku a(wzi<Context> wzi, wzi<jlr> wzi2, wzi<rmf> wzi3, wzi<jtz> wzi4, wzi<gkx> wzi5) {
        gku gku = new gku(wzi, wzi2, wzi3, wzi4, wzi5);
        return gku;
    }

    public final /* synthetic */ Object get() {
        gkt gkt = new gkt((Context) this.a.get(), (jlr) this.b.get(), (rmf) this.c.get(), (jtz) this.d.get(), (gkx) this.e.get());
        return gkt;
    }
}
