package defpackage;

/* renamed from: wyu reason: default package */
abstract class wyu<E> extends wyh<E> {
    private static final Integer c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private int d;

    public wyu(int i) {
        super(i);
        this.d = Math.min(i / 4, c.intValue());
    }
}
