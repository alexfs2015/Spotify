package defpackage;

/* renamed from: uhn reason: default package */
public final class uhn implements wig<uhm> {
    private final wzi<uhz> a;
    private final wzi<lav> b;
    private final wzi<uho> c;
    private final wzi<uhq> d;
    private final wzi<szp> e;

    private uhn(wzi<uhz> wzi, wzi<lav> wzi2, wzi<uho> wzi3, wzi<uhq> wzi4, wzi<szp> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static uhn a(wzi<uhz> wzi, wzi<lav> wzi2, wzi<uho> wzi3, wzi<uhq> wzi4, wzi<szp> wzi5) {
        uhn uhn = new uhn(wzi, wzi2, wzi3, wzi4, wzi5);
        return uhn;
    }

    public final /* synthetic */ Object get() {
        uhm uhm = new uhm((uhz) this.a.get(), (lav) this.b.get(), (uho) this.c.get(), (uhq) this.d.get(), (szp) this.e.get());
        return uhm;
    }
}
