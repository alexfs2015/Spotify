package defpackage;

/* renamed from: pjk reason: default package */
public final class pjk implements wig<pjj> {
    private final wzi<a> a;
    private final wzi<shg> b;

    private pjk(wzi<a> wzi, wzi<shg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pjk a(wzi<a> wzi, wzi<shg> wzi2) {
        return new pjk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pjj(wif.b(this.a), (shg) this.b.get());
    }
}
