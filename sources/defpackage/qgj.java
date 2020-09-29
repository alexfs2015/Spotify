package defpackage;

/* renamed from: qgj reason: default package */
public final class qgj implements wig<vvr<hcs>> {
    private final wzi<gwr> a;
    private final wzi<qia> b;

    private qgj(wzi<gwr> wzi, wzi<qia> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qgj a(wzi<gwr> wzi, wzi<qia> wzi2) {
        return new qgj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        qia qia = (qia) this.b.get();
        qia.a(((gwr) this.a.get()).e());
        return (vvr) wil.a(vvr.a(new a().a(wit.a((c<T, R>) qia)).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
