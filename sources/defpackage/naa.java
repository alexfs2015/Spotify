package defpackage;

/* renamed from: naa reason: default package */
public final class naa implements wig<mzz> {
    private final wzi<Boolean> a;
    private final wzi<lbi> b;
    private final wzi<rog> c;
    private final wzi<mzx> d;
    private final wzi<mxv> e;

    private naa(wzi<Boolean> wzi, wzi<lbi> wzi2, wzi<rog> wzi3, wzi<mzx> wzi4, wzi<mxv> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static naa a(wzi<Boolean> wzi, wzi<lbi> wzi2, wzi<rog> wzi3, wzi<mzx> wzi4, wzi<mxv> wzi5) {
        naa naa = new naa(wzi, wzi2, wzi3, wzi4, wzi5);
        return naa;
    }

    public final /* synthetic */ Object get() {
        mzz mzz = new mzz(((Boolean) this.a.get()).booleanValue(), (lbi) this.b.get(), this.c, wif.b(this.d), wif.b(this.e));
        return mzz;
    }
}
