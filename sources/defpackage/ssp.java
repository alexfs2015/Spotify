package defpackage;

/* renamed from: ssp reason: default package */
public final class ssp implements wig<sso> {
    private final wzi<a> a;

    private ssp(wzi<a> wzi) {
        this.a = wzi;
    }

    public static sso a(a aVar) {
        return (sso) wil.a(aVar.ae_(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static ssp a(wzi<a> wzi) {
        return new ssp(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
