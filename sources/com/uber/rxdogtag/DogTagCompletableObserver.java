package com.uber.rxdogtag;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagCompletableObserver implements CompletableObserver, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final CompletableObserver c;

    DogTagCompletableObserver(Configuration configuration, CompletableObserver completableObserver) {
        this.b = configuration;
        this.c = completableObserver;
    }

    public final void onSubscribe(Disposable disposable) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagCompletableObserver.this.b((Throwable) obj);
            }
        }, (Runnable) new Runnable(disposable) {
            private final /* synthetic */ Disposable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagCompletableObserver.this.a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        this.c.onSubscribe(disposable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSubscribe");
    }

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onComplete");
    }

    public final void onComplete() {
        $$Lambda$DogTagCompletableObserver$lLpQDjeE2RanCos3eXIC9GxsuAw r0 = new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagCompletableObserver.this.a((Throwable) obj);
            }
        };
        CompletableObserver completableObserver = this.c;
        completableObserver.getClass();
        RxDogTag.a((NonCheckingConsumer<Throwable>) r0, (Runnable) new Runnable() {
            public final void run() {
                CompletableObserver.this.onComplete();
            }
        });
    }

    public final boolean bb_() {
        CompletableObserver completableObserver = this.c;
        return (completableObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) completableObserver).bb_();
    }
}
