package defpackage;

/* renamed from: jll reason: default package */
public final class jll implements wig<jlj> {
    private final wzi<jsi> a;
    private final wzi<rqb> b;
    private final wzi<uix> c;
    private final wzi<srz> d;

    private jll(wzi<jsi> wzi, wzi<rqb> wzi2, wzi<uix> wzi3, wzi<srz> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static jll a(wzi<jsi> wzi, wzi<rqb> wzi2, wzi<uix> wzi3, wzi<srz> wzi4) {
        return new jll(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new jlj((jsi) this.a.get(), (rqb) this.b.get(), (uix) this.c.get(), (srz) this.d.get());
    }
}
