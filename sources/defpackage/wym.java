package defpackage;

/* renamed from: wym reason: default package */
abstract class wym<E> extends wyp<E> {
    static final long e;
    volatile long f;

    static {
        try {
            e = wzg.a.objectFieldOffset(wym.class.getDeclaredField("f"));
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public wym(int i) {
        super(i);
        this.f = (long) i;
    }
}
