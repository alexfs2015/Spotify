package defpackage;

/* renamed from: vug reason: default package */
public final class vug<T> implements wlc<vti<T>> {
    private static /* synthetic */ boolean b = (!vug.class.desiredAssertionStatus());
    private final wlc<T> a;

    private vug(wlc<T> wlc) {
        if (b || wlc != null) {
            this.a = wlc;
            return;
        }
        throw new AssertionError();
    }

    public static <T> wlc<vti<T>> a(wlc<T> wlc) {
        return new vug((wlc) vuf.a(wlc));
    }

    public final /* synthetic */ Object get() {
        return vtz.b(this.a);
    }
}
