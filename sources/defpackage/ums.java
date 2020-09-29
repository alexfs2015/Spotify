package defpackage;

/* renamed from: ums reason: default package */
public final class ums implements vua<umf> {
    private final wlc<uma> a;
    private final wlc<uly> b;
    private final wlc<umc> c;

    private ums(wlc<uma> wlc, wlc<uly> wlc2, wlc<umc> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ums a(wlc<uma> wlc, wlc<uly> wlc2, wlc<umc> wlc3) {
        return new ums(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (umf) vuf.a(new umg((uma) this.a.get(), (uly) this.b.get(), (umc) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
