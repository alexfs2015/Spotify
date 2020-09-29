package com.uber.rxdogtag;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagMaybeObserver<T> implements MaybeObserver<T>, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final MaybeObserver<T> c;

    DogTagMaybeObserver(Configuration configuration, MaybeObserver<T> maybeObserver) {
        this.b = configuration;
        this.c = maybeObserver;
    }

    public final void onSubscribe(Disposable disposable) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagMaybeObserver.this.c((Throwable) obj);
            }
        }, (Runnable) new Runnable(disposable) {
            private final /* synthetic */ Disposable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagMaybeObserver.this.a(this.f$1);
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

    public final void c_(T t) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagMaybeObserver.this.b((Throwable) obj);
            }
        }, (Runnable) new Runnable(t) {
            private final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagMaybeObserver.this.b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        this.c.c_(obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSuccess");
    }

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onComplete");
    }

    public final void onComplete() {
        $$Lambda$DogTagMaybeObserver$pfE2KTQ2wibKTACVaQiT_sYVslQ r0 = new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagMaybeObserver.this.a((Throwable) obj);
            }
        };
        MaybeObserver<T> maybeObserver = this.c;
        maybeObserver.getClass();
        RxDogTag.a((NonCheckingConsumer<Throwable>) r0, (Runnable) new Runnable() {
            public final void run() {
                MaybeObserver.this.onComplete();
            }
        });
    }

    public final boolean bb_() {
        MaybeObserver<T> maybeObserver = this.c;
        return (maybeObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) maybeObserver).bb_();
    }
}
