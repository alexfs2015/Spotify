package defpackage;

/* renamed from: umh reason: default package */
public final class umh implements vua<umg> {
    private final wlc<uma> a;
    private final wlc<uly> b;
    private final wlc<umc> c;

    private umh(wlc<uma> wlc, wlc<uly> wlc2, wlc<umc> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static umh a(wlc<uma> wlc, wlc<uly> wlc2, wlc<umc> wlc3) {
        return new umh(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new umg((uma) this.a.get(), (uly) this.b.get(), (umc) this.c.get());
    }
}
