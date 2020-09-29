package defpackage;

import java.util.Map;

/* renamed from: naw reason: default package */
final class naw extends nax {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final Map<String, String> e;

    /* renamed from: naw$a */
    static final class a implements defpackage.nax.a {
        Map<String, String> a;
        private String b;
        private String c;
        private Integer d;
        private String e;

        a() {
        }

        public final defpackage.nax.a a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public final defpackage.nax.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final nax a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" name");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" index");
                str = sb3.toString();
            }
            if (this.a == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" additionalMetadata");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                naw naw = new naw(this.b, this.c, this.d.intValue(), this.e, this.a, 0);
                return naw;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.nax.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final defpackage.nax.a c(String str) {
            this.e = str;
            return this;
        }
    }

    private naw(String str, String str2, int i, String str3, Map<String, String> map) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = map;
    }

    /* synthetic */ naw(String str, String str2, int i, String str3, Map map, byte b2) {
        this(str, str2, i, str3, map);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Map<String, String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nax) {
            nax nax = (nax) obj;
            if (this.a.equals(nax.a()) && this.b.equals(nax.b()) && this.c == nax.c()) {
                String str = this.d;
                if (str != null ? str.equals(nax.d()) : nax.d() == null) {
                    if (this.e.equals(nax.e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuItem{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", index=");
        sb.append(this.c);
        sb.append(", rowId=");
        sb.append(this.d);
        sb.append(", additionalMetadata=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
