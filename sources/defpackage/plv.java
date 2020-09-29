package defpackage;

/* renamed from: plv reason: default package */
public final class plv implements vua<plh> {
    private final wlc<pmk> a;

    private plv(wlc<pmk> wlc) {
        this.a = wlc;
    }

    public static plv a(wlc<pmk> wlc) {
        return new plv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (plh) vuf.a(new plh((pmk) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
