package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: gfy reason: default package */
public final class gfy implements gfm {
    private final gfu a;
    private volatile Disposable b = Disposables.b();

    public gfy(gfu gfu) {
        this.a = gfu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a(th, "Error running periodic scheduler.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
    }

    public final synchronized void a() {
        this.b.bd_();
    }

    public final synchronized void a(Runnable runnable) {
        if (this.b.b()) {
            this.b = Observable.a(30, 30, TimeUnit.SECONDS, Schedulers.a()).a(Schedulers.b()).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$gfy$kOWk777DBufNa_8wCl8Zo7Xwg<Object,Object>(runnable), 2).a((Action) new $$Lambda$gfy$onYZCOOUaLfUDbYUEWwtcMoKAOk(this), (Consumer<? super Throwable>) new $$Lambda$gfy$tJFqFdRMStSXgx_09jJmqiCc0g<Object>(this));
        }
    }
}
