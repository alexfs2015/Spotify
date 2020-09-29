package defpackage;

/* renamed from: wif reason: default package */
public final class wif<T> implements who<T>, wzi<T> {
    private static final Object a = new Object();
    private static /* synthetic */ boolean d = (!wif.class.desiredAssertionStatus());
    private volatile wzi<T> b;
    private volatile Object c = a;

    private wif(wzi<T> wzi) {
        if (d || wzi != null) {
            this.b = wzi;
            return;
        }
        throw new AssertionError();
    }

    public static <P extends wzi<T>, T> wzi<T> a(P p) {
        wil.a(p);
        return p instanceof wif ? p : new wif(p);
    }

    public static <P extends wzi<T>, T> who<T> b(P p) {
        return p instanceof who ? (who) p : new wif((wzi) wil.a(p));
    }

    public final T get() {
        T t = this.c;
        if (t == a) {
            synchronized (this) {
                t = this.c;
                if (t == a) {
                    t = this.b.get();
                    T t2 = this.c;
                    if (t2 != a && !(t2 instanceof wik)) {
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
}
