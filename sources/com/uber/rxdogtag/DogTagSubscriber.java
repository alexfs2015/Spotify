package com.uber.rxdogtag;

import io.reactivex.FlowableSubscriber;
import io.reactivex.observers.LambdaConsumerIntrospection;

final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final Throwable a = new Throwable();
    private final Configuration b;
    private final wrg<T> c;

    DogTagSubscriber(Configuration configuration, wrg<T> wrg) {
        this.b = configuration;
        this.c = wrg;
    }

    public final void a(wrh wrh) {
        RxDogTag.a((NonCheckingConsumer<Throwable>) new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSubscriber.this.c((Throwable) obj);
            }
        }, (Runnable) new Runnable(wrh) {
            private final /* synthetic */ wrh f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DogTagSubscriber.this.b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(wrh wrh) {
        this.c.a(wrh);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onSubscribe");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        this.c.b_(obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onNext");
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

    public final void onError(Throwable th) {
        RxDogTag.a(this.b, this.a, th, (String) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        RxDogTag.a(this.b, this.a, th, "onComplete");
    }

    public final void c() {
        $$Lambda$DogTagSubscriber$3cy2mYcXK9QLWG81P9NMbYF4hk r0 = new NonCheckingConsumer() {
            public final void accept(Object obj) {
                DogTagSubscriber.this.a((Throwable) obj);
            }
        };
        wrg<T> wrg = this.c;
        wrg.getClass();
        RxDogTag.a((NonCheckingConsumer<Throwable>) r0, (Runnable) new Runnable() {
            public final void run() {
                wrg.this.c();
            }
        });
    }

    public final boolean bb_() {
        wrg<T> wrg = this.c;
        return (wrg instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) wrg).bb_();
    }
}
