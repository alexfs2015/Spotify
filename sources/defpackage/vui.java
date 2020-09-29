package defpackage;

/* renamed from: vui reason: default package */
public final class vui<T> implements wlc<T> {
    private static final Object a = new Object();
    private static /* synthetic */ boolean d = (!vui.class.desiredAssertionStatus());
    private volatile wlc<T> b;
    private volatile Object c = a;

    private vui(wlc<T> wlc) {
        if (d || wlc != null) {
            this.b = wlc;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.c;
        if (t != a) {
            return t;
        }
        wlc<T> wlc = this.b;
        if (wlc == null) {
            return this.c;
        }
        T t2 = wlc.get();
        this.c = t2;
        this.b = null;
        return t2;
    }

    public static <P extends wlc<T>, T> wlc<T> a(P p) {
        return ((p instanceof vui) || (p instanceof vtz)) ? p : new vui((wlc) vuf.a(p));
    }
}
