package defpackage;

/* renamed from: kzk reason: default package */
public final class kzk implements vua<kf> {
    private final wlc<ka> a;

    private kzk(wlc<ka> wlc) {
        this.a = wlc;
    }

    public static kzk a(wlc<ka> wlc) {
        return new kzk(wlc);
    }

    public static kf a(ka kaVar) {
        return (kf) vuf.a(kaVar.i(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ka) this.a.get());
    }
}
