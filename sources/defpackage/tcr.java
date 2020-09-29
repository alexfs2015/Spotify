package defpackage;

/* renamed from: tcr reason: default package */
public final class tcr implements wig<tcq> {
    private final wzi<fqn> a;

    private tcr(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static tcr a(wzi<fqn> wzi) {
        return new tcr(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tcq((fqn) this.a.get());
    }
}
