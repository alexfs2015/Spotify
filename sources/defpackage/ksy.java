package defpackage;

/* renamed from: ksy reason: default package */
final class ksy extends ktl {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: ksy$a */
    static final class a implements defpackage.ktl.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public final defpackage.ktl.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final ktl a() {
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
                sb2.append(" label");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" imageUri");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new ksy(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.ktl.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null label");
        }

        public final defpackage.ktl.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }
    }

    private ksy(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* synthetic */ ksy(String str, String str2, String str3, byte b2) {
        this(str, str2, str3);
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktl) {
            ktl ktl = (ktl) obj;
            return this.a.equals(ktl.a()) && this.b.equals(ktl.b()) && this.c.equals(ktl.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutItem{uri=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", imageUri=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
