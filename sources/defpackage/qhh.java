package defpackage;

/* renamed from: qhh reason: default package */
public final class qhh implements wig<Boolean> {
    private final wzi<sqy> a;
    private final wzi<fqn> b;

    private qhh(wzi<sqy> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qhh a(wzi<sqy> wzi, wzi<fqn> wzi2) {
        return new qhh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        sqy sqy = (sqy) this.a.get();
        return Boolean.valueOf(sqy.b((fqn) this.b.get()));
    }
}
