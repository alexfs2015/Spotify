package defpackage;

/* renamed from: wio reason: default package */
public final class wio<T> implements wzi<T> {
    private static final Object a = new Object();
    private static /* synthetic */ boolean d = (!wio.class.desiredAssertionStatus());
    private volatile wzi<T> b;
    private volatile Object c = a;

    private wio(wzi<T> wzi) {
        if (d || wzi != null) {
            this.b = wzi;
            return;
        }
        throw new AssertionError();
    }

    public static <P extends wzi<T>, T> wzi<T> a(P p) {
        return ((p instanceof wio) || (p instanceof wif)) ? p : new wio((wzi) wil.a(p));
    }

    public final T get() {
        T t = this.c;
        if (t != a) {
            return t;
        }
        wzi<T> wzi = this.b;
        if (wzi == null) {
            return this.c;
        }
        T t2 = wzi.get();
        this.c = t2;
        this.b = null;
        return t2;
    }
}
