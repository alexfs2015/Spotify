package defpackage;

import com.spotify.cosmos.router.Request;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wmd reason: default package */
public final class wmd {
    public final wlx a;
    public final String b;
    public final wlw c;
    public final wme d;
    public final Map<Class<?>, Object> e;
    private volatile wli f;

    /* renamed from: wmd$a */
    public static class a {
        wlx a;
        String b;
        defpackage.wlw.a c;
        wme d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = Request.GET;
            this.c = new defpackage.wlw.a();
        }

        a(wmd wmd) {
            Map<Class<?>, Object> map;
            this.e = Collections.emptyMap();
            this.a = wmd.a;
            this.b = wmd.b;
            this.d = wmd.d;
            if (wmd.e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(wmd.e);
            }
            this.e = map;
            this.c = wmd.c.b();
        }

        public final a a(wlx wlx) {
            if (wlx != null) {
                this.a = wlx;
                return this;
            }
            throw new NullPointerException("url == null");
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
                return a(wlx.f(str));
            }
            throw new NullPointerException("url == null");
        }

        public final a a(String str, String str2) {
            this.c.d(str, str2);
            return this;
        }

        public final a b(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public final a b(String str) {
            this.c.b(str);
            return this;
        }

        public final a a(wlw wlw) {
            this.c = wlw.b();
            return this;
        }

        public final a a(wli wli) {
            String wli2 = wli.toString();
            String str = "Cache-Control";
            if (wli2.isEmpty()) {
                return b(str);
            }
            return a(str, wli2);
        }

        public final a a(String str, wme wme) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (wme != null && !wnc.c(str)) {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (wme != null || !wnc.b(str)) {
                    this.b = str;
                    this.d = wme;
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

        public final <T> a a(Class<? super T> cls, T t) {
            if (this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            this.e.put(cls, cls.cast(t));
            return this;
        }

        public final wmd a() {
            if (this.a != null) {
                return new wmd(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    wmd(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = wmk.a(aVar.e);
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final a a() {
        return new a(this);
    }

    public final wli b() {
        wli wli = this.f;
        if (wli != null) {
            return wli;
        }
        wli a2 = wli.a(this.c);
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
