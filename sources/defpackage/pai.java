package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: pai reason: default package */
final class pai {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    private final Scheduler c;
    private final opw d;
    private final BehaviorSubject<oqg> e = BehaviorSubject.a();
    private final SerialDisposable f = new SerialDisposable();
    private pal g;

    public pai(Scheduler scheduler, opw opw) {
        this.c = scheduler;
        this.d = opw;
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        this.g.a(!oqg.n());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.e.onNext(oqg);
        this.b.onComplete();
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.d;
        opw.getClass();
        compositeDisposable.a(c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$S_hgBX16SCzOObmTMgYeQ3aWOns<Object,Object>(opw)).a(this.c).a((Consumer<? super T>) new $$Lambda$pai$vwvm2t8VhnVQ_vV8zNk8YjIO_UU<Object>(this), (Consumer<? super Throwable>) $$Lambda$pai$69jk3j02XTL2pX9Niz3IoRJHcaM.INSTANCE));
    }

    public final void a(pal pal) {
        this.g = pal;
        if (pal != null) {
            this.f.a(this.e.d((Consumer<? super T>) new $$Lambda$pai$rFMsFdwi7yp17InCNVxzHGAqBsA<Object>(this)));
        } else {
            this.f.a(Disposables.a());
        }
    }
}
