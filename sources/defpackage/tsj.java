package defpackage;

/* renamed from: tsj reason: default package */
public abstract class tsj {
    public static final tsj a;

    /* renamed from: tsj$a */
    public interface a {
        a a(Long l);

        tsj a();

        a b(Long l);

        a c(Long l);
    }

    public abstract Long a();

    public abstract Long b();

    public abstract Long c();

    public abstract a d();

    public static a e() {
        return new a();
    }

    public boolean a(tsj tsj) {
        a d = d();
        Long valueOf = Long.valueOf(0);
        return d.c(valueOf).a().equals(tsj.d().c(valueOf).a());
    }

    static {
        a aVar = new a();
        Long valueOf = Long.valueOf(0);
        a = aVar.a(valueOf).b(valueOf).c(valueOf).a();
    }
}
