package defpackage;

/* renamed from: qum reason: default package */
public final class qum implements wig<qul> {
    private final wzi<gkq> a;
    private final wzi<qun> b;

    private qum(wzi<gkq> wzi, wzi<qun> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qum a(wzi<gkq> wzi, wzi<qun> wzi2) {
        return new qum(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qul((gkq) this.a.get(), (qun) this.b.get());
    }
}
