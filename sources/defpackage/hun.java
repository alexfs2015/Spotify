package defpackage;

/* renamed from: hun reason: default package */
final class hun extends huo {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    /* renamed from: hun$a */
    static final class a implements defpackage.huo.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Boolean e;

        a() {
        }

        public final defpackage.huo.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.huo.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final huo a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" parentId");
                str = sb.toString();
            }
            if (this.e == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" root");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                hun hun = new hun(this.a, this.b, this.c, this.d, this.e.booleanValue(), 0);
                return hun;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.huo.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null parentId");
        }

        public final defpackage.huo.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.huo.a d(String str) {
            this.d = str;
            return this;
        }
    }

    private hun(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    /* synthetic */ hun(String str, String str2, String str3, String str4, boolean z, byte b2) {
        this(str, str2, str3, str4, z);
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

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huo) {
            huo huo = (huo) obj;
            String str = this.a;
            if (str != null ? str.equals(huo.a()) : huo.a() == null) {
                if (this.b.equals(huo.b())) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(huo.c()) : huo.c() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(huo.d()) : huo.d() == null) {
                            if (this.e == huo.e()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserParams{rootListType=");
        sb.append(this.a);
        sb.append(", parentId=");
        sb.append(this.b);
        sb.append(", packageName=");
        sb.append(this.c);
        sb.append(", clientId=");
        sb.append(this.d);
        sb.append(", root=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
