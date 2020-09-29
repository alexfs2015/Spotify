package defpackage;

/* renamed from: pqn reason: default package */
final class pqn extends pqr {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: pqn$a */
    static final class a extends defpackage.pqr.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public final defpackage.pqr.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final pqr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" username");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new pqn(this.a, this.b, this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }

        public final defpackage.pqr.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final defpackage.pqr.a c(String str) {
            this.c = str;
            return this;
        }
    }

    private pqn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* synthetic */ pqn(String str, String str2, String str3, byte b2) {
        this(str, str2, str3);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pqr) {
            pqr pqr = (pqr) obj;
            if (this.a.equals(pqr.a()) && this.b.equals(pqr.b())) {
                String str = this.c;
                return str != null ? str.equals(pqr.c()) : pqr.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditProfileModel{username=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
