package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableTransformer;

/* renamed from: myj reason: default package */
public final class myj implements wig<hhm<hcs>> {
    private final wzi<lny> a;
    private final wzi<Boolean> b;
    private final wzi<Boolean> c;
    private final wzi<rof> d;
    private final wzi<nad> e;
    private final wzi<roa> f;
    private final wzi<mzk> g;
    private final wzi<mzq> h;
    private final wzi<mzg> i;
    private final wzi<heg> j;
    private final wzi<rmq> k;

    private myj(wzi<lny> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<rof> wzi4, wzi<nad> wzi5, wzi<roa> wzi6, wzi<mzk> wzi7, wzi<mzq> wzi8, wzi<mzg> wzi9, wzi<heg> wzi10, wzi<rmq> wzi11) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
    }

    public static myj a(wzi<lny> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<rof> wzi4, wzi<nad> wzi5, wzi<roa> wzi6, wzi<mzk> wzi7, wzi<mzq> wzi8, wzi<mzg> wzi9, wzi<heg> wzi10, wzi<rmq> wzi11) {
        myj myj = new myj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return myj;
    }

    public final /* synthetic */ Object get() {
        lny lny = (lny) this.a.get();
        boolean booleanValue = ((Boolean) this.b.get()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.c.get()).booleanValue();
        who b2 = wif.b(this.d);
        who b3 = wif.b(this.e);
        who b4 = wif.b(this.f);
        who b5 = wif.b(this.g);
        who b6 = wif.b(this.h);
        who b7 = wif.b(this.i);
        heg heg = (heg) this.j.get();
        who b8 = wif.b(this.k);
        a aVar = new a();
        if (booleanValue2) {
            aVar.a((c) b4.get());
            aVar.a(wit.a((ObservableTransformer) b7.get(), BackpressureStrategy.BUFFER));
        } else {
            aVar.a((c) b2.get());
        }
        if (booleanValue) {
            aVar.a((c) b3.get());
            aVar.a((c) b5.get());
        }
        if (heg.a() && (!jvi.b(lny.a) || jvi.c(lny.a))) {
            aVar.a((c) b8.get());
        }
        if (jvi.c(lny.a) && jvi.b(lny.a)) {
            aVar.a((c) b6.get());
        }
        return (hhm) wil.a(hhm.a(aVar.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
