package defpackage;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mdy reason: default package */
public final class mdy {
    Disposable a = Disposables.b();
    mdw b;
    meb c;
    private final Observable<Boolean> d;
    private final kyk e;
    private final who<meb> f;
    private final who<mdw> g;
    private final Scheduler h;

    mdy(Observable<Boolean> observable, kyk kyk, who<meb> who, who<mdw> who2, Scheduler scheduler) {
        this.d = (Observable) fbp.a(observable);
        this.e = (kyk) fbp.a(kyk);
        this.f = (who) fbp.a(who);
        this.g = (who) fbp.a(who2);
        this.h = (Scheduler) fbp.a(scheduler);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            this.e.a(true);
            this.c = (meb) this.f.get();
            this.c.a();
            return;
        }
        if (this.e.b.a(kyk.a, false)) {
            this.e.a(false);
            this.b = (mdw) this.g.get();
            this.b.a();
        }
        meb meb = this.c;
        if (meb != null) {
            meb.b();
        }
    }

    public final void a() {
        this.a.bd_();
        this.a = this.d.a(this.h).a((Consumer<? super T>) new $$Lambda$mdy$26KELxfO9vEeBDotWpg1yGOJU<Object>(this), (Consumer<? super Throwable>) $$Lambda$mdy$KqbBOqCkZX_jU3ABQXoBzvAW3jc.INSTANCE);
    }
}
