package defpackage;

/* renamed from: nhm reason: default package */
public final class nhm implements wig<has> {
    private final wzi<jlr> a;
    private final wzi<uqm> b;

    private nhm(wzi<jlr> wzi, wzi<uqm> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nhm a(wzi<jlr> wzi, wzi<uqm> wzi2) {
        return new nhm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (has) wil.a(CC.a((jlr) this.a.get(), (uqm) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
