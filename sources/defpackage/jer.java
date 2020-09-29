package defpackage;

import java.util.Map;

/* renamed from: jer reason: default package */
final class jer extends jeu {
    private final String a;
    private final String b;
    private final String c;
    private final Map<String, String> d;

    /* renamed from: jer$a */
    public static final class a implements defpackage.jeu.a {
        public String a;
        private String b;
        private Map<String, String> c;

        public final defpackage.jeu.a a(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.jeu.a a(Map<String, String> map) {
            this.c = map;
            return this;
        }

        public final jeu a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                jer jer = new jer(this.a, this.b, null, this.c, 0);
                return jer;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private jer(String str, String str2, String str3, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    /* synthetic */ jer(String str, String str2, String str3, Map map, byte b2) {
        this(str, str2, str3, map);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jeu) {
            jeu jeu = (jeu) obj;
            if (this.a.equals(jeu.a())) {
                String str = this.b;
                if (str != null ? str.equals(jeu.b()) : jeu.b() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(jeu.c()) : jeu.c() == null) {
                        Map<String, String> map = this.d;
                        return map != null ? map.equals(jeu.d()) : jeu.d() == null;
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
        Map<String, String> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkShareEntityData{entityUri=");
        sb.append(this.a);
        sb.append(", contextUri=");
        sb.append(this.b);
        sb.append(", logContext=");
        sb.append(this.c);
        sb.append(", queryParameters=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
