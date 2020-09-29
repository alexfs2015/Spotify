package defpackage;

/* renamed from: oqs reason: default package */
public final class oqs implements wig<pcq> {
    private final wzi<pcr> a;
    private final wzi<oma> b;

    private oqs(wzi<pcr> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqs a(wzi<pcr> wzi, wzi<oma> wzi2) {
        return new oqs(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (pcq) wil.a(new pct((owh) pcr.a(((pcr) this.a.get()).a.get(), 1), (gkq) pcr.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
