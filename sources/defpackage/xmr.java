package defpackage;

/* renamed from: xmr reason: default package */
abstract class xmr<E> extends xmt<E> {
    private static long c = xnm.a(xmr.class, "consumerIndex");
    volatile long consumerIndex;

    public xmr(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j, long j2) {
        return xnm.a.compareAndSwapLong(this, c, j, j2);
    }
}
