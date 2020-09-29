package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Scheduler;

/* renamed from: uaz reason: default package */
public final class uaz implements vua<uay> {
    private final wlc<Picasso> a;
    private final wlc<uau> b;
    private final wlc<udm> c;
    private final wlc<uci> d;
    private final wlc<ubn> e;
    private final wlc<Scheduler> f;
    private final wlc<ufm> g;
    private final wlc<uwj> h;
    private final wlc<Context> i;
    private final wlc<iww> j;
    private final wlc<ubi> k;
    private final wlc<fpt> l;

    private uaz(wlc<Picasso> wlc, wlc<uau> wlc2, wlc<udm> wlc3, wlc<uci> wlc4, wlc<ubn> wlc5, wlc<Scheduler> wlc6, wlc<ufm> wlc7, wlc<uwj> wlc8, wlc<Context> wlc9, wlc<iww> wlc10, wlc<ubi> wlc11, wlc<fpt> wlc12) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
    }

    public static uaz a(wlc<Picasso> wlc, wlc<uau> wlc2, wlc<udm> wlc3, wlc<uci> wlc4, wlc<ubn> wlc5, wlc<Scheduler> wlc6, wlc<ufm> wlc7, wlc<uwj> wlc8, wlc<Context> wlc9, wlc<iww> wlc10, wlc<ubi> wlc11, wlc<fpt> wlc12) {
        uaz uaz = new uaz(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12);
        return uaz;
    }

    public final /* synthetic */ Object get() {
        uay uay = new uay((Picasso) this.a.get(), (uau) this.b.get(), (udm) this.c.get(), (uci) this.d.get(), (ubn) this.e.get(), (Scheduler) this.f.get(), (ufm) this.g.get(), (uwj) this.h.get(), (Context) this.i.get(), (iww) this.j.get(), (ubi) this.k.get(), (fpt) this.l.get());
        return uay;
    }
}
