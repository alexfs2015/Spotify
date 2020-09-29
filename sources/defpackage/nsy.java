package defpackage;

/* renamed from: nsy reason: default package */
public final class nsy implements vua<nsx> {
    private final wlc<nss> a;

    private nsy(wlc<nss> wlc) {
        this.a = wlc;
    }

    public static nsy a(wlc<nss> wlc) {
        return new nsy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nsx((nss) this.a.get());
    }
}
