package com.uber.rxdogtag;

import io.reactivex.FlowableSubscriber;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final xfl<T> c;

    DogTagSubscriber(Configuration configuration, xfl<T> xfl) {
        this.b = configuration;
        this.c = xfl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onComplete");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        this.c.b_(obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onNext");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(xfm xfm) {
        this.c.a(xfm);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSubscribe");
    }

    public final void a(xfm xfm) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSubscriber.this.c((Throwable) obj);
            }
        }, (Runnable) new Runnable(xfm) {
            private final /* synthetic */ xfm f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagSubscriber.this.b(this.f$1);
            }
        });
    }

    public final boolean aZ_() {
        xfl<T> xfl = this.c;
        return (xfl instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) xfl).aZ_();
    }

    public final void b_(T t) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSubscriber.this.b((Throwable) obj);
            }
        }, (Runnable) new Runnable(t) {
            private final /* synthetic */ Object f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagSubscriber.this.b(this.f$1);
            }
        });
    }

    public final void c() {
        $$Lambda$DogTagSubscriber$3cy2mYcXK9QLWG81P9NMbYF4hk r0 = new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSubscriber.this.a((Throwable) obj);
            }
        };
        xfl<T> xfl = this.c;
        xfl.getClass();
        RxDogTag.a((NonCheckingConsumer<Throwable>) r0, (Runnable) new Runnable() {
            public final void run() {
                xfl.this.c();
            }
        });
    }

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }
}
