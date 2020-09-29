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

/* renamed from: ofr reason: default package */
final class ofr {
    final CompositeDisposable a = new CompositeDisposable();
    final ofn b;
    final hbj c;
    final String d;
    final CompletableSubject e = CompletableSubject.f();
    private final ois f;
    private final Scheduler g;
    private final BehaviorSubject<ojc> h = BehaviorSubject.a();
    private final SerialDisposable i = new SerialDisposable();
    private ofu j;

    public ofr(ois ois, ofn ofn, hbj hbj, String str, Scheduler scheduler) {
        this.f = ois;
        this.g = scheduler;
        this.b = ofn;
        this.c = hbj;
        this.d = str;
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.f;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.g);
        $$Lambda$ofr$dq6bIkuLb80PZex61G5_G7X8zA r1 = new $$Lambda$ofr$dq6bIkuLb80PZex61G5_G7X8zA(this);
        CompletableSubject completableSubject = this.e;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ojc ojc) {
        this.h.onNext(ojc);
        this.e.onComplete();
    }

    public final void a(ofu ofu) {
        this.j = ofu;
        if (ofu != null) {
            this.i.a(this.h.d((Consumer<? super T>) new $$Lambda$ofr$tGUwgHW25S7BqbnS6omaW1hXU10<Object>(this)));
        } else {
            this.i.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        this.j.a(!ojc.n() && ojc.m());
    }
}
