package defpackage;

/* renamed from: mxe reason: default package */
public final class mxe implements wig<mxd> {
    private final wzi<mvh> a;
    private final wzi<mvj> b;
    private final wzi<gwm> c;
    private final wzi<mvf> d;

    private mxe(wzi<mvh> wzi, wzi<mvj> wzi2, wzi<gwm> wzi3, wzi<mvf> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mxe a(wzi<mvh> wzi, wzi<mvj> wzi2, wzi<gwm> wzi3, wzi<mvf> wzi4) {
        return new mxe(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mxd((mvh) this.a.get(), (mvj) this.b.get(), (gwm) this.c.get(), (mvf) this.d.get());
    }
}
