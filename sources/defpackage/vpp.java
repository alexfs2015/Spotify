package defpackage;

/* renamed from: vpp reason: default package */
public final class vpp implements wig<vpo> {
    private final wzi<jlr> a;
    private final wzi<jtz> b;

    private vpp(wzi<jlr> wzi, wzi<jtz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vpp a(wzi<jlr> wzi, wzi<jtz> wzi2) {
        return new vpp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vpo((jlr) this.a.get(), (jtz) this.b.get());
    }
}
