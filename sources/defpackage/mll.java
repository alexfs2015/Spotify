package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mll reason: default package */
public final class mll {
    Disposable a = Disposables.b();
    mln b;
    private final rqd c;
    private final Observable<mlh> d;

    mll(rqd rqd, Observable<mlh> observable) {
        this.c = (rqd) fay.a(rqd);
        this.d = (Observable) fay.a(observable);
    }

    public final void a(mln mln) {
        this.b = (mln) fay.a(mln);
        this.a = this.d.a((Consumer<? super T>) new $$Lambda$mll$oMeo9tdrPO2ysoqa4ILfQoHcSWM<Object>(this), (Consumer<? super Throwable>) $$Lambda$mll$S8cgKGmPy47ulDjdhnFhMgYKbys.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mlh mlh) {
        if (this.b != null) {
            boolean b2 = mlh.b();
            this.b.a(b2, mlh.a());
            this.b.a(b2);
        }
    }

    public final void a(boolean z) {
        this.c.b(z);
    }
}
