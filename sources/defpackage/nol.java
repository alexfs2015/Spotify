package defpackage;

/* renamed from: nol reason: default package */
public final class nol implements wig<nok> {
    private final wzi<Boolean> a;
    private final wzi<rog> b;
    private final wzi<njg> c;
    private final wzi<njc> d;
    private final wzi<nme> e;

    private nol(wzi<Boolean> wzi, wzi<rog> wzi2, wzi<njg> wzi3, wzi<njc> wzi4, wzi<nme> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static nol a(wzi<Boolean> wzi, wzi<rog> wzi2, wzi<njg> wzi3, wzi<njc> wzi4, wzi<nme> wzi5) {
        nol nol = new nol(wzi, wzi2, wzi3, wzi4, wzi5);
        return nol;
    }

    public final /* synthetic */ Object get() {
        nok nok = new nok(((Boolean) this.a.get()).booleanValue(), this.b, (njg) this.c.get(), (njc) this.d.get(), (nme) this.e.get());
        return nok;
    }
}
