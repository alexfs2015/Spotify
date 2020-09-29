package defpackage;

/* renamed from: ric reason: default package */
public final class ric implements wig<rib> {
    private final wzi<gdf> a;
    private final wzi<jwo> b;

    private ric(wzi<gdf> wzi, wzi<jwo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ric a(wzi<gdf> wzi, wzi<jwo> wzi2) {
        return new ric(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rib((gdf) this.a.get(), (jwo) this.b.get());
    }
}
