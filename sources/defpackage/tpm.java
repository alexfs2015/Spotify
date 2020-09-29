package defpackage;

/* renamed from: tpm reason: default package */
public final class tpm implements vua<tnb> {
    private final wlc<tnc> a;

    private tpm(wlc<tnc> wlc) {
        this.a = wlc;
    }

    public static tpm a(wlc<tnc> wlc) {
        return new tpm(wlc);
    }

    public static tnb a(tnc tnc) {
        return (tnb) vuf.a(tnc.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tnc) this.a.get());
    }
}
