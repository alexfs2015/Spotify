package defpackage;

import android.app.Activity;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;

/* renamed from: ouo reason: default package */
final class ouo implements b {
    private final wlc<Activity> a;
    private final wlc<ois> b;
    private final wlc<Scheduler> c;
    private final wlc<ouq> d;
    private final wlc<fyz> e;
    private final wlc<spi> f;
    private final wlc<hbj> g;
    private final wlc<tcn> h;
    private final wlc<ouw> i;
    private final wlc<OffliningLogger> j;
    private final wlc<ous> k;
    private final wlc<uhs> l;
    private final wlc<iww> m;
    private final wlc<ToastieManager> n;
    private final wlc<ouu> o;
    private final wlc<oul> p;
    private final wlc<uxh> q;
    private final wlc<uxt> r;
    private final wlc<jsz> s;
    private final wlc<oey> t;
    private final wlc<ofj> u;
    private final wlc<ouj> v;
    private final wlc<spg> w;

    ouo(wlc<Activity> wlc, wlc<ois> wlc2, wlc<Scheduler> wlc3, wlc<ouq> wlc4, wlc<fyz> wlc5, wlc<spi> wlc6, wlc<hbj> wlc7, wlc<tcn> wlc8, wlc<ouw> wlc9, wlc<OffliningLogger> wlc10, wlc<ous> wlc11, wlc<uhs> wlc12, wlc<iww> wlc13, wlc<ToastieManager> wlc14, wlc<ouu> wlc15, wlc<oul> wlc16, wlc<uxh> wlc17, wlc<uxt> wlc18, wlc<jsz> wlc19, wlc<oey> wlc20, wlc<ofj> wlc21, wlc<ouj> wlc22, wlc<spg> wlc23) {
        wlc<Activity> wlc24 = wlc;
        this.a = (wlc) a(wlc, 1);
        wlc<ois> wlc25 = wlc2;
        this.b = (wlc) a(wlc2, 2);
        wlc<Scheduler> wlc26 = wlc3;
        this.c = (wlc) a(wlc3, 3);
        wlc<ouq> wlc27 = wlc4;
        this.d = (wlc) a(wlc4, 4);
        wlc<fyz> wlc28 = wlc5;
        this.e = (wlc) a(wlc5, 5);
        wlc<spi> wlc29 = wlc6;
        this.f = (wlc) a(wlc6, 6);
        wlc<hbj> wlc30 = wlc7;
        this.g = (wlc) a(wlc7, 7);
        wlc<tcn> wlc31 = wlc8;
        this.h = (wlc) a(wlc8, 8);
        wlc<ouw> wlc32 = wlc9;
        this.i = (wlc) a(wlc9, 9);
        wlc<OffliningLogger> wlc33 = wlc10;
        this.j = (wlc) a(wlc10, 10);
        wlc<ous> wlc34 = wlc11;
        this.k = (wlc) a(wlc11, 11);
        wlc<uhs> wlc35 = wlc12;
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
        this.o = (wlc) a(wlc15, 15);
        this.p = (wlc) a(wlc16, 16);
        this.q = (wlc) a(wlc17, 17);
        this.r = (wlc) a(wlc18, 18);
        this.s = (wlc) a(wlc19, 19);
        this.t = (wlc) a(wlc20, 20);
        this.u = (wlc) a(wlc21, 21);
        this.v = (wlc) a(wlc22, 22);
        this.w = (wlc) a(wlc23, 23);
    }

    private static <T> T a(T t2, int i2) {
        if (t2 != null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ova a(ohk ohk) {
        oun oun = new oun((Activity) a(this.a.get(), 1), (ois) a(this.b.get(), 2), (Scheduler) a(this.c.get(), 3), (ouq) a(this.d.get(), 4), (fyz) a(this.e.get(), 5), (spi) a(this.f.get(), 6), (hbj) a(this.g.get(), 7), (tcn) a(this.h.get(), 8), (ouw) a(this.i.get(), 9), (OffliningLogger) a(this.j.get(), 10), (ous) a(this.k.get(), 11), (uhs) a(this.l.get(), 12), (iww) a(this.m.get(), 13), (ToastieManager) a(this.n.get(), 14), (ouu) a(this.o.get(), 15), (oul) a(this.p.get(), 16), (uxh) a(this.q.get(), 17), (uxt) a(this.r.get(), 18), (jsz) a(this.s.get(), 19), (oey) a(this.t.get(), 20), (ofj) a(this.u.get(), 21), (ouj) a(this.v.get(), 22), (spg) a(this.w.get(), 23), (ohk) a(ohk, 24));
        return oun;
    }
}
