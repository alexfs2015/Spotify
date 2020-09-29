package defpackage;

import java.util.List;

/* renamed from: tgf reason: default package */
public final class tgf {
    public final List<a> a;
    public final String b;
    final String c;
    final boolean d;

    /* renamed from: tgf$a */
    public static abstract class a {

        /* renamed from: tgf$a$a reason: collision with other inner class name */
        interface C0078a {
            C0078a a(String str);

            a a();

            C0078a b(String str);

            C0078a c(String str);

            C0078a d(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract String d();
    }

    tgf(List<a> list, String str, String str2, boolean z) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean a() {
        List<a> list = this.a;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
