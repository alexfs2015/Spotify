package defpackage;

/* renamed from: spm reason: default package */
public final class spm implements wig<spl> {
    private final wzi<sqd> a;
    private final wzi<sqh> b;

    private spm(wzi<sqd> wzi, wzi<sqh> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static spm a(wzi<sqd> wzi, wzi<sqh> wzi2) {
        return new spm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new spl((sqd) this.a.get(), (sqh) this.b.get());
    }
}
