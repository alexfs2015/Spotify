package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;

/* renamed from: qys reason: default package */
public final class qys extends qvc {
    private final qul a;
    private final int b;
    private final qzc c;
    private final CollectionStateProvider d;
    private final sih e;
    private final qxq f;
    private final kxz g;
    private final String h;

    public qys(qul qul, String str, int i, qzc qzc, CollectionStateProvider collectionStateProvider, sih sih, qxq qxq, kxz kxz) {
        this.a = qul;
        this.h = str;
        this.b = i;
        this.c = qzc;
        this.d = collectionStateProvider;
        this.e = sih;
        this.f = qxq;
        this.g = kxz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv e() {
        return new kld(Schedulers.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kkv d() {
        return new kld(Schedulers.a());
    }

    public final Observable<qun> c() {
        Observable d2 = Observable.d();
        $$Lambda$R2OqH09wn8yWB7SojapehneoM r1 = $$Lambda$R2OqH09wn8yWB7SojapehneoM.INSTANCE;
        qzc qzc = this.c;
        CollectionStateProvider collectionStateProvider = this.d;
        a a2 = klb.a((kjz<M, E, F>) r1, klb.a().a(b.class, qza.a(qzc)).a(a.class, qza.a(qza.a(collectionStateProvider), this.e.toString(), this.f)).a()).b($$Lambda$qys$m8HgfYQPJtsW9t4wP1mOoZb6nao.INSTANCE).a((kkp<kkv>) $$Lambda$qys$lSNCMrIevitAORrEsWVilgRbg.INSTANCE).a(kla.a(qzb.a(this.a, this.b), qzb.a(this.g.a())));
        qyz qyz = qyz.a;
        qyz a3 = qyz.i().a(this.h).a();
        return d2.a(klb.a((c<M, E, F>) a2, a3.i().a(this.b).a())).c((Function<? super T, ? extends R>) $$Lambda$c59UuFnblUyibJHPj9RP7Xh2s0.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$XKBhzsVWSRSdSXWwRJMlFOGANZo.INSTANCE);
    }
}
