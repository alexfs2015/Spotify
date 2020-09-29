package defpackage;

/* renamed from: ntm reason: default package */
public final class ntm implements vua<ntl> {
    private final wlc<nss> a;

    private ntm(wlc<nss> wlc) {
        this.a = wlc;
    }

    public static ntm a(wlc<nss> wlc) {
        return new ntm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ntl((nss) this.a.get());
    }
}
