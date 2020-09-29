package defpackage;

/* renamed from: qjz reason: default package */
public final class qjz implements wig<vvr<hcs>> {
    private final wzi<fqn> a;
    private final wzi<Boolean> b;
    private final wzi<uix> c;
    private final wzi<rqb> d;
    private final wzi<rof> e;
    private final wzi<qkg> f;
    private final wzi<qki> g;

    private qjz(wzi<fqn> wzi, wzi<Boolean> wzi2, wzi<uix> wzi3, wzi<rqb> wzi4, wzi<rof> wzi5, wzi<qkg> wzi6, wzi<qki> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static qjz a(wzi<fqn> wzi, wzi<Boolean> wzi2, wzi<uix> wzi3, wzi<rqb> wzi4, wzi<rof> wzi5, wzi<qkg> wzi6, wzi<qki> wzi7) {
        qjz qjz = new qjz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return qjz;
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        boolean booleanValue = ((Boolean) this.b.get()).booleanValue();
        uix uix = (uix) this.c.get();
        rqb rqb = (rqb) this.d.get();
        wzi<rof> wzi = this.e;
        wzi<qkg> wzi2 = this.f;
        wzi<qki> wzi3 = this.g;
        a aVar = new a();
        if (rqb.a(fqn) || uix.a(fqn)) {
            aVar.a(wit.a((c) wzi.get()));
            if (booleanValue) {
                aVar.a(wit.a((c) wzi2.get()));
            }
            if (booleanValue) {
                aVar.a(wit.a((c) wzi3.get()));
            }
        }
        return (vvr) wil.a(vvr.a(aVar.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
