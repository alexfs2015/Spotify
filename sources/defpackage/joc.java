package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: joc reason: default package */
public abstract class joc<T> {
    public static final joc<Void> a = new a();
    public final gjf b;
    public final String c;
    public final boolean d;
    public final Map<String, String> e;
    private final String f;
    private final String g;

    /* renamed from: joc$a */
    static class a extends joc<Void> {
        public final boolean a() {
            return true;
        }

        a() {
            String str = "";
            super(PageIdentifiers.CONTEXTMENU, str, str);
        }

        public final String c() {
            throw new UnsupportedOperationException();
        }

        public final String d() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object b() {
            throw new UnsupportedOperationException();
        }
    }

    public abstract boolean a();

    public abstract T b();

    joc(gjf gjf, String str, String str2) {
        this(gjf, str, str2, null, false, null);
    }

    joc(gjf gjf, String str, String str2, String str3, boolean z, Map<String, String> map) {
        this.b = gjf;
        this.f = str;
        this.g = str2;
        this.c = str3;
        this.d = z;
        this.e = map;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public static <T> joc<T> a(gjf gjf, String str, String str2) {
        return new jod(gjf, str, str2);
    }

    public static <T> joc<T> a(gjf gjf, String str, String str2, String str3, boolean z, Map<String, String> map) {
        jod jod = new jod(gjf, str, str2, str3, z, map);
        return jod;
    }

    public static <T> joc<T> a(joc<T> joc, T t) {
        job job = new job(joc.b, joc.c(), joc.d(), joc.c, joc.d, joc.e, t);
        return job;
    }

    public static <T> joc<T> a(gjf gjf, String str, String str2, String str3, boolean z, T t) {
        job job = new job(gjf, str, str2, str3, z, null, t);
        return job;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc)) {
            return false;
        }
        joc joc = (joc) obj;
        if (this.b != joc.b) {
            return false;
        }
        String str = this.f;
        if (str == null ? joc.f != null : !str.equals(joc.f)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? joc.c != null : !str2.equals(joc.c)) {
            return false;
        }
        String str3 = this.g;
        String str4 = joc.g;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    public int hashCode() {
        gjf gjf = this.b;
        int i = 0;
        int hashCode = (gjf != null ? gjf.hashCode() : 0) * 31;
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
