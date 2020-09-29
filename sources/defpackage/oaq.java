package defpackage;

/* renamed from: oaq reason: default package */
public final class oaq implements wig<oap> {
    private final wzi<oan> a;
    private final wzi<a> b;
    private final wzi<a> c;

    private oaq(wzi<oan> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static oaq a(wzi<oan> wzi, wzi<a> wzi2, wzi<a> wzi3) {
        return new oaq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new oap((oan) this.a.get(), (a) this.b.get(), (a) this.c.get());
    }
}
