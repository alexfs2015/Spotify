package defpackage;

/* renamed from: lnb reason: default package */
public final class lnb implements wig<vwz> {
    private final wzi<tgl> a;

    private lnb(wzi<tgl> wzi) {
        this.a = wzi;
    }

    public static lnb a(wzi<tgl> wzi) {
        return new lnb(wzi);
    }

    public static vwz a(tgl tgl) {
        return (vwz) wil.a(CC.a(tgl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tgl) this.a.get());
    }
}
