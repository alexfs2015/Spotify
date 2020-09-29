package defpackage;

/* renamed from: wkf reason: default package */
abstract class wkf<E> extends wki<E> {
    static final long c;
    protected long d;

    static {
        try {
            c = wla.a.objectFieldOffset(wkf.class.getDeclaredField("d"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public wkf(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final long b() {
        return wla.a.getLongVolatile(this, c);
    }
}
