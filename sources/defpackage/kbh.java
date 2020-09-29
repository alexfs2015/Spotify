package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import java.util.Arrays;

/* renamed from: kbh reason: default package */
public final class kbh implements wig<jzn> {
    private final wzi<Context> a;
    private final wzi<Looper> b;
    private final wzi<Picasso> c;
    private final wzi<kdt> d;
    private final wzi<gcb> e;
    private final wzi<Handler> f;
    private final wzi<keh> g;
    private final wzi<kep> h;
    private final wzi<giz> i;
    private final wzi<kad> j;
    private final wzi<kdp> k;
    private final wzi<kds> l;

    private kbh(wzi<Context> wzi, wzi<Looper> wzi2, wzi<Picasso> wzi3, wzi<kdt> wzi4, wzi<gcb> wzi5, wzi<Handler> wzi6, wzi<keh> wzi7, wzi<kep> wzi8, wzi<giz> wzi9, wzi<kad> wzi10, wzi<kdp> wzi11, wzi<kds> wzi12) {
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
        this.l = wzi12;
    }

    public static kbh a(wzi<Context> wzi, wzi<Looper> wzi2, wzi<Picasso> wzi3, wzi<kdt> wzi4, wzi<gcb> wzi5, wzi<Handler> wzi6, wzi<keh> wzi7, wzi<kep> wzi8, wzi<giz> wzi9, wzi<kad> wzi10, wzi<kdp> wzi11, wzi<kds> wzi12) {
        kbh kbh = new kbh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12);
        return kbh;
    }

    public final /* synthetic */ Object get() {
        kad kad = (kad) this.j.get();
        kdp kdp = (kdp) this.k.get();
        kds kds = (kds) this.l.get();
        jzn jzn = new jzn((Context) this.a.get(), (Looper) this.b.get(), ((giz) this.i.get()).b, (Picasso) this.c.get(), (kdt) this.d.get(), (gcb) this.e.get(), (Handler) this.f.get(), (keh) this.g.get(), (kep) this.h.get());
        jzn.g = kad;
        return (jzn) wil.a(jzn.b(Arrays.asList(new kdm[]{kdp, kds})), "Cannot return null from a non-@Nullable @Provides method");
    }
}
