package defpackage;

/* renamed from: nmj reason: default package */
public final class nmj implements wig<nmi> {
    private final wzi<vll> a;
    private final wzi<rog> b;
    private final wzi<njc> c;
    private final wzi<njg> d;
    private final wzi<Boolean> e;
    private final wzi<Boolean> f;

    private nmj(wzi<vll> wzi, wzi<rog> wzi2, wzi<njc> wzi3, wzi<njg> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static nmj a(wzi<vll> wzi, wzi<rog> wzi2, wzi<njc> wzi3, wzi<njg> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        nmj nmj = new nmj(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return nmj;
    }

    public final /* synthetic */ Object get() {
        nmi nmi = new nmi((vll) this.a.get(), this.b, (njc) this.c.get(), (njg) this.d.get(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return nmi;
    }
}
