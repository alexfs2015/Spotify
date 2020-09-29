package defpackage;

import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xom reason: default package */
public final class xom implements xip {
    public final SequentialSubscription a = new SequentialSubscription();

    public final void a(xip xip) {
        if (xip != null) {
            this.a.a(xip);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public final void unsubscribe() {
        this.a.unsubscribe();
    }
}
