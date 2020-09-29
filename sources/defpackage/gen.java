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

/* renamed from: gen reason: default package */
public final class gen implements geb {
    private final gej a;
    private volatile Disposable b = Disposables.b();

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
    }

    public gen(gej gej) {
        this.a = gej;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.b.b()) {
            this.b = Observable.a(30, 30, TimeUnit.SECONDS, Schedulers.a()).a(Schedulers.b()).b((Function<? super T, ? extends CompletableSource>) new $$Lambda$gen$1wsYdVx9ymXYN1pL_hffV0zG0oA<Object,Object>(runnable), 2).a((Action) new $$Lambda$gen$YlmdqUDvXgjx7yVYGJKwqJz7Rr4(this), (Consumer<? super Throwable>) new $$Lambda$gen$oBSFHOiQqJlR2WYmotBvZ11MQc<Object>(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.a(th, "Error running periodic scheduler.");
    }

    public final synchronized void a() {
        this.b.bf_();
    }
}
