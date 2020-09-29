package defpackage;

/* renamed from: lwb reason: default package */
public final class lwb implements wig<lwa> {
    private final wzi<fqn> a;
    private final wzi<rqb> b;

    private lwb(wzi<fqn> wzi, wzi<rqb> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lwb a(wzi<fqn> wzi, wzi<rqb> wzi2) {
        return new lwb(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new lwa((fqn) this.a.get(), (rqb) this.b.get());
    }
}
