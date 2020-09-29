package defpackage;

/* renamed from: nam reason: default package */
public final class nam implements vua<nal> {
    private final wlc<ghm> a;

    private nam(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nam a(wlc<ghm> wlc) {
        return new nam(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nal) vuf.a((nal) ((ghm) this.a.get()).b(nal.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
