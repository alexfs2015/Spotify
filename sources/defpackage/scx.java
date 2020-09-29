package defpackage;

/* renamed from: scx reason: default package */
public final class scx implements vua<scw> {
    private final wlc<sbb> a;

    private scx(wlc<sbb> wlc) {
        this.a = wlc;
    }

    public static scx a(wlc<sbb> wlc) {
        return new scx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scw((sbb) this.a.get());
    }
}
