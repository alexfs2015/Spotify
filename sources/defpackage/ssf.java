package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;

/* renamed from: ssf reason: default package */
public final class ssf implements ssl {
    private final Scheduler b;
    private final ssh c;
    private final ssj d;
    private final hgz e;
    private Disposable f = Disposables.a();

    public ssf(Scheduler scheduler, ssh ssh, ssj ssj, hgz hgz) {
        this.b = scheduler;
        this.c = ssh;
        this.d = ssj;
        this.e = hgz;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, String str) {
        return (bool.booleanValue() || str == null || !str.startsWith("opt-in-trial")) ? bool : Boolean.TRUE;
    }

    public final void a() {
        this.f.bd_();
        this.f = this.c.a().a(this.b).a((Consumer<? super T>) this.d, (Consumer<? super Throwable>) $$Lambda$ssf$O5_rVsNSnQ9FjOnEsih0m8lWJts.INSTANCE);
    }

    public final void b() {
        this.f.bd_();
    }

    public final void c() {
        this.f.bd_();
        this.f = Observable.a((ObservableSource<? extends T1>) this.c.a(), (ObservableSource<? extends T2>) wit.b(this.e.a("payment-state")), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ssf$I0pdoQQzGLQchdpjAdMN81ZvVB4.INSTANCE).a(this.b).a((Consumer<? super T>) this.d, (Consumer<? super Throwable>) $$Lambda$ssf$Y0evT8JwnxQxv9llEiLkXH9nU9U.INSTANCE);
    }
}
