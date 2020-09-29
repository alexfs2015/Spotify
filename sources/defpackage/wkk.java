package defpackage;

/* renamed from: wkk reason: default package */
abstract class wkk<E> extends wkh<E> {
    static final long g;
    volatile long h;

    static {
        try {
            g = wla.a.objectFieldOffset(wkk.class.getDeclaredField("h"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public wkk(int i) {
        super(i);
    }
}
