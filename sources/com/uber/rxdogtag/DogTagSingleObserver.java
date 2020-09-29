package com.uber.rxdogtag;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagSingleObserver<T> implements SingleObserver<T>, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final SingleObserver<T> c;

    DogTagSingleObserver(Configuration configuration, SingleObserver<T> singleObserver) {
        this.b = configuration;
        this.c = singleObserver;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        this.c.onSubscribe(disposable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSuccess");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        this.c.c_(obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSubscribe");
    }

    public final boolean aZ_() {
        SingleObserver<T> singleObserver = this.c;
        return (singleObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) singleObserver).aZ_();
    }

    public final void c_(T t) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSingleObserver.this.a((Throwable) obj);
            }
        }, (Runnable) new Runnable(t) {
            private final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagSingleObserver.this.b(this.f$1);
            }
        });
    }

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }

    public final void onSubscribe(Disposable disposable) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSingleObserver.this.b((Throwable) obj);
            }
        }, (Runnable) new Runnable(disposable) {
            private final /* synthetic */ Disposable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagSingleObserver.this.a(this.f$1);
            }
        });
    }
}
