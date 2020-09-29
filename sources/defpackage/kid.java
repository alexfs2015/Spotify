package defpackage;

/* renamed from: kid reason: default package */
abstract class kid extends kih {
    final String a;
    final int b;

    /* renamed from: kid$a */
    static final class a implements defpackage.kih.a {
        private String a;
        private Integer b;

        a() {
        }

        public final defpackage.kih.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.kih.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final kih a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" name");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" percentage");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new kif(this.a, this.b.intValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    kid(String str, int i) {
        if (str != null) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Genre{name=");
        sb.append(this.a);
        sb.append(", percentage=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kih) {
            kih kih = (kih) obj;
            return this.a.equals(kih.a()) && this.b == kih.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
