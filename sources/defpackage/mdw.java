package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: mdw reason: default package */
public final class mdw {
    Disposable a = Disposables.b();
    private final kym b;
    private final Scheduler c;

    public mdw(kym kym, Scheduler scheduler) {
        this.b = (kym) fbp.a(kym);
        this.c = scheduler;
    }

    public final void a() {
        this.a.bd_();
        this.a = this.b.a(Boolean.FALSE).a(this.c).a((Consumer<? super T>) $$Lambda$mdw$Peshz4cyeztSnpfB9ixJNU9M1M.INSTANCE, (Consumer<? super Throwable>) $$Lambda$mdw$e2D_r8llCO0PoEH_ogCYXColV0.INSTANCE);
    }
}
