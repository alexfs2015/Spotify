package defpackage;

/* renamed from: xmz reason: default package */
abstract class xmz<E> extends xmm<E> {
    private static final Integer c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private int d;

    public xmz(int i) {
        super(i);
        this.d = Math.min(i / 4, c.intValue());
    }
}
