package defpackage;

/* renamed from: rdp reason: default package */
public final class rdp implements wig<rdo> {
    private final wzi<rbg> a;
    private final wzi<vjp> b;
    private final wzi<rgf> c;
    private final wzi<jrn> d;

    private rdp(wzi<rbg> wzi, wzi<vjp> wzi2, wzi<rgf> wzi3, wzi<jrn> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rdp a(wzi<rbg> wzi, wzi<vjp> wzi2, wzi<rgf> wzi3, wzi<jrn> wzi4) {
        return new rdp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rdo(this.a, this.b, this.c, this.d);
    }
}
