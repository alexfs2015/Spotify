package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: unu reason: default package */
public final class unu implements wig<unt> {
    private final wzi<Picasso> a;
    private final wzi<unp> b;
    private final wzi<uqh> c;
    private final wzi<upd> d;
    private final wzi<uoi> e;
    private final wzi<Scheduler> f;
    private final wzi<ura> g;
    private final wzi<via> h;
    private final wzi<Context> i;
    private final wzi<izh> j;
    private final wzi<uod> k;
    private final wzi<fqn> l;

    private unu(wzi<Picasso> wzi, wzi<unp> wzi2, wzi<uqh> wzi3, wzi<upd> wzi4, wzi<uoi> wzi5, wzi<Scheduler> wzi6, wzi<ura> wzi7, wzi<via> wzi8, wzi<Context> wzi9, wzi<izh> wzi10, wzi<uod> wzi11, wzi<fqn> wzi12) {
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

    public static unu a(wzi<Picasso> wzi, wzi<unp> wzi2, wzi<uqh> wzi3, wzi<upd> wzi4, wzi<uoi> wzi5, wzi<Scheduler> wzi6, wzi<ura> wzi7, wzi<via> wzi8, wzi<Context> wzi9, wzi<izh> wzi10, wzi<uod> wzi11, wzi<fqn> wzi12) {
        unu unu = new unu(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12);
        return unu;
    }

    public final /* synthetic */ Object get() {
        unt unt = new unt((Picasso) this.a.get(), (unp) this.b.get(), (uqh) this.c.get(), (upd) this.d.get(), (uoi) this.e.get(), (Scheduler) this.f.get(), (ura) this.g.get(), (via) this.h.get(), (Context) this.i.get(), (izh) this.j.get(), (uod) this.k.get(), (fqn) this.l.get());
        return unt;
    }
}
