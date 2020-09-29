package defpackage;

/* renamed from: syy reason: default package */
final class syy extends szb {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: syy$a */
    static final class a extends defpackage.szb.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.szb.a a(String str) {
            this.a = str;
            return this;
        }

        public final szb a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" spotifyLink");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" featureId");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                syy syy = new syy(this.a, this.b, this.c, this.d, 0);
                return syy;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.szb.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null spotifyLink");
        }

        public final defpackage.szb.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.szb.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null featureId");
        }
    }

    private syy(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* synthetic */ syy(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof szb) {
            szb szb = (szb) obj;
            String str = this.a;
            if (str != null ? str.equals(szb.a()) : szb.a() == null) {
                if (this.b.equals(szb.b())) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(szb.c()) : szb.c() == null) {
                        if (this.d.equals(szb.d())) {
                            return true;
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackStackFragmentDescription{title=");
        sb.append(this.a);
        sb.append(", spotifyLink=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", featureId=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
