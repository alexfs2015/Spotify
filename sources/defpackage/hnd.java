package defpackage;

/* renamed from: hnd reason: default package */
public abstract class hnd {

    /* renamed from: hnd$a */
    public interface a {
        hnd a();

        a b(String str);

        a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public static hnd a(String str) {
        a a2 = new defpackage.hnb.a().a(str);
        String str2 = "";
        return a2.b(str2).c(str2).a();
    }
}
