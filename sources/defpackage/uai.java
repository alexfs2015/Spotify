package defpackage;

/* renamed from: uai reason: default package */
public final class uai implements wig<uah> {
    private final wzi<sgp> a;
    private final wzi<Boolean> b;

    private uai(wzi<sgp> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uai a(wzi<sgp> wzi, wzi<Boolean> wzi2) {
        return new uai(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new uah((sgp) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
