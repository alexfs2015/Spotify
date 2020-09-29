package defpackage;

/* renamed from: mxl reason: default package */
final class mxl extends mxm {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: mxl$a */
    public static final class a extends defpackage.mxm.a {
        private String a;
        private String b;
        private String c;

        public final defpackage.mxm.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final mxm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" imageUrl");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new mxl(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.mxm.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final defpackage.mxm.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }
    }

    private mxl(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* synthetic */ mxl(String str, String str2, String str3, byte b2) {
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
        if (obj instanceof mxm) {
            mxm mxm = (mxm) obj;
            return this.a.equals(mxm.a()) && this.b.equals(mxm.b()) && this.c.equals(mxm.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRecsArtistModel{uri=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
