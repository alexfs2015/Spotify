package defpackage;

/* renamed from: npa reason: default package */
public final class npa implements vua<nor> {
    private final wlc<nph> a;

    private npa(wlc<nph> wlc) {
        this.a = wlc;
    }

    public static npa a(wlc<nph> wlc) {
        return new npa(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nor) vuf.a(new nor((nph) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
