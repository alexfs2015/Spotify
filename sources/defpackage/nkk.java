package defpackage;

/* renamed from: nkk reason: default package */
public final class nkk implements vua<onm> {
    private final wlc<onn> a;
    private final wlc<gjf> b;

    private nkk(wlc<onn> wlc, wlc<gjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nkk a(wlc<onn> wlc, wlc<gjf> wlc2) {
        return new nkk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (onm) vuf.a(((onn) this.a.get()).a((gjf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
