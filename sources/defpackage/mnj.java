package defpackage;

/* renamed from: mnj reason: default package */
final class mnj extends defpackage.mnk.a {
    private final String a;
    private final String b;
    private final fqn c;

    /* renamed from: mnj$a */
    static final class a implements C0057a {
        private String a;
        private String b;
        private fqn c;

        a() {
        }

        public final C0057a a(fqn fqn) {
            if (fqn != null) {
                this.c = fqn;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public final C0057a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final defpackage.mnk.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playlistUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playlistName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" flags");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new mnj(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final C0057a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistName");
        }
    }

    private mnj(String str, String str2, fqn fqn) {
        this.a = str;
        this.b = str2;
        this.c = fqn;
    }

    /* synthetic */ mnj(String str, String str2, fqn fqn, byte b2) {
        this(str, str2, fqn);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final fqn c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mnk.a) {
            defpackage.mnk.a aVar = (defpackage.mnk.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{playlistUri=");
        sb.append(this.a);
        sb.append(", playlistName=");
        sb.append(this.b);
        sb.append(", flags=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
