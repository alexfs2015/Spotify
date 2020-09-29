package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: lzt reason: default package */
public final class lzt {
    Disposable a = Disposables.b();
    private final kvd b;
    private final Scheduler c;

    public lzt(kvd kvd, Scheduler scheduler) {
        this.b = (kvd) fay.a(kvd);
        this.c = scheduler;
    }

    public final void a() {
        this.a.bf_();
        this.a = this.b.a(Boolean.FALSE).a(this.c).a((Consumer<? super T>) $$Lambda$lzt$X4HSovlhZUZMSx7oiWxM0FwFWTk.INSTANCE, (Consumer<? super Throwable>) $$Lambda$lzt$coivMZDEmrUeuIwN8WUPw00qQ.INSTANCE);
    }
}
