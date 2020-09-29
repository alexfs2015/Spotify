package defpackage;

/* renamed from: vty reason: default package */
public final class vty<T> implements vua<T> {
    private wlc<T> a;

    public final T get() {
        wlc<T> wlc = this.a;
        if (wlc != null) {
            return wlc.get();
        }
        throw new IllegalStateException();
    }

    public static <T> void a(wlc<T> wlc, wlc<T> wlc2) {
        vuf.a(wlc2);
        vty vty = (vty) wlc;
        if (vty.a == null) {
            vty.a = wlc2;
            return;
        }
        throw new IllegalStateException();
    }
}
