package defpackage;

/* renamed from: sde reason: default package */
public final class sde implements vua<sdd> {
    private final wlc<rzh> a;
    private final wlc<sgy<gzz>> b;

    private sde(wlc<rzh> wlc, wlc<sgy<gzz>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sde a(wlc<rzh> wlc, wlc<sgy<gzz>> wlc2) {
        return new sde(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sdd((rzh) this.a.get(), (sgy) this.b.get());
    }
}
