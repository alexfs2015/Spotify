package defpackage;

/* renamed from: sme reason: default package */
public final class sme implements vua<smd> {
    private final wlc<ieg> a;

    private sme(wlc<ieg> wlc) {
        this.a = wlc;
    }

    public static sme a(wlc<ieg> wlc) {
        return new sme(wlc);
    }

    public final /* synthetic */ Object get() {
        return (smd) vuf.a(new smd((ieg) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
