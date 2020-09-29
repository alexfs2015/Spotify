package defpackage;

/* renamed from: ghx reason: default package */
public final class ghx implements vua<ghl> {
    private final wlc<ghd> a;

    private ghx(wlc<ghd> wlc) {
        this.a = wlc;
    }

    public static ghx a(wlc<ghd> wlc) {
        return new ghx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ghl) vuf.a((ghd) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
