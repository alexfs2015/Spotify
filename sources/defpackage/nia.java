package defpackage;

/* renamed from: nia reason: default package */
public abstract class nia {
    public static final nia a = new a().a((gzz) hai.EMPTY).a(false).b(false).c(false).d(false).a();

    /* renamed from: nia$a */
    public interface a {
        a a(gzz gzz);

        a a(boolean z);

        nia a();

        a b(boolean z);

        a c(boolean z);

        a d(boolean z);
    }

    public abstract gzz a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();

    public final nia a(gzz gzz) {
        return f().a(gzz).a(false).b(false).c(false).d(true).a();
    }

    public final boolean g() {
        return (b() || c() || d()) && !e() && !a().equals(hai.EMPTY);
    }
}
