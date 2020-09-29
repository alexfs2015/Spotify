package defpackage;

/* renamed from: rlr reason: default package */
public final class rlr implements wig<rlq> {
    private final wzi<jlr> a;

    private rlr(wzi<jlr> wzi) {
        this.a = wzi;
    }

    public static rlr a(wzi<jlr> wzi) {
        return new rlr(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rlq((jlr) this.a.get());
    }
}
