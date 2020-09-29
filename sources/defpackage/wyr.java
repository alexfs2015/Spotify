package defpackage;

/* renamed from: wyr reason: default package */
abstract class wyr<E> extends wyn<E> {
    private static long c = wzh.a(wyr.class, "producerIndex");
    volatile long producerIndex;

    /* access modifiers changed from: protected */
    public final void c(long j) {
        wzh.a.putOrderedLong(this, c, j);
    }

    public wyr(int i) {
        super(i);
    }
}
