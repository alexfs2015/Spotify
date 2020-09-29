package defpackage;

import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xai reason: default package */
public final class xai implements wuk {
    public final SequentialSubscription a = new SequentialSubscription();

    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public final void unsubscribe() {
        this.a.unsubscribe();
    }

    public final void a(wuk wuk) {
        if (wuk != null) {
            this.a.a(wuk);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }
}
