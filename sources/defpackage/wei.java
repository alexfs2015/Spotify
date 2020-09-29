package defpackage;

/* renamed from: wei reason: default package */
final class wei extends wen {
    private final String a;
    private final String b;
    private final int c;

    /* renamed from: wei$a */
    static final class a implements defpackage.wen.a {
        private String a;
        private String b;
        private Integer c;

        a() {
        }

        public final defpackage.wen.a a(int i) {
            this.c = Integer.valueOf(443);
            return this;
        }

        public final defpackage.wen.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null host");
        }

        public final wen a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" host");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" path");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" port");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new wei(this.a, this.b, this.c.intValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.wen.a b(String str) {
            this.b = str;
            return this;
        }
    }

    private wei(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    /* synthetic */ wei(String str, String str2, int i, byte b2) {
        this(str, str2, i);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wen) {
            wen wen = (wen) obj;
            return this.a.equals(wen.a()) && this.b.equals(wen.b()) && this.c == wen.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeechProxyBackend{host=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", port=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
