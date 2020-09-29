package defpackage;

/* renamed from: tod reason: default package */
public final class tod implements vua<tnb> {
    private final wlc<tnc> a;

    private tod(wlc<tnc> wlc) {
        this.a = wlc;
    }

    public static tod a(wlc<tnc> wlc) {
        return new tod(wlc);
    }

    public static tnb a(tnc tnc) {
        return (tnb) vuf.a(tnc.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tnc) this.a.get());
    }
}
