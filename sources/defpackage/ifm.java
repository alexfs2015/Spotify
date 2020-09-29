package defpackage;

/* renamed from: ifm reason: default package */
public final class ifm implements wig<ifl> {
    private final wzi<ifr> a;
    private final wzi<ifx> b;
    private final wzi<ifp> c;
    private final wzi<ifv> d;

    private ifm(wzi<ifr> wzi, wzi<ifx> wzi2, wzi<ifp> wzi3, wzi<ifv> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ifm a(wzi<ifr> wzi, wzi<ifx> wzi2, wzi<ifp> wzi3, wzi<ifv> wzi4) {
        return new ifm(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ifl((ifr) this.a.get(), (ifx) this.b.get(), (ifp) this.c.get(), (ifv) this.d.get());
    }
}
