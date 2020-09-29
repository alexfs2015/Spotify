package defpackage;

/* renamed from: lyw reason: default package */
public final class lyw implements wig<lyv> {
    private final wzi<lyx> a;
    private final wzi<has> b;

    private lyw(wzi<lyx> wzi, wzi<has> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lyw a(wzi<lyx> wzi, wzi<has> wzi2) {
        return new lyw(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lyv((lyx) this.a.get(), (has) this.b.get());
    }
}
