package defpackage;

/* renamed from: sor reason: default package */
final class sor extends sou {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: sor$a */
    static final class a extends defpackage.sou.a {
        private String a;
        private String b;
        private String c;
        private String d;

        a() {
        }

        public final defpackage.sou.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.sou.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null spotifyLink");
        }

        public final defpackage.sou.a c(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.sou.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null featureId");
        }

        public final sou a() {
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
                sor sor = new sor(this.a, this.b, this.c, this.d, 0);
                return sor;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ sor(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
    }

    private sor(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sou) {
            sou sou = (sou) obj;
            String str = this.a;
            if (str != null ? str.equals(sou.a()) : sou.a() == null) {
                if (this.b.equals(sou.b())) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(sou.c()) : sou.c() == null) {
                        if (this.d.equals(sou.d())) {
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
}
