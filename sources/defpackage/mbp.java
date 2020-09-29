package defpackage;

/* renamed from: mbp reason: default package */
public final class mbp implements wig<vvr<hcs>> {
    private final wzi<mdq> a;
    private final wzi<mco> b;
    private final wzi<vrb> c;
    private final wzi<mcq> d;

    private mbp(wzi<mdq> wzi, wzi<mco> wzi2, wzi<vrb> wzi3, wzi<mcq> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mbp a(wzi<mdq> wzi, wzi<mco> wzi2, wzi<vrb> wzi3, wzi<mcq> wzi4) {
        return new mbp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        mco mco = (mco) this.b.get();
        vrb vrb = (vrb) this.c.get();
        mcq mcq = (mcq) this.d.get();
        mco.a(((mdq) this.a.get()).e());
        a a2 = new a().a(wit.a((c<T, R>) mco));
        if (vrb.b()) {
            a2.a(mcq);
        }
        return (vvr) wil.a(vvr.a(a2.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
