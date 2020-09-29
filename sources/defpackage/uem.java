package defpackage;

/* renamed from: uem reason: default package */
public abstract class uem {
    public static final uem a;

    /* renamed from: uem$a */
    public interface a {
        a a(Long l);

        uem a();

        a b(Long l);

        a c(Long l);
    }

    static {
        a aVar = new a();
        Long valueOf = Long.valueOf(0);
        a = aVar.a(valueOf).b(valueOf).c(valueOf).a();
    }

    public static a e() {
        return new a();
    }

    public abstract Long a();

    public boolean a(uem uem) {
        a d = d();
        Long valueOf = Long.valueOf(0);
        return d.c(valueOf).a().equals(uem.d().c(valueOf).a());
    }

    public abstract Long b();

    public abstract Long c();

    public abstract a d();
}
