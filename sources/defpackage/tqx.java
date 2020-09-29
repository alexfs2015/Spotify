package defpackage;

import java.util.List;

/* renamed from: tqx reason: default package */
public final class tqx {
    public final List<a> a;
    public final String b;
    final String c;
    final boolean d;

    /* renamed from: tqx$a */
    public static abstract class a {

        /* renamed from: tqx$a$a reason: collision with other inner class name */
        interface C0080a {
            C0080a a(String str);

            a a();

            C0080a b(String str);

            C0080a c(String str);

            C0080a d(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract String d();
    }

    tqx(List<a> list, String str, String str2, boolean z) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean a() {
        List<a> list = this.a;
        return list != null && !list.isEmpty();
    }
}
