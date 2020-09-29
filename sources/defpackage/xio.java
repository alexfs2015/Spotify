package defpackage;

/* renamed from: xio reason: default package */
public abstract class xio<T> implements xij<T>, xip {
    private static final long NOT_SET = Long.MIN_VALUE;
    private xik producer;
    private long requested;
    private final xio<?> subscriber;
    private final xlz subscriptions;

    protected xio() {
        this(null, false);
    }

    protected xio(xio<?> xio) {
        this(xio, true);
    }

    protected xio(xio<?> xio, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = xio;
        this.subscriptions = (!z || xio == null) ? new xlz() : xio.subscriptions;
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

    public final void add(xip xip) {
        this.subscriptions.a(xip);
    }

    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    public final void request(long j) {
        if (j >= 0) {
            synchronized (this) {
                if (this.producer != null) {
                    xik xik = this.producer;
                    xik.a(j);
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

    public void setProducer(xik xik) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = xik;
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

    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }
}
