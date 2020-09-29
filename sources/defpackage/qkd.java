package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: qkd reason: default package */
public final class qkd implements vua<qkc> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;
    private final wlc<Integer> c;
    private final wlc<a> d;
    private final wlc<Scheduler> e;
    private final wlc<qkq> f;
    private final wlc<Observable<kxx>> g;
    private final wlc<qja> h;
    private final wlc<qix> i;
    private final wlc<qkv> j;
    private final wlc<jjn> k;
    private final wlc<qho> l;
    private final wlc<qhu> m;

    private qkd(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Integer> wlc3, wlc<a> wlc4, wlc<Scheduler> wlc5, wlc<qkq> wlc6, wlc<Observable<kxx>> wlc7, wlc<qja> wlc8, wlc<qix> wlc9, wlc<qkv> wlc10, wlc<jjn> wlc11, wlc<qho> wlc12, wlc<qhu> wlc13) {
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
        this.m = wlc13;
    }

    public static qkd a(wlc<Boolean> wlc, wlc<Boolean> wlc2, wlc<Integer> wlc3, wlc<a> wlc4, wlc<Scheduler> wlc5, wlc<qkq> wlc6, wlc<Observable<kxx>> wlc7, wlc<qja> wlc8, wlc<qix> wlc9, wlc<qkv> wlc10, wlc<jjn> wlc11, wlc<qho> wlc12, wlc<qhu> wlc13) {
        qkd qkd = new qkd(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13);
        return qkd;
    }

    public final /* synthetic */ Object get() {
        qkc qkc = new qkc(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Integer) this.c.get()).intValue(), (a) this.d.get(), (Scheduler) this.e.get(), (qkq) this.f.get(), (Observable) this.g.get(), (qja) this.h.get(), (qix) this.i.get(), (qkv) this.j.get(), (jjn) this.k.get(), (qho) this.l.get(), (qhu) this.m.get());
        return qkc;
    }
}
