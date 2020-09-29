package rx.internal.subscriptions;

public enum Unsubscribed implements wuk {
    INSTANCE;

    public final boolean isUnsubscribed() {
        return true;
    }

    public final void unsubscribe() {
    }
}
