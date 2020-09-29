package defpackage;

/* renamed from: jyc reason: default package */
public final class jyc implements wig<jyb> {
    private final wzi<jrt> a;
    private final wzi<viy> b;
    private final wzi<hgz> c;

    private jyc(wzi<jrt> wzi, wzi<viy> wzi2, wzi<hgz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static jyc a(wzi<jrt> wzi, wzi<viy> wzi2, wzi<hgz> wzi3) {
        return new jyc(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new jyb((jrt) this.a.get(), (viy) this.b.get(), (hgz) this.c.get());
    }
}
