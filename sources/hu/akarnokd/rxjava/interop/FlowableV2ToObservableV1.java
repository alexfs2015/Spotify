package hu.akarnokd.rxjava.interop;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableV2ToObservableV1<T> implements a<T> {
    private xfk<T> a;

    public static final class SourceSubscriber<T> extends AtomicReference<xfm> implements FlowableSubscriber<T>, xik, xip {
        private static final long serialVersionUID = -6567012932544037069L;
        final xio<? super T> actual;
        final AtomicLong requested = new AtomicLong();

        public SourceSubscriber(xio<? super T> xio) {
            this.actual = xio;
        }

        public final void a(long j) {
            if (j != 0) {
                SubscriptionHelper.a((AtomicReference<xfm>) this, this.requested, j);
            }
        }

        public final void a(xfm xfm) {
            SubscriptionHelper.a((AtomicReference<xfm>) this, this.requested, xfm);
        }

        public final void b_(T t) {
            this.actual.onNext(t);
        }

        public final void c() {
            this.actual.onCompleted();
        }

        public final boolean isUnsubscribed() {
            return SubscriptionHelper.CANCELLED == get();
        }

        public final void onError(Throwable th) {
            this.actual.onError(th);
        }

        public final void unsubscribe() {
            SubscriptionHelper.a((AtomicReference<xfm>) this);
        }
    }

    public FlowableV2ToObservableV1(xfk<T> xfk) {
        this.a = xfk;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        SourceSubscriber sourceSubscriber = new SourceSubscriber(xio);
        xio.add(sourceSubscriber);
        xio.setProducer(sourceSubscriber);
        this.a.b(sourceSubscriber);
    }
}
