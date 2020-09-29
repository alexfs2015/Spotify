package defpackage;

import java.net.HttpCookie;

/* renamed from: jem reason: default package */
public abstract class jem {

    /* renamed from: jem$a */
    public static abstract class a {
        public abstract a a(Boolean bool);

        public abstract a a(Long l);

        public abstract a a(String str);

        public abstract jem a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract Long e();

    public abstract Boolean f();

    public static jem a(HttpCookie httpCookie) {
        String name = httpCookie.getName();
        String value = httpCookie.getValue();
        a aVar = new a();
        if (name != null) {
            aVar.a = name;
            return aVar.a(value).c(httpCookie.getDomain()).a(Long.valueOf(httpCookie.getMaxAge())).b(httpCookie.getPath()).a(Boolean.valueOf(httpCookie.getSecure())).a();
        }
        throw new NullPointerException("Null name");
    }

    public final HttpCookie g() {
        HttpCookie httpCookie = new HttpCookie(a(), b());
        httpCookie.setDomain(d());
        httpCookie.setPath(c());
        Long e = e();
        httpCookie.setMaxAge(e != null ? e.longValue() : -1);
        Boolean f = f();
        httpCookie.setSecure(f != null ? f.booleanValue() : false);
        return httpCookie;
    }
}
