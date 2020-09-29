package defpackage;

/* renamed from: lkg reason: default package */
public final class lkg implements vua<gdz<fko>> {
    private final wlc<gdy> a;

    private lkg(wlc<gdy> wlc) {
        this.a = wlc;
    }

    public static lkg a(wlc<gdy> wlc) {
        return new lkg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gdz) vuf.a(new gek((gdy) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
