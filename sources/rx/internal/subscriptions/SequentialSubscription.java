package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;

public final class SequentialSubscription extends AtomicReference<xip> implements xip {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public SequentialSubscription(xip xip) {
        lazySet(xip);
    }

    public final xip a() {
        xip xip = (xip) super.get();
        return xip == Unsubscribed.INSTANCE ? xon.b() : xip;
    }

    public final boolean a(xip xip) {
        xip xip2;
        do {
            xip2 = (xip) get();
            if (xip2 == Unsubscribed.INSTANCE) {
                if (xip != null) {
                    xip.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(xip2, xip));
        if (xip2 != null) {
            xip2.unsubscribe();
        }
        return true;
    }

    public final boolean b(xip xip) {
        xip xip2;
        do {
            xip2 = (xip) get();
            if (xip2 == Unsubscribed.INSTANCE) {
                if (xip != null) {
                    xip.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(xip2, xip));
        return true;
    }

    public final boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }

    public final void unsubscribe() {
        if (((xip) get()) != Unsubscribed.INSTANCE) {
            xip xip = (xip) getAndSet(Unsubscribed.INSTANCE);
            if (xip != null && xip != Unsubscribed.INSTANCE) {
                xip.unsubscribe();
            }
        }
    }
}
