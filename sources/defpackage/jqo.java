package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: jqo reason: default package */
public abstract class jqo<T> {
    public static final jqo<Void> a = new a();
    public final gkq b;
    public final String c;
    public final boolean d;
    public final Map<String, String> e;
    private final String f;
    private final String g;

    /* renamed from: jqo$a */
    static class a extends jqo<Void> {
        a() {
            String str = "";
            super(PageIdentifiers.CONTEXTMENU, str, str);
        }

        public final boolean a() {
            return true;
        }

        public final /* synthetic */ Object b() {
            throw new UnsupportedOperationException();
        }

        public final String c() {
            throw new UnsupportedOperationException();
        }

        public final String d() {
            throw new UnsupportedOperationException();
        }
    }

    jqo(gkq gkq, String str, String str2) {
        this(gkq, str, str2, null, false, null);
    }

    jqo(gkq gkq, String str, String str2, String str3, boolean z, Map<String, String> map) {
        this.b = gkq;
        this.f = str;
        this.g = str2;
        this.c = str3;
        this.d = z;
        this.e = map;
    }

    public static <T> jqo<T> a(gkq gkq, String str, String str2) {
        return new jqp(gkq, str, str2);
    }

    public static <T> jqo<T> a(gkq gkq, String str, String str2, String str3, boolean z, T t) {
        jqn jqn = new jqn(gkq, str, str2, str3, z, null, t);
        return jqn;
    }

    public static <T> jqo<T> a(gkq gkq, String str, String str2, String str3, boolean z, Map<String, String> map) {
        jqp jqp = new jqp(gkq, str, str2, str3, z, map);
        return jqp;
    }

    public static <T> jqo<T> a(jqo<T> jqo, T t) {
        jqn jqn = new jqn(jqo.b, jqo.c(), jqo.d(), jqo.c, jqo.d, jqo.e, t);
        return jqn;
    }

    public abstract boolean a();

    public abstract T b();

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqo)) {
            return false;
        }
        jqo jqo = (jqo) obj;
        if (this.b != jqo.b) {
            return false;
        }
        String str = this.f;
        if (str == null ? jqo.f != null : !str.equals(jqo.f)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? jqo.c != null : !str2.equals(jqo.c)) {
            return false;
        }
        String str3 = this.g;
        String str4 = jqo.g;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public int hashCode() {
        gkq gkq = this.b;
        int i = 0;
        int hashCode = (gkq != null ? gkq.hashCode() : 0) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }
}
