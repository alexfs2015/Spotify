package defpackage;

/* renamed from: ffl reason: default package */
final class ffl<T> implements fht<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile fht<T> c;

    ffl(ffa<T> ffa, fez fez) {
        this.c = new ffm(ffa, fez);
    }

    public final T a() {
        T t = this.b;
        if (t == a) {
            synchronized (this) {
                t = this.b;
                if (t == a) {
                    t = this.c.a();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
