package defpackage;

/* renamed from: pes reason: default package */
public final class pes implements wig<Boolean> {
    private final wzi<fqn> a;

    private pes(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pes a(wzi<fqn> wzi) {
        return new pes(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(isu.a((fqn) this.a.get()));
    }
}
