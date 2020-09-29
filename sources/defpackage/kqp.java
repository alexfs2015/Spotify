package defpackage;

/* renamed from: kqp reason: default package */
public final class kqp implements wig<kqo> {
    private final wzi<kfb> a;
    private final wzi<sff> b;

    private kqp(wzi<kfb> wzi, wzi<sff> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kqp a(wzi<kfb> wzi, wzi<sff> wzi2) {
        return new kqp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new kqo((kfb) this.a.get(), (sff) this.b.get());
    }
}
