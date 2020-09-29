package defpackage;

/* renamed from: mzt reason: default package */
public final class mzt implements wig<mzs> {
    private final wzi<mzm> a;
    private final wzi<ttd> b;

    private mzt(wzi<mzm> wzi, wzi<ttd> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mzt a(wzi<mzm> wzi, wzi<ttd> wzi2) {
        return new mzt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mzs((mzm) this.a.get(), (ttd) this.b.get());
    }
}
