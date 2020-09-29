package defpackage;

/* renamed from: pke reason: default package */
public final class pke implements wig<pkd> {
    private final wzi<pkg> a;
    private final wzi<pkz> b;
    private final wzi<pkv> c;
    private final wzi<pkr> d;

    private pke(wzi<pkg> wzi, wzi<pkz> wzi2, wzi<pkv> wzi3, wzi<pkr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pke a(wzi<pkg> wzi, wzi<pkz> wzi2, wzi<pkv> wzi3, wzi<pkr> wzi4) {
        return new pke(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pkd((pkg) this.a.get(), (pkz) this.b.get(), (pkv) this.c.get(), (pkr) this.d.get());
    }
}
