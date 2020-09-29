package defpackage;

import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: olf reason: default package */
final class olf {
    final CompositeDisposable a = new CompositeDisposable();
    oix b;
    private final oey c;
    private final Scheduler d;
    private final BehaviorSubject<oiu> e = BehaviorSubject.a();
    private final CompositeDisposable f = new CompositeDisposable();
    private oli g;

    public olf(oey oey, Scheduler scheduler) {
        this.c = oey;
        this.d = scheduler;
    }

    public final void a(a aVar) {
        this.b = aVar.b();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = aVar.b().c().c((Function<? super T, ? extends R>) $$Lambda$GLjIydg9EdJFId7iQV3qVnxFDS4.INSTANCE).a(this.d);
        BehaviorSubject<oiu> behaviorSubject = this.e;
        behaviorSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) new $$Lambda$IMvDf8GfJ7NNp3Oav5n5CJZw4MY<Object>(behaviorSubject), (Consumer<? super Throwable>) $$Lambda$olf$3TFpT__6EyrwxT1YYLsrDupN6mw.INSTANCE));
    }

    public final void a(oli oli) {
        this.g = oli;
        if (oli != null) {
            this.f.c();
            this.f.a(this.e.c(1).d((Consumer<? super T>) new $$Lambda$olf$WiHqZRyaWTE43BIEzgLA99KNKSY<Object>(this)));
            this.f.a(this.c.a.a(this.d).a((Consumer<? super T>) new $$Lambda$olf$l4skSj3IqoQFcbnJYIPooHUzJEg<Object>(this), (Consumer<? super Throwable>) $$Lambda$olf$TfGseGKf0FIRCP2theJ3RcOMPvw.INSTANCE));
            this.f.a(this.c.b.a(this.d).a((Consumer<? super T>) new $$Lambda$olf$5HQqF_yCyQ95Ftdb4OS6S64_sIs<Object>(this), (Consumer<? super Throwable>) $$Lambda$olf$IrpXLxldcoz48yRQNZZUoyZt6Zc.INSTANCE));
            return;
        }
        this.f.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.g.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.g.a(true);
    }

    /* access modifiers changed from: private */
    public void a(oiu oiu) {
        Optional a2 = oiu.a();
        String str = "";
        this.g.a((String) a2.a(str), (vns) oiu.b().a(oix.a));
        if (!fax.a((String) a2.a(str))) {
            this.g.a(false);
        }
    }
}
