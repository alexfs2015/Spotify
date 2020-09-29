package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    private wrf<? extends T> b;
    private wrf<U> c;

    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 2259811067697317255L;
        final wrg<? super T> downstream;
        final wrf<? extends T> main;
        final OtherSubscriber other = new OtherSubscriber<>();
        final AtomicReference<wrh> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<wrh> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            public final void a(wrh wrh) {
                if (SubscriptionHelper.a((AtomicReference<wrh>) this, wrh)) {
                    wrh.a(Long.MAX_VALUE);
                }
            }

            public final void b_(Object obj) {
                wrh wrh = (wrh) get();
                if (wrh != SubscriptionHelper.CANCELLED) {
                    lazySet(SubscriptionHelper.CANCELLED);
                    wrh.a();
                    MainSubscriber.this.b();
                }
            }

            public final void onError(Throwable th) {
                if (((wrh) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.a(th);
                }
            }

            public final void c() {
                if (((wrh) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.b();
                }
            }
        }

        MainSubscriber(wrg<? super T> wrg, wrf<? extends T> wrf) {
            this.downstream = wrg;
            this.main = wrf;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.main.b(this);
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void c() {
            this.downstream.c();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                SubscriptionHelper.a(this.upstream, (AtomicLong) this, j);
            }
        }

        public final void a() {
            SubscriptionHelper.a((AtomicReference<wrh>) this.other);
            SubscriptionHelper.a(this.upstream);
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a(this.upstream, (AtomicLong) this, wrh);
        }
    }

    public FlowableDelaySubscriptionOther(wrf<? extends T> wrf, wrf<U> wrf2) {
        this.b = wrf;
        this.c = wrf2;
    }

    public final void a(wrg<? super T> wrg) {
        MainSubscriber mainSubscriber = new MainSubscriber(wrg, this.b);
        wrg.a(mainSubscriber);
        this.c.b(mainSubscriber.other);
    }
}
