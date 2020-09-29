package defpackage;

/* renamed from: lpi reason: default package */
public final class lpi implements wig<lqb> {
    private final wzi<lpp> a;

    private lpi(wzi<lpp> wzi) {
        this.a = wzi;
    }

    public static lpi a(wzi<lpp> wzi) {
        return new lpi(wzi);
    }

    public static lqb a(lpp lpp) {
        return (lqb) wil.a(CC.a(lpp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((lpp) this.a.get());
    }
}
