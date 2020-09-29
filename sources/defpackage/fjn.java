package defpackage;

/* renamed from: fjn reason: default package */
public final class fjn<T> extends fin<T> {
    private final fim<T> a;
    private final fig<T> b;
    private fid c;
    private final fju<T> d;
    private final fio e;
    private final a f = new a<>(this, 0);
    private fin<T> g;

    /* renamed from: fjn$a */
    final class a {
        private a() {
        }

        /* synthetic */ a(fjn fjn, byte b) {
            this();
        }
    }

    public fjn(fim<T> fim, fig<T> fig, fid fid, fju<T> fju, fio fio) {
        this.a = fim;
        this.b = fig;
        this.c = fid;
        this.d = fju;
        this.e = null;
    }

    public final T a(fjv fjv) {
        if (this.b == null) {
            return b().a(fjv);
        }
        if (fja.a(fjv) instanceof fii) {
            return null;
        }
        return this.b.a();
    }

    public final void a(fjw fjw, T t) {
        fim<T> fim = this.a;
        if (fim == null) {
            b().a(fjw, t);
        } else if (t == null) {
            fjw.e();
        } else {
            fja.a(fim.a(), fjw);
        }
    }

    private fin<T> b() {
        fin<T> fin = this.g;
        if (fin != null) {
            return fin;
        }
        fin<T> a2 = this.c.a(this.e, this.d);
        this.g = a2;
        return a2;
    }
}
