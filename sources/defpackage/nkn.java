package defpackage;

/* renamed from: nkn reason: default package */
public final class nkn implements vua<ouw> {
    private final wlc<oux> a;
    private final wlc<gjf> b;

    private nkn(wlc<oux> wlc, wlc<gjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nkn a(wlc<oux> wlc, wlc<gjf> wlc2) {
        return new nkn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ouw) vuf.a(((oux) this.a.get()).a((gjf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
