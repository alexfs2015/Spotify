package defpackage;

/* renamed from: wyq reason: default package */
abstract class wyq<E> extends wyn<E> {
    static final long g;
    volatile long h;

    static {
        try {
            g = wzg.a.objectFieldOffset(wyq.class.getDeclaredField("h"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public wyq(int i) {
        super(i);
    }
}
