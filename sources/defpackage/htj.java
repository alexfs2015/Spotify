package defpackage;

import android.content.Context;

/* renamed from: htj reason: default package */
public final class htj implements wig<hti> {
    private final wzi<Context> a;
    private final wzi<sgt> b;
    private final wzi<gux> c;
    private final wzi<glo> d;
    private final wzi<hrc> e;

    private htj(wzi<Context> wzi, wzi<sgt> wzi2, wzi<gux> wzi3, wzi<glo> wzi4, wzi<hrc> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static htj a(wzi<Context> wzi, wzi<sgt> wzi2, wzi<gux> wzi3, wzi<glo> wzi4, wzi<hrc> wzi5) {
        htj htj = new htj(wzi, wzi2, wzi3, wzi4, wzi5);
        return htj;
    }

    public final /* synthetic */ Object get() {
        hti hti = new hti((Context) this.a.get(), (sgt) this.b.get(), (gux) this.c.get(), (glo) this.d.get(), (hrc) this.e.get());
        return hti;
    }
}
