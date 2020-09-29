package defpackage;

/* renamed from: wkg reason: default package */
abstract class wkg<E> extends wkj<E> {
    static final long e;
    volatile long f;

    static {
        try {
            e = wla.a.objectFieldOffset(wkg.class.getDeclaredField("f"));
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public wkg(int i) {
        super(i);
        this.f = (long) i;
    }
}
