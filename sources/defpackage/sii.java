package defpackage;

/* renamed from: sii reason: default package */
public final class sii implements vua<sih> {
    private final wlc<a> a;

    private sii(wlc<a> wlc) {
        this.a = wlc;
    }

    public static sii a(wlc<a> wlc) {
        return new sii(wlc);
    }

    public static sih a(a aVar) {
        return (sih) vuf.a(aVar.ae_(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((a) this.a.get());
    }
}
