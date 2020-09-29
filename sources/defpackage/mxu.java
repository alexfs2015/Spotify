package defpackage;

/* renamed from: mxu reason: default package */
public final class mxu implements wig<mxt> {
    private final wzi<Boolean> a;
    private final wzi<rog> b;
    private final wzi<mxv> c;
    private final wzi<suo> d;

    private mxu(wzi<Boolean> wzi, wzi<rog> wzi2, wzi<mxv> wzi3, wzi<suo> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mxu a(wzi<Boolean> wzi, wzi<rog> wzi2, wzi<mxv> wzi3, wzi<suo> wzi4) {
        return new mxu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mxt(((Boolean) this.a.get()).booleanValue(), this.b, wif.b(this.c), (suo) this.d.get());
    }
}
