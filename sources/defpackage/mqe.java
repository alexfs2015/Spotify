package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mqe reason: default package */
public final class mqe {
    Disposable a = Disposables.b();
    mqg b;
    private final rzo c;
    private final Observable<mqa> d;

    mqe(rzo rzo, Observable<mqa> observable) {
        this.c = (rzo) fbp.a(rzo);
        this.d = (Observable) fbp.a(observable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mqa mqa) {
        if (this.b != null) {
            boolean b2 = mqa.b();
            this.b.a(b2, mqa.a());
            this.b.a(b2);
        }
    }

    public final void a(mqg mqg) {
        this.b = (mqg) fbp.a(mqg);
        this.a = this.d.a((Consumer<? super T>) new $$Lambda$mqe$52Fnr9t2JKILTMlc8pq6fmPy3U<Object>(this), (Consumer<? super Throwable>) $$Lambda$mqe$znBt9agDDq5SFn4QR1HnTTf2CT0.INSTANCE);
    }

    public final void a(boolean z) {
        this.c.b(z);
    }
}
