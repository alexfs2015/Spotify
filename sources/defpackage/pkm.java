package defpackage;

/* renamed from: pkm reason: default package */
public final class pkm implements wig<pkc> {
    private final wzi<fqn> a;
    private final wzi<pkd> b;

    private pkm(wzi<fqn> wzi, wzi<pkd> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pkm a(wzi<fqn> wzi, wzi<pkd> wzi2) {
        return new pkm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (pkc) wil.a(((fqn) this.a.get()).b(pkp.a) ? (pkc) this.b.get() : pkc.a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
