package defpackage;

/* renamed from: ryn reason: default package */
public final class ryn implements wig<rym> {
    private final wzi<jlr> a;
    private final wzi<jtp> b;

    private ryn(wzi<jlr> wzi, wzi<jtp> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ryn a(wzi<jlr> wzi, wzi<jtp> wzi2) {
        return new ryn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rym((jlr) this.a.get(), (jtp) this.b.get());
    }
}
