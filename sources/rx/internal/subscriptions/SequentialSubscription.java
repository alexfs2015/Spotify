package rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;

public final class SequentialSubscription extends AtomicReference<wuk> implements wuk {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public SequentialSubscription(wuk wuk) {
        lazySet(wuk);
    }

    public final wuk a() {
        wuk wuk = (wuk) super.get();
        return wuk == Unsubscribed.INSTANCE ? xaj.b() : wuk;
    }

    public final boolean a(wuk wuk) {
        wuk wuk2;
        do {
            wuk2 = (wuk) get();
            if (wuk2 == Unsubscribed.INSTANCE) {
                if (wuk != null) {
                    wuk.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(wuk2, wuk));
        if (wuk2 != null) {
            wuk2.unsubscribe();
        }
        return true;
    }

    public final boolean b(wuk wuk) {
        wuk wuk2;
        do {
            wuk2 = (wuk) get();
            if (wuk2 == Unsubscribed.INSTANCE) {
                if (wuk != null) {
                    wuk.unsubscribe();
                }
                return false;
            }
        } while (!compareAndSet(wuk2, wuk));
        return true;
    }

    public final void unsubscribe() {
        if (((wuk) get()) != Unsubscribed.INSTANCE) {
            wuk wuk = (wuk) getAndSet(Unsubscribed.INSTANCE);
            if (wuk != null && wuk != Unsubscribed.INSTANCE) {
                wuk.unsubscribe();
            }
        }
    }

    public final boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }
}
