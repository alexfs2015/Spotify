package defpackage;

/* renamed from: xmw reason: default package */
abstract class xmw<E> extends xms<E> {
    private static long c = xnm.a(xmw.class, "producerIndex");
    volatile long producerIndex;

    public xmw(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final void c(long j) {
        xnm.a.putOrderedLong(this, c, j);
    }
}
