package defpackage;

/* renamed from: oxd reason: default package */
public final class oxd implements wig<oxc> {
    private final wzi<oxe> a;
    private final wzi<b> b;
    private final wzi<a> c;
    private final wzi<oxi> d;
    private final wzi<vsb> e;
    private final wzi<a> f;

    private oxd(wzi<oxe> wzi, wzi<b> wzi2, wzi<a> wzi3, wzi<oxi> wzi4, wzi<vsb> wzi5, wzi<a> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static oxd a(wzi<oxe> wzi, wzi<b> wzi2, wzi<a> wzi3, wzi<oxi> wzi4, wzi<vsb> wzi5, wzi<a> wzi6) {
        oxd oxd = new oxd(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return oxd;
    }

    public final /* synthetic */ Object get() {
        oxc oxc = new oxc((oxe) this.a.get(), (b) this.b.get(), (a) this.c.get(), (oxi) this.d.get(), (vsb) this.e.get(), (a) this.f.get());
        return oxc;
    }
}
