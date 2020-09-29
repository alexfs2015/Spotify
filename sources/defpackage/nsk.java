package defpackage;

/* renamed from: nsk reason: default package */
public final class nsk implements vua<nsm> {
    private final wlc<nsl> a;
    private final wlc<vol> b;

    public static nsm a(nsl nsl, vol vol) {
        return (nsm) vuf.a(CC.a(nsl, vol), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((nsl) this.a.get(), (vol) this.b.get());
    }
}
