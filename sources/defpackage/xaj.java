package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: xaj reason: default package */
public final class xaj {
    public final xad a;
    public final String b;
    public final xac c;
    public final xak d;
    public final Map<Class<?>, Object> e;
    private volatile wzo f;

    /* renamed from: xaj$a */
    public static class a {
        xad a;
        String b;
        defpackage.xac.a c;
        xak d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = Request.GET;
            this.c = new defpackage.xac.a();
        }

        a(xaj xaj) {
            this.e = Collections.emptyMap();
            this.a = xaj.a;
            this.b = xaj.b;
            this.d = xaj.d;
            this.e = xaj.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(xaj.e);
            this.c = xaj.c.b();
        }

        public final <T> a a(Class<? super T> cls, T t) {
            if (this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            this.e.put(cls, cls.cast(t));
            return this;
        }

        public final a a(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                return a(xad.f(str));
            }
            throw new NullPointerException("url == null");
        }

        public final a a(String str, String str2) {
            this.c.d(str, str2);
            return this;
        }

        public final a a(String str, xak xak) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (xak != null && !xbi.c(str)) {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (xak != null || !xbi.b(str)) {
                    this.b = str;
                    this.d = xak;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        public final a a(wzo wzo) {
            String wzo2 = wzo.toString();
            String str = "Cache-Control";
            return wzo2.isEmpty() ? b(str) : a(str, wzo2);
        }

        public final a a(xac xac) {
            this.c = xac.b();
            return this;
        }

        public final a a(xad xad) {
            if (xad != null) {
                this.a = xad;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public final xaj a() {
            if (this.a != null) {
                return new xaj(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final a b(String str) {
            this.c.b(str);
            return this;
        }

        public final a b(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }
    }

    xaj(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = xaq.a(aVar.e);
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final a a() {
        return new a(this);
    }

    public final wzo b() {
        wzo wzo = this.f;
        if (wzo != null) {
            return wzo;
        }
        wzo a2 = wzo.a(this.c);
        this.f = a2;
        return a2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tags=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
