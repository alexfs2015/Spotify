package defpackage;

/* renamed from: wym reason: default package */
abstract class wym<E> extends wyo<E> {
    private static long c = wzh.a(wym.class, "consumerIndex");
    volatile long consumerIndex;

    public wym(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j, long j2) {
        return wzh.a.compareAndSwapLong(this, c, j, j2);
    }
}
