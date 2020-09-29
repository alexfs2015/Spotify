package com.uber.rxdogtag;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagObserver<T> implements Observer<T>, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final Observer<T> c;

    DogTagObserver(Configuration configuration, Observer<T> observer) {
        this.b = configuration;
        this.c = observer;
    }

    public final void onSubscribe(Disposable disposable) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagObserver.this.c((Throwable) obj);
            }
        }, (Runnable) new Runnable(disposable) {
            private final /* synthetic */ Disposable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagObserver.this.a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        this.c.onSubscribe(disposable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSubscribe");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        this.c.onNext(obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onNext");
    }

    public final void onNext(T t) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagObserver.this.b((Throwable) obj);
            }
        }, (Runnable) new Runnable(t) {
            private final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagObserver.this.a(this.f$1);
            }
        });
    }

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onComplete");
    }

    public final void onComplete() {
        $$Lambda$DogTagObserver$cnvHZwfz8n4pXNC8mSlxhysDDk4 r0 = new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagObserver.this.a((Throwable) obj);
            }
        };
        Observer<T> observer = this.c;
        observer.getClass();
        RxDogTag.a((NonCheckingConsumer<Throwable>) r0, (Runnable) new Runnable() {
            public final void run() {
                Observer.this.onComplete();
            }
        });
    }

    public final boolean bb_() {
        Observer<T> observer = this.c;
        return (observer instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) observer).bb_();
    }
}
