package defpackage;

/* renamed from: miq reason: default package */
final class miq extends defpackage.mir.a {
    private final String a;
    private final String b;
    private final fpt c;

    /* renamed from: miq$a */
    static final class a implements C0056a {
        private String a;
        private String b;
        private fpt c;

        a() {
        }

        public final C0056a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public final C0056a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistName");
        }

        public final C0056a a(fpt fpt) {
            if (fpt != null) {
                this.c = fpt;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public final defpackage.mir.a a() {
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
                return new miq(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ miq(String str, String str2, fpt fpt, byte b2) {
        this(str, str2, fpt);
    }

    private miq(String str, String str2, fpt fpt) {
        this.a = str;
        this.b = str2;
        this.c = fpt;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final fpt c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mir.a) {
            defpackage.mir.a aVar = (defpackage.mir.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
