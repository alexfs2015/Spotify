package defpackage;

/* renamed from: kto reason: default package */
public final class kto implements vua<ktn> {
    private final wlc<jrp> a;

    private kto(wlc<jrp> wlc) {
        this.a = wlc;
    }

    public static kto a(wlc<jrp> wlc) {
        return new kto(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ktn((jrp) this.a.get());
    }
}
