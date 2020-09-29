package defpackage;

/* renamed from: mlf reason: default package */
public final class mlf implements vua<Boolean> {
    private final wlc<rqd> a;

    private mlf(wlc<rqd> wlc) {
        this.a = wlc;
    }

    public static mlf a(wlc<rqd> wlc) {
        return new mlf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Boolean) vuf.a(Boolean.valueOf(((rqd) this.a.get()).a(false)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
