package defpackage;

/* renamed from: wuj reason: default package */
public abstract class wuj<T> implements wue<T>, wuk {
    private static final long NOT_SET = Long.MIN_VALUE;
    private wuf producer;
    private long requested;
    private final wuj<?> subscriber;
    private final wxu subscriptions;

    public void onStart() {
    }

    protected wuj() {
        this(null, false);
    }

    protected wuj(wuj<?> wuj) {
        this(wuj, true);
    }

    protected wuj(wuj<?> wuj, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = wuj;
        this.subscriptions = (!z || wuj == null) ? new wxu() : wuj.subscriptions;
    }

    public final void add(wuk wuk) {
        this.subscriptions.a(wuk);
    }

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public final void request(long j) {
        if (j >= 0) {
            synchronized (this) {
                if (this.producer != null) {
                    wuf wuf = this.producer;
                    wuf.a(j);
                    return;
                }
                addToRequested(j);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("number requested cannot be negative: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    private void addToRequested(long j) {
        long j2 = this.requested;
        if (j2 == NOT_SET) {
            this.requested = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j3;
        }
    }

    public void setProducer(wuf wuf) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = wuf;
            z = this.subscriber != null && j == NOT_SET;
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == NOT_SET) {
            this.producer.a(Long.MAX_VALUE);
        } else {
            this.producer.a(j);
        }
    }
}
