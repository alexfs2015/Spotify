package defpackage;

import java.util.Map;

/* renamed from: jes reason: default package */
final class jes extends jev {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Map<String, String> e;

    /* renamed from: jes$a */
    static final class a implements defpackage.jev.a {
        private String a;
        private String b;
        private String c;
        private Map<String, String> d;

        a() {
        }

        public final defpackage.jev.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public final defpackage.jev.a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public final jev a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                jes jes = new jes(this.a, this.b, this.c, null, this.d, 0);
                return jes;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final defpackage.jev.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.jev.a c(String str) {
            this.c = str;
            return this;
        }
    }

    private jes(String str, String str2, String str3, String str4, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    /* synthetic */ jes(String str, String str2, String str3, String str4, Map map, byte b2) {
        this(str, str2, str3, str4, map);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final Map<String, String> d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jev) {
            jev jev = (jev) obj;
            if (this.a.equals(jev.a())) {
                String str = this.b;
                if (str != null ? str.equals(jev.b()) : jev.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(jev.e()) : jev.e() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(jev.c()) : jev.c() == null) {
                            Map<String, String> map = this.e;
                            return map != null ? map.equals(jev.d()) : jev.d() == null;
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
}
