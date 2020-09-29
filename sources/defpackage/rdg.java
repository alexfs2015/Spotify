package defpackage;

/* renamed from: rdg reason: default package */
public final class rdg implements vua<rdf> {
    private final wlc<rkw> a;
    private final wlc<rdj> b;

    private rdg(wlc<rkw> wlc, wlc<rdj> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rdg a(wlc<rkw> wlc, wlc<rdj> wlc2) {
        return new rdg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rdf((rkw) this.a.get(), (rdj) this.b.get());
    }
}
