package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;

public final class CancellableSubscription extends AtomicReference<wur> implements wuk {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(wur wur) {
        super(wur);
    }

    public final boolean isUnsubscribed() {
        return get() == null;
    }

    public final void unsubscribe() {
        if (get() != null) {
            wur wur = (wur) getAndSet(null);
            if (wur != null) {
                try {
                    wur.cancel();
                } catch (Exception e) {
                    wul.b(e);
                    wzs.a((Throwable) e);
                }
            }
        }
    }
}
