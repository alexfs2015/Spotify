package defpackage;

/* renamed from: nnw reason: default package */
public abstract class nnw {
    public static final nnw a = new a().a((hcs) hdb.EMPTY).a(false).b(false).c(false).d(false).a();

    /* renamed from: nnw$a */
    public interface a {
        a a(hcs hcs);

        a a(boolean z);

        nnw a();

        a b(boolean z);

        a c(boolean z);

        a d(boolean z);
    }

    public abstract hcs a();

    public final nnw a(hcs hcs) {
        return f().a(hcs).a(false).b(false).c(false).d(true).a();
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();

    public final boolean g() {
        return (b() || c() || d()) && !e() && !a().equals(hdb.EMPTY);
    }
}
