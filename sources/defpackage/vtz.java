package defpackage;

/* renamed from: vtz reason: default package */
public final class vtz<T> implements vti<T>, wlc<T> {
    private static final Object a = new Object();
    private static /* synthetic */ boolean d = (!vtz.class.desiredAssertionStatus());
    private volatile wlc<T> b;
    private volatile Object c = a;

    private vtz(wlc<T> wlc) {
        if (d || wlc != null) {
            this.b = wlc;
            return;
        }
        throw new AssertionError();
    }

    public final T get() {
        T t = this.c;
        if (t == a) {
            synchronized (this) {
                t = this.c;
                if (t == a) {
                    t = this.b.get();
                    T t2 = this.c;
                    if (t2 != a && !(t2 instanceof vue)) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.c = t;
                    this.b = null;
                }
            }
        }
        return t;
    }

    public static <P extends wlc<T>, T> wlc<T> a(P p) {
        vuf.a(p);
        if (p instanceof vtz) {
            return p;
        }
        return new vtz(p);
    }

    public static <P extends wlc<T>, T> vti<T> b(P p) {
        if (p instanceof vti) {
            return (vti) p;
        }
        return new vtz((wlc) vuf.a(p));
    }
}
