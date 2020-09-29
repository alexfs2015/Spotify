package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: shy reason: default package */
public final class shy implements sie {
    private final Scheduler b;
    private final sia c;
    private final sic d;
    private final hed e;
    private Disposable f = Disposables.a();

    public shy(Scheduler scheduler, sia sia, sic sic, hed hed) {
        this.b = scheduler;
        this.c = sia;
        this.d = sic;
        this.e = hed;
    }

    public final void a() {
        this.f.bf_();
        this.f = this.c.a().a(this.b).a((Consumer<? super T>) this.d, (Consumer<? super Throwable>) $$Lambda$shy$td3GKXQBk8ODwWKs3aRnuFKPZbk.INSTANCE);
    }

    public final void b() {
        this.f.bf_();
    }

    public final void c() {
        this.f.bf_();
        this.f = Observable.a((ObservableSource<? extends T1>) this.c.a(), (ObservableSource<? extends T2>) vun.b(this.e.a("payment-state")), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$shy$PbJ8iiBjJzVQjK1ACjIKKD2AJKY.INSTANCE).a(this.b).a((Consumer<? super T>) this.d, (Consumer<? super Throwable>) $$Lambda$shy$KqHP2d9ju5J7PCui32aBV19h_N4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, String str) {
        return (bool.booleanValue() || str == null || !str.startsWith("opt-in-trial")) ? bool : Boolean.TRUE;
    }
}
