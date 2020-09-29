package defpackage;

/* renamed from: qfn reason: default package */
public final class qfn implements wig<Boolean> {
    private final wzi<fqn> a;
    private final wzi<sqy> b;
    private final wzi<Boolean> c;

    private qfn(wzi<fqn> wzi, wzi<sqy> wzi2, wzi<Boolean> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qfn a(wzi<fqn> wzi, wzi<sqy> wzi2, wzi<Boolean> wzi3) {
        return new qfn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        sqy sqy = (sqy) this.b.get();
        return Boolean.valueOf(!((Boolean) this.c.get()).booleanValue() && ((fqn) fbp.a((fqn) this.a.get())).b(soz.a));
    }
}
