package defpackage;

/* renamed from: qid reason: default package */
public final class qid implements wig<qic> {
    private final wzi<qie> a;
    private final wzi<sim> b;

    private qid(wzi<qie> wzi, wzi<sim> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qid a(wzi<qie> wzi, wzi<sim> wzi2) {
        return new qid(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qic((qie) this.a.get(), (sim) this.b.get());
    }
}
