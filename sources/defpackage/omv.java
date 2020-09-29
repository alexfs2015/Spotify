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

/* renamed from: omv reason: default package */
final class omv {
    final CompositeDisposable a = new CompositeDisposable();
    final omr b;
    final hec c;
    final String d;
    final CompletableSubject e = CompletableSubject.f();
    private final opw f;
    private final Scheduler g;
    private final BehaviorSubject<oqg> h = BehaviorSubject.a();
    private final SerialDisposable i = new SerialDisposable();
    private omy j;

    public omv(opw opw, omr omr, hec hec, String str, Scheduler scheduler) {
        this.f = opw;
        this.g = scheduler;
        this.b = omr;
        this.c = hec;
        this.d = str;
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        this.j.a(!oqg.n() && oqg.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oqg oqg) {
        this.h.onNext(oqg);
        this.e.onComplete();
    }

    public final void a(a aVar) {
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.f;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.g);
        $$Lambda$omv$nTwSxaCW9IkEC64lKQfEwM_J52E r1 = new $$Lambda$omv$nTwSxaCW9IkEC64lKQfEwM_J52E(this);
        CompletableSubject completableSubject = this.e;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(omy omy) {
        this.j = omy;
        if (omy != null) {
            this.i.a(this.h.d((Consumer<? super T>) new $$Lambda$omv$EtQrsUtOzfz9gir_19XxY_3c_4<Object>(this)));
        } else {
            this.i.a(Disposables.a());
        }
    }
}
