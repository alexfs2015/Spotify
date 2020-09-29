package defpackage;

/* renamed from: uqp reason: default package */
public final class uqp implements wig<gkq> {
    private final wzi<uqq> a;

    private uqp(wzi<uqq> wzi) {
        this.a = wzi;
    }

    public static gkq a(uqq uqq) {
        return (gkq) wil.a(uqq.aj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static uqp a(wzi<uqq> wzi) {
        return new uqp(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((uqq) this.a.get());
    }
}
