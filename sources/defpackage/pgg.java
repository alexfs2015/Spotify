package defpackage;

/* renamed from: pgg reason: default package */
public final class pgg implements wig<pgf> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;
    private final wzi<Boolean> c;

    private pgg(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pgg a(wzi<Boolean> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3) {
        return new pgg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pgf(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue(), ((Boolean) this.c.get()).booleanValue());
    }
}
