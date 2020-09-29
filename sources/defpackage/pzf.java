package defpackage;

/* renamed from: pzf reason: default package */
public final class pzf implements vua<pze> {
    private final wlc<pzg> a;
    private final wlc<ryy> b;

    private pzf(wlc<pzg> wlc, wlc<ryy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pzf a(wlc<pzg> wlc, wlc<ryy> wlc2) {
        return new pzf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pze((pzg) this.a.get(), (ryy) this.b.get());
    }
}
