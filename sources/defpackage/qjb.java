package defpackage;

/* renamed from: qjb reason: default package */
public final class qjb implements wig<Boolean> {
    private final wzi<sqy> a;
    private final wzi<fqn> b;

    private qjb(wzi<sqy> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qjb a(wzi<sqy> wzi, wzi<fqn> wzi2) {
        return new qjb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        sqy sqy = (sqy) this.a.get();
        return Boolean.valueOf(sqy.b((fqn) this.b.get()));
    }
}
