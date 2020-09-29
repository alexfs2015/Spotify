package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: onk reason: default package */
public final class onk implements a {
    private final wlc<sih> a;
    private final wlc<String> b;
    private final wlc<spi> c;
    private final wlc<onm> d;
    private final wlc<Scheduler> e;
    private final wlc<kxc> f;
    private final wlc<txc> g;
    private final wlc<ofa> h;
    private final wlc<kxi> i;
    private final wlc<jmq> j;
    private final wlc<lkn> k;
    private final wlc<onx> l;
    private final wlc<tcn> m;
    private final wlc<kxm> n;
    private final wlc<List<b>> o;

    public onk(wlc<sih> wlc, wlc<String> wlc2, wlc<spi> wlc3, wlc<onm> wlc4, wlc<Scheduler> wlc5, wlc<kxc> wlc6, wlc<txc> wlc7, wlc<ofa> wlc8, wlc<kxi> wlc9, wlc<jmq> wlc10, wlc<lkn> wlc11, wlc<onx> wlc12, wlc<tcn> wlc13, wlc<kxm> wlc14, wlc<List<b>> wlc15) {
        wlc<sih> wlc16 = wlc;
        this.a = (wlc) a(wlc, 1);
        wlc<String> wlc17 = wlc2;
        this.b = (wlc) a(wlc2, 2);
        wlc<spi> wlc18 = wlc3;
        this.c = (wlc) a(wlc3, 3);
        wlc<onm> wlc19 = wlc4;
        this.d = (wlc) a(wlc4, 4);
        wlc<Scheduler> wlc20 = wlc5;
        this.e = (wlc) a(wlc5, 5);
        wlc<kxc> wlc21 = wlc6;
        this.f = (wlc) a(wlc6, 6);
        wlc<txc> wlc22 = wlc7;
        this.g = (wlc) a(wlc7, 7);
        wlc<ofa> wlc23 = wlc8;
        this.h = (wlc) a(wlc8, 8);
        wlc<kxi> wlc24 = wlc9;
        this.i = (wlc) a(wlc9, 9);
        wlc<jmq> wlc25 = wlc10;
        this.j = (wlc) a(wlc10, 10);
        wlc<lkn> wlc26 = wlc11;
        this.k = (wlc) a(wlc11, 11);
        wlc<onx> wlc27 = wlc12;
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
        this.o = (wlc) a(wlc15, 15);
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oni a(ItemListConfiguration itemListConfiguration) {
        onj onj = new onj((sih) a(this.a.get(), 1), (String) a(this.b.get(), 2), (spi) a(this.c.get(), 3), (onm) a(this.d.get(), 4), (Scheduler) a(this.e.get(), 5), (kxc) a(this.f.get(), 6), (txc) a(this.g.get(), 7), (ofa) a(this.h.get(), 8), (kxi) a(this.i.get(), 9), (jmq) a(this.j.get(), 10), (lkn) a(this.k.get(), 11), (onx) a(this.l.get(), 12), (tcn) a(this.m.get(), 13), (kxm) a(this.n.get(), 14), (List) a(this.o.get(), 15), (ItemListConfiguration) a(itemListConfiguration, 16));
        return onj;
    }
}
