package defpackage;

/* renamed from: qfe reason: default package */
public final class qfe implements wig<qfd> {
    private final wzi<spr> a;
    private final wzi<squ> b;

    private qfe(wzi<spr> wzi, wzi<squ> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qfe a(wzi<spr> wzi, wzi<squ> wzi2) {
        return new qfe(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qfd((spr) this.a.get(), (squ) this.b.get());
    }
}
