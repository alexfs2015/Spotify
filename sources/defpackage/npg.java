package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Observable;

/* renamed from: npg reason: default package */
public final class npg implements wig<npf> {
    private final wzi<Boolean> a;
    private final wzi<niz> b;
    private final wzi<niq> c;
    private final wzi<nja> d;
    private final wzi<nit> e;
    private final wzi<nou> f;
    private final wzi<nka> g;
    private final wzi<Observable<njs>> h;
    private final wzi<njp> i;
    private final wzi<xii<RecentlyPlayedItems>> j;

    private npg(wzi<Boolean> wzi, wzi<niz> wzi2, wzi<niq> wzi3, wzi<nja> wzi4, wzi<nit> wzi5, wzi<nou> wzi6, wzi<nka> wzi7, wzi<Observable<njs>> wzi8, wzi<njp> wzi9, wzi<xii<RecentlyPlayedItems>> wzi10) {
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
    }

    public static npg a(wzi<Boolean> wzi, wzi<niz> wzi2, wzi<niq> wzi3, wzi<nja> wzi4, wzi<nit> wzi5, wzi<nou> wzi6, wzi<nka> wzi7, wzi<Observable<njs>> wzi8, wzi<njp> wzi9, wzi<xii<RecentlyPlayedItems>> wzi10) {
        npg npg = new npg(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return npg;
    }

    public final /* synthetic */ Object get() {
        npf npf = new npf(((Boolean) this.a.get()).booleanValue(), (niz) this.b.get(), (niq) this.c.get(), (nja) this.d.get(), (nit) this.e.get(), (nou) this.f.get(), (nka) this.g.get(), (Observable) this.h.get(), (njp) this.i.get(), (xii) this.j.get());
        return npf;
    }
}
