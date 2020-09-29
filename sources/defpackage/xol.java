package defpackage;

import rx.internal.subscriptions.SequentialSubscription;

/* renamed from: xol reason: default package */
public final class xol implements xip {
    public final SequentialSubscription a = new SequentialSubscription();

    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public final void unsubscribe() {
        this.a.unsubscribe();
    }
}
