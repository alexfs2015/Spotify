package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    private xfk<? extends T> b;
    private xfk<U> c;

    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = 2259811067697317255L;
        final xfl<? super T> downstream;
        final xfk<? extends T> main;
        final OtherSubscriber other = new OtherSubscriber<>();
        final AtomicReference<xfm> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<xfm> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            public final void a(xfm xfm) {
                if (SubscriptionHelper.a((AtomicReference<xfm>) this, xfm)) {
                    xfm.a(Long.MAX_VALUE);
                }
            }

            public final void b_(Object obj) {
                xfm xfm = (xfm) get();
                if (xfm != SubscriptionHelper.CANCELLED) {
                    lazySet(SubscriptionHelper.CANCELLED);
                    xfm.a();
                    MainSubscriber.this.b();
                }
            }

            public final void c() {
                if (((xfm) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.b();
                }
            }

            public final void onError(Throwable th) {
                if (((xfm) get()) != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.a(th);
                }
            }
        }

        MainSubscriber(xfl<? super T> xfl, xfk<? extends T> xfk) {
            this.downstream = xfl;
            this.main = xfk;
        }

        public final void a() {
            SubscriptionHelper.a((AtomicReference<xfm>) this.other);
            SubscriptionHelper.a(this.upstream);
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                SubscriptionHelper.a(this.upstream, (AtomicLong) this, j);
            }
        }

        public final void a(xfm xfm) {
            SubscriptionHelper.a(this.upstream, (AtomicLong) this, xfm);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.main.b(this);
        }

        public final void b_(T t) {
            this.downstream.b_(t);
        }

        public final void c() {
            this.downstream.c();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }
    }

    public FlowableDelaySubscriptionOther(xfk<? extends T> xfk, xfk<U> xfk2) {
        this.b = xfk;
        this.c = xfk2;
    }

    public final void a(xfl<? super T> xfl) {
        MainSubscriber mainSubscriber = new MainSubscriber(xfl, this.b);
        xfl.a(mainSubscriber);
        this.c.b(mainSubscriber.other);
    }
}
