package defpackage;

/* renamed from: njm reason: default package */
public final class njm implements vua<njl> {
    private final wlc<nde> a;

    private njm(wlc<nde> wlc) {
        this.a = wlc;
    }

    public static njm a(wlc<nde> wlc) {
        return new njm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new njl((nde) this.a.get());
    }
}
