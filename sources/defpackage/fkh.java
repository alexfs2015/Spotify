package defpackage;

/* renamed from: fkh reason: default package */
public final class fkh<T> extends fjh<T> {
    private final fjg<T> a;
    private final fja<T> b;
    private fix c;
    private final fko<T> d;
    private final fji e;
    private final a f = new a<>(this, 0);
    private fjh<T> g;

    /* renamed from: fkh$a */
    final class a {
        private a() {
        }

        /* synthetic */ a(fkh fkh, byte b) {
            this();
        }
    }

    public fkh(fjg<T> fjg, fja<T> fja, fix fix, fko<T> fko, fji fji) {
        this.a = fjg;
        this.b = fja;
        this.c = fix;
        this.d = fko;
        this.e = null;
    }

    private fjh<T> b() {
        fjh<T> fjh = this.g;
        if (fjh != null) {
            return fjh;
        }
        fjh<T> a2 = this.c.a(this.e, this.d);
        this.g = a2;
        return a2;
    }

    public final T a(fkp fkp) {
        if (this.b == null) {
            return b().a(fkp);
        }
        if (fju.a(fkp) instanceof fjc) {
            return null;
        }
        return this.b.a();
    }

    public final void a(fkq fkq, T t) {
        fjg<T> fjg = this.a;
        if (fjg == null) {
            b().a(fkq, t);
        } else if (t == null) {
            fkq.e();
        } else {
            fju.a(fjg.a(), fkq);
        }
    }
}
