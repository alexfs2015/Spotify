package hu.akarnokd.rxjava.interop;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableV2ToObservableV1<T> implements a<T> {
    private wrf<T> a;

    public static final class SourceSubscriber<T> extends AtomicReference<wrh> implements FlowableSubscriber<T>, wuf, wuk {
        private static final long serialVersionUID = -6567012932544037069L;
        final wuj<? super T> actual;
        final AtomicLong requested = new AtomicLong();

        public SourceSubscriber(wuj<? super T> wuj) {
            this.actual = wuj;
        }

        public final void a(long j) {
            if (j != 0) {
                SubscriptionHelper.a((AtomicReference<wrh>) this, this.requested, j);
            }
        }

        public final void unsubscribe() {
            SubscriptionHelper.a((AtomicReference<wrh>) this);
        }

        public final boolean isUnsubscribed() {
            return SubscriptionHelper.CANCELLED == get();
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a((AtomicReference<wrh>) this, this.requested, wrh);
        }

        public final void b_(T t) {
            this.actual.onNext(t);
        }

        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        public final void c() {
            this.actual.onCompleted();
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        SourceSubscriber sourceSubscriber = new SourceSubscriber(wuj);
        wuj.add(sourceSubscriber);
        wuj.setProducer(sourceSubscriber);
        this.a.b(sourceSubscriber);
    }

    public FlowableV2ToObservableV1(wrf<T> wrf) {
        this.a = wrf;
    }
}
