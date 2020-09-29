package defpackage;

import android.content.res.Resources;
import com.squareup.picasso.Picasso;

/* renamed from: pjq reason: default package */
public final class pjq implements wig<pjp> {
    private final wzi<Resources> a;
    private final wzi<ues> b;
    private final wzi<Picasso> c;
    private final wzi<fyh> d;
    private final wzi<a> e;
    private final wzi<a> f;

    private pjq(wzi<Resources> wzi, wzi<ues> wzi2, wzi<Picasso> wzi3, wzi<fyh> wzi4, wzi<a> wzi5, wzi<a> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static pjq a(wzi<Resources> wzi, wzi<ues> wzi2, wzi<Picasso> wzi3, wzi<fyh> wzi4, wzi<a> wzi5, wzi<a> wzi6) {
        pjq pjq = new pjq(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return pjq;
    }

    public final /* synthetic */ Object get() {
        pjp pjp = new pjp((Resources) this.a.get(), (ues) this.b.get(), (Picasso) this.c.get(), wif.b(this.d), wif.b(this.e), wif.b(this.f));
        return pjp;
    }
}
