package defpackage;

/* renamed from: fgf reason: default package */
final class fgf<T> implements fin<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile fin<T> c;

    fgf(ffu<T> ffu, fft fft) {
        this.c = new fgg(ffu, fft);
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
