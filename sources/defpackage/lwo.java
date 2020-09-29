package defpackage;

/* renamed from: lwo reason: default package */
public final class lwo implements wig<lwn> {
    private final wzi<lwd> a;
    private final wzi<has> b;
    private final wzi<squ> c;

    private lwo(wzi<lwd> wzi, wzi<has> wzi2, wzi<squ> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static lwo a(wzi<lwd> wzi, wzi<has> wzi2, wzi<squ> wzi3) {
        return new lwo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new lwn((lwd) this.a.get(), (has) this.b.get(), (squ) this.c.get());
    }
}
