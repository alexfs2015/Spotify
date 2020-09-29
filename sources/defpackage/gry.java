package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import io.reactivex.Observable;

/* renamed from: gry reason: default package */
public final class gry implements vua<grx> {
    private final wlc<Context> a;
    private final wlc<grp> b;
    private final wlc<rur> c;
    private final wlc<ImmutableSet<mfh>> d;
    private final wlc<mfe> e;
    private final wlc<DiscoveryConfiguration> f;
    private final wlc<hec> g;
    private final wlc<mfq> h;
    private final wlc<Observable<ConnectionType>> i;
    private final wlc<wug> j;
    private final wlc<ufm> k;

    private gry(wlc<Context> wlc, wlc<grp> wlc2, wlc<rur> wlc3, wlc<ImmutableSet<mfh>> wlc4, wlc<mfe> wlc5, wlc<DiscoveryConfiguration> wlc6, wlc<hec> wlc7, wlc<mfq> wlc8, wlc<Observable<ConnectionType>> wlc9, wlc<wug> wlc10, wlc<ufm> wlc11) {
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

    public static gry a(wlc<Context> wlc, wlc<grp> wlc2, wlc<rur> wlc3, wlc<ImmutableSet<mfh>> wlc4, wlc<mfe> wlc5, wlc<DiscoveryConfiguration> wlc6, wlc<hec> wlc7, wlc<mfq> wlc8, wlc<Observable<ConnectionType>> wlc9, wlc<wug> wlc10, wlc<ufm> wlc11) {
        gry gry = new gry(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return gry;
    }

    public final /* synthetic */ Object get() {
        grx grx = new grx((Context) this.a.get(), (grp) this.b.get(), (rur) this.c.get(), (ImmutableSet) this.d.get(), (mfe) this.e.get(), (DiscoveryConfiguration) this.f.get(), (hec) this.g.get(), (mfq) this.h.get(), (Observable) this.i.get(), (wug) this.j.get(), (ufm) this.k.get());
        return grx;
    }
}
