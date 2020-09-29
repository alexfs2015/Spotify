package defpackage;

/* renamed from: web reason: default package */
final class web extends wee {
    private final String a;
    private final String b;

    /* renamed from: web$a */
    public static final class a implements defpackage.wee.a {
        private String a;
        private String b;

        public final defpackage.wee.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final wee a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" consumer");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new web(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.wee.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }
    }

    private web(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* synthetic */ web(String str, String str2, byte b2) {
        this(str, str2);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wee) {
            wee wee = (wee) obj;
            return this.a.equals(wee.a()) && this.b.equals(wee.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLogEvent{id=");
        sb.append(this.a);
        sb.append(", consumer=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
