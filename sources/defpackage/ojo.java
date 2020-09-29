package defpackage;

/* renamed from: ojo reason: default package */
public final class ojo implements vua<ovf> {
    private final wlc<ovg> a;
    private final wlc<oeu> b;

    private ojo(wlc<ovg> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojo a(wlc<ovg> wlc, wlc<oeu> wlc2) {
        return new ojo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ovf) vuf.a(new ovi((opb) ovg.a(((ovg) this.a.get()).a.get(), 1), (gjf) ovg.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
