package defpackage;

/* renamed from: wav reason: default package */
abstract class wav extends way {
    final String a;
    final boolean b;
    final way c;

    /* renamed from: wav$a */
    static final class a implements defpackage.way.a {
        private String a;
        private Boolean b;
        private way c;

        a() {
        }

        private a(way way) {
            this.a = way.a();
            this.b = Boolean.valueOf(way.b());
            this.c = way.c();
        }

        /* synthetic */ a(way way, byte b2) {
            this(way);
        }

        public final defpackage.way.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public final defpackage.way.a a(way way) {
            this.c = way;
            return this;
        }

        public final defpackage.way.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final way a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" key");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" reversed");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new waw(this.a, this.b.booleanValue(), this.c);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    wav(String str, boolean z, way way) {
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = way;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final way c() {
        return this.c;
    }

    public final defpackage.way.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof way) {
            way way = (way) obj;
            if (this.a.equals(way.a()) && this.b == way.b()) {
                way way2 = this.c;
                return way2 != null ? way2.equals(way.c()) : way.c() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        way way = this.c;
        return hashCode ^ (way == null ? 0 : way.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SortOrder{key=");
        sb.append(this.a);
        sb.append(", reversed=");
        sb.append(this.b);
        sb.append(", secondary=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
