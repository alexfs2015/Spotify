package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import io.reactivex.Observable;

/* renamed from: mkl reason: default package */
public final class mkl implements wig<mkk> {
    private final wzi<Context> a;
    private final wzi<gtr> b;
    private final wzi<seb> c;
    private final wzi<ImmutableSet<mjt>> d;
    private final wzi<mjq> e;
    private final wzi<DiscoveryConfiguration> f;
    private final wzi<hgy> g;
    private final wzi<mkc> h;
    private final wzi<Observable<ConnectionType>> i;
    private final wzi<xil> j;
    private final wzi<ura> k;

    private mkl(wzi<Context> wzi, wzi<gtr> wzi2, wzi<seb> wzi3, wzi<ImmutableSet<mjt>> wzi4, wzi<mjq> wzi5, wzi<DiscoveryConfiguration> wzi6, wzi<hgy> wzi7, wzi<mkc> wzi8, wzi<Observable<ConnectionType>> wzi9, wzi<xil> wzi10, wzi<ura> wzi11) {
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

    public static mkl a(wzi<Context> wzi, wzi<gtr> wzi2, wzi<seb> wzi3, wzi<ImmutableSet<mjt>> wzi4, wzi<mjq> wzi5, wzi<DiscoveryConfiguration> wzi6, wzi<hgy> wzi7, wzi<mkc> wzi8, wzi<Observable<ConnectionType>> wzi9, wzi<xil> wzi10, wzi<ura> wzi11) {
        mkl mkl = new mkl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return mkl;
    }

    public final /* synthetic */ Object get() {
        mkk mkk = new mkk((Context) this.a.get(), (gtr) this.b.get(), (seb) this.c.get(), (ImmutableSet) this.d.get(), (mjq) this.e.get(), (DiscoveryConfiguration) this.f.get(), (hgy) this.g.get(), (mkc) this.h.get(), (Observable) this.i.get(), (xil) this.j.get(), (ura) this.k.get());
        return mkk;
    }
}
