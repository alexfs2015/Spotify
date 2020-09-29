package defpackage;

/* renamed from: pjh reason: default package */
public final class pjh implements wig<pjg> {
    private final wzi<piv> a;
    private final wzi<lav> b;
    private final wzi<pji> c;

    private pjh(wzi<piv> wzi, wzi<lav> wzi2, wzi<pji> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static pjh a(wzi<piv> wzi, wzi<lav> wzi2, wzi<pji> wzi3) {
        return new pjh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new pjg((piv) this.a.get(), (lav) this.b.get(), (pji) this.c.get());
    }
}
