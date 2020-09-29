package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;

public final class CancellableSubscription extends AtomicReference<xiw> implements xip {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(xiw xiw) {
        super(xiw);
    }

    public final boolean isUnsubscribed() {
        return get() == null;
    }

    public final void unsubscribe() {
        if (get() != null) {
            xiw xiw = (xiw) getAndSet(null);
            if (xiw != null) {
                try {
                    xiw.cancel();
                } catch (Exception e) {
                    xiq.b(e);
                    xnx.a((Throwable) e);
                }
            }
        }
    }
}
