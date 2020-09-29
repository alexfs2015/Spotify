package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;

/* renamed from: rhh reason: default package */
public final class rhh extends rdr {
    private final rda a;
    private final int b;
    private final rhr c;
    private final CollectionStateProvider d;
    private final sso e;
    private final rgf f;
    private final lbi g;
    private final String h;

    public rhh(rda rda, String str, int i, rhr rhr, CollectionStateProvider collectionStateProvider, sso sso, rgf rgf, lbi lbi) {
        this.a = rda;
        this.h = str;
        this.b = i;
        this.c = rhr;
        this.d = collectionStateProvider;
        this.e = sso;
        this.f = rgf;
        this.g = lbi;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe d() {
        return new kom(Schedulers.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ koe e() {
        return new kom(Schedulers.a());
    }

    public final Observable<rdc> c() {
        Observable d2 = Observable.d();
        $$Lambda$z8jWr1HKkRtkgPFaOyzEkITdFD0 r1 = $$Lambda$z8jWr1HKkRtkgPFaOyzEkITdFD0.INSTANCE;
        rhr rhr = this.c;
        CollectionStateProvider collectionStateProvider = this.d;
        a a2 = kok.a((kni<M, E, F>) r1, kok.a().a(b.class, rhp.a(rhr)).a(a.class, rhp.a(rhp.a(collectionStateProvider), this.e.toString(), this.f)).a()).b($$Lambda$rhh$Dg1L1GGMGjc_nrzpXADMFGt3b6g.INSTANCE).a((kny<koe>) $$Lambda$rhh$iKn2yWEcf9Vymn3FOc0Fgqh95Uc.INSTANCE).a(koj.a(rhq.a(this.a, this.b), rhq.a(this.g.a())));
        rho rho = rho.a;
        rho a3 = rho.i().a(this.h).a();
        return d2.a(kok.a((c<M, E, F>) a2, a3.i().a(this.b).a())).c((Function<? super T, ? extends R>) $$Lambda$N7Xhed0sIKAx1wQMN0ObIG_oQLA.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$izXbHfLZJZGW4IMh98cyWkI5sQ.INSTANCE);
    }
}
