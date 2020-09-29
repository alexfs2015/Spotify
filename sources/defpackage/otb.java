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

/* renamed from: otb reason: default package */
final class otb {
    final CompositeDisposable a = new CompositeDisposable();
    final CompletableSubject b = CompletableSubject.f();
    private final Scheduler c;
    private final ois d;
    private final BehaviorSubject<ojc> e = BehaviorSubject.a();
    private final SerialDisposable f = new SerialDisposable();
    private ote g;

    public otb(Scheduler scheduler, ois ois) {
        this.c = scheduler;
        this.d = ois;
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.d;
        ois.getClass();
        compositeDisposable.a(c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$pMoOriiGE1GbrTE0FfTeRih_xQI<Object,Object>(ois)).a(this.c).a((Consumer<? super T>) new $$Lambda$otb$HvBqzbUKvn7jWvhlzwYI7cj4rxQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$otb$Rr3G3GC00k4pU6d4Pe5e9o3YcCU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.e.onNext(ojc);
        this.b.onComplete();
    }

    public final void a(ote ote) {
        this.g = ote;
        if (ote != null) {
            this.f.a(this.e.d((Consumer<? super T>) new $$Lambda$otb$8jwxJDXfKDnFpTk9jdUjEuHfOA<Object>(this)));
        } else {
            this.f.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        this.g.a(!ojc.n());
    }
}
