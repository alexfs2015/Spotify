package defpackage;

/* renamed from: pdn reason: default package */
public final class pdn implements wig<pdm> {
    private final wzi<pdk> a;
    private final wzi<a> b;

    private pdn(wzi<pdk> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pdn a(wzi<pdk> wzi, wzi<a> wzi2) {
        return new pdn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pdm((pdk) this.a.get(), (a) this.b.get());
    }
}
