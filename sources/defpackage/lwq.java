package defpackage;

/* renamed from: lwq reason: default package */
public final class lwq implements wig<lwp> {
    private final wzi<lwd> a;
    private final wzi<sqe> b;
    private final wzi<squ> c;

    private lwq(wzi<lwd> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lwq a(wzi<lwd> wzi, wzi<sqe> wzi2, wzi<squ> wzi3) {
        return new lwq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new lwp((lwd) this.a.get(), (sqe) this.b.get(), (squ) this.c.get());
    }
}
