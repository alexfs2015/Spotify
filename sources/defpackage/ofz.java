package defpackage;

/* renamed from: ofz reason: default package */
public final class ofz implements vua<oga> {
    private final wlc<ghm> a;

    private ofz(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static ofz a(wlc<ghm> wlc) {
        return new ofz(wlc);
    }

    public final /* synthetic */ Object get() {
        return (oga) vuf.a((oga) ((ghm) this.a.get()).a(oga.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
