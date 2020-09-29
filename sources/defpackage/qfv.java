package defpackage;

/* renamed from: qfv reason: default package */
public final class qfv implements wig<Boolean> {
    private final wzi<sqy> a;
    private final wzi<fqn> b;

    private qfv(wzi<sqy> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qfv a(wzi<sqy> wzi, wzi<fqn> wzi2) {
        return new qfv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        sqy sqy = (sqy) this.a.get();
        return Boolean.valueOf(((Boolean) ((fqn) fbp.a((fqn) this.b.get())).a(soz.h)).booleanValue());
    }
}
