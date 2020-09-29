package defpackage;

import java.util.Map;

/* renamed from: jcg reason: default package */
final class jcg extends jcj {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Map<String, String> e;

    /* renamed from: jcg$a */
    public static final class a implements defpackage.jcj.a {
        public String a;
        private String b;
        private String c;
        private Map<String, String> d;

        public final defpackage.jcj.a a(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.jcj.a b(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.jcj.a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public final jcj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                jcg jcg = new jcg(this.a, this.b, this.c, null, this.d, 0);
                return jcg;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ jcg(String str, String str2, String str3, String str4, Map map, byte b2) {
        this(str, str2, str3, str4, map);
    }

    private jcg(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final Map<String, String> d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageShareEntityData{entityUri=");
        sb.append(this.a);
        sb.append(", contextUri=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", logContext=");
        sb.append(this.d);
        sb.append(", queryParameters=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcj) {
            jcj jcj = (jcj) obj;
            if (this.a.equals(jcj.a())) {
                String str = this.b;
                if (str != null ? str.equals(jcj.b()) : jcj.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(jcj.e()) : jcj.e() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(jcj.c()) : jcj.c() == null) {
                            Map<String, String> map = this.e;
                            return map != null ? map.equals(jcj.d()) : jcj.d() == null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Map<String, String> map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 ^ i;
    }
}
