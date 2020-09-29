package defpackage;

/* renamed from: hnq reason: default package */
public final class hnq implements vua<hde> {
    private final wlc<hqy> a;

    private hnq(wlc<hqy> wlc) {
        this.a = wlc;
    }

    public static hnq a(wlc<hqy> wlc) {
        return new hnq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hde) vuf.a(((hqy) this.a.get()).get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
