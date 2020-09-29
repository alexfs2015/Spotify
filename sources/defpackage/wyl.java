package defpackage;

/* renamed from: wyl reason: default package */
abstract class wyl<E> extends wyo<E> {
    static final long c;
    protected long d;

    static {
        try {
            c = wzg.a.objectFieldOffset(wyl.class.getDeclaredField("d"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public wyl(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final long b() {
        return wzg.a.getLongVolatile(this, c);
    }
}
