package defpackage;

/* renamed from: opt reason: default package */
public final class opt implements vua<oph> {
    private final wlc<ghm> a;

    private opt(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static opt a(wlc<ghm> wlc) {
        return new opt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (oph) vuf.a((oph) ((ghm) this.a.get()).a(oph.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
