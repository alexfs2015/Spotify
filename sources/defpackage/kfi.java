package defpackage;

/* renamed from: kfi reason: default package */
public abstract class kfi {
    public static final kfi a;

    /* renamed from: kfi$a */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(String str);

        public abstract a a(boolean z);

        public abstract kfi a();

        public abstract a b(long j);

        public abstract a c(long j);
    }

    public abstract String a();

    public abstract boolean b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    public abstract a f();

    public final boolean g() {
        return d() > 0;
    }

    public final boolean h() {
        return !g() && !b();
    }

    public final kfi a(boolean z) {
        return f().a(z).a();
    }

    public final long a(long j) {
        long e = e();
        long j2 = 0;
        if (d() > 0) {
            j2 = j - d();
        }
        return e + j2;
    }

    static {
        a aVar = new a();
        aVar.a = null;
        a = aVar.a(false).a(0).b(0).c(0).a();
    }
}
