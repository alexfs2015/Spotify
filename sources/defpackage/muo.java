package defpackage;

/* renamed from: muo reason: default package */
public final class muo implements wig<mun> {
    private final wzi<mvd> a;
    private final wzi<mvb> b;
    private final wzi<muz> c;

    private muo(wzi<mvd> wzi, wzi<mvb> wzi2, wzi<muz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static muo a(wzi<mvd> wzi, wzi<mvb> wzi2, wzi<muz> wzi3) {
        return new muo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new mun((mvd) this.a.get(), (mvb) this.b.get(), (muz) this.c.get());
    }
}
