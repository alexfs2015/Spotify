package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: lzy reason: default package */
public final class lzy {
    private final hec a;
    private final maa b;
    private final kvd c;
    private final kvk d;
    private final kvb e;
    private final Scheduler f;
    private Disposable g = Disposables.b();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    lzy(hec hec, maa maa, kvd kvd, kvk kvk, kvb kvb, Scheduler scheduler) {
        this.a = (hec) fay.a(hec);
        this.b = (maa) fay.a(maa);
        this.c = (kvd) fay.a(kvd);
        this.d = (kvk) fay.a(kvk);
        this.e = (kvb) fay.a(kvb);
        this.f = (Scheduler) fay.a(scheduler);
    }

    public final void a() {
        this.g.bf_();
        Observable a2 = this.a.a().j().a(Functions.a());
        Observable a3 = this.b.a();
        kvd kvd = this.c;
        kvd.getClass();
        this.g = Observable.a((ObservableSource<? extends T1>) a2, (ObservableSource<? extends T2>) a3.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$7gEmsMhk3qUtg1OHsA4CBphPsE<Object,Object>(kvd), false).a(Functions.a()), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$d9nEofcmOweHs_azEtEFXNODV6s.INSTANCE).a(this.f).a((Consumer<? super T>) new $$Lambda$lzy$fh6sZShaMvaIadg1maGkWY6H8Wc<Object>(this), (Consumer<? super Throwable>) $$Lambda$lzy$eAAggPYWgjpqz1zHhJkrkgk2Z7I.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        kvm kvm;
        fpt fpt = (fpt) fay.a(hoVar.a);
        boolean booleanValue = ((Boolean) fay.a(hoVar.b)).booleanValue();
        if (this.e.a(fpt)) {
            kvh kvh = this.d.a;
            if (kvh.c.d(fpt)) {
                kvm = kvh.b;
            } else {
                kvm = kvh.a;
            }
            if (booleanValue) {
                new a();
                kvm.a(new kwo(null, null, false, 0));
            } else if (kvm.a(fpt)) {
                kvm.a();
            }
        }
    }

    public final void b() {
        this.g.bf_();
        this.d.a();
    }
}
