package defpackage;

/* renamed from: svt reason: default package */
public final class svt implements vua<svs> {
    private final wlc<tjv> a;

    private svt(wlc<tjv> wlc) {
        this.a = wlc;
    }

    public static svt a(wlc<tjv> wlc) {
        return new svt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new svs((tjv) this.a.get());
    }
}
