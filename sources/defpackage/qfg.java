package defpackage;

/* renamed from: qfg reason: default package */
public final class qfg implements wig<qff> {
    private final wzi<squ> a;
    private final wzi<vai> b;
    private final wzi<van> c;

    private qfg(wzi<squ> wzi, wzi<vai> wzi2, wzi<van> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qfg a(wzi<squ> wzi, wzi<vai> wzi2, wzi<van> wzi3) {
        return new qfg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qff((squ) this.a.get(), (vai) this.b.get(), (van) this.c.get());
    }
}
