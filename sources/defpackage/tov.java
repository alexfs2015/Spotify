package defpackage;

/* renamed from: tov reason: default package */
public final class tov implements vua<tnb> {
    private final wlc<tnc> a;

    private tov(wlc<tnc> wlc) {
        this.a = wlc;
    }

    public static tov a(wlc<tnc> wlc) {
        return new tov(wlc);
    }

    public static tnb a(tnc tnc) {
        return (tnb) vuf.a(tnc.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((tnc) this.a.get());
    }
}
