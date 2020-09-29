package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: njk reason: default package */
public final class njk implements vua<njj> {
    private final wlc<Boolean> a;
    private final wlc<Scheduler> b;
    private final wlc<ndk> c;
    private final wlc<ndb> d;
    private final wlc<ndl> e;
    private final wlc<nde> f;
    private final wlc<niy> g;
    private final wlc<nel> h;
    private final wlc<Observable<ned>> i;
    private final wlc<nea> j;
    private final wlc<wud<RecentlyPlayedItems>> k;

    private njk(wlc<Boolean> wlc, wlc<Scheduler> wlc2, wlc<ndk> wlc3, wlc<ndb> wlc4, wlc<ndl> wlc5, wlc<nde> wlc6, wlc<niy> wlc7, wlc<nel> wlc8, wlc<Observable<ned>> wlc9, wlc<nea> wlc10, wlc<wud<RecentlyPlayedItems>> wlc11) {
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
    }

    public static njk a(wlc<Boolean> wlc, wlc<Scheduler> wlc2, wlc<ndk> wlc3, wlc<ndb> wlc4, wlc<ndl> wlc5, wlc<nde> wlc6, wlc<niy> wlc7, wlc<nel> wlc8, wlc<Observable<ned>> wlc9, wlc<nea> wlc10, wlc<wud<RecentlyPlayedItems>> wlc11) {
        njk njk = new njk(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return njk;
    }

    public final /* synthetic */ Object get() {
        njj njj = new njj(((Boolean) this.a.get()).booleanValue(), (Scheduler) this.b.get(), (ndk) this.c.get(), (ndb) this.d.get(), (ndl) this.e.get(), (nde) this.f.get(), (niy) this.g.get(), (nel) this.h.get(), (Observable) this.i.get(), (nea) this.j.get(), (wud) this.k.get());
        return njj;
    }
}
