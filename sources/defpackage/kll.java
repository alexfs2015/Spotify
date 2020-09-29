package defpackage;

/* renamed from: kll reason: default package */
abstract class kll extends klq {
    final String a;
    final int b;

    /* renamed from: kll$a */
    static final class a implements defpackage.klq.a {
        private String a;
        private Integer b;

        a() {
        }

        public final defpackage.klq.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.klq.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public final klq a() {
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
                return new klo(this.a, this.b.intValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    kll(String str, int i) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klq) {
            klq klq = (klq) obj;
            return this.a.equals(klq.a()) && this.b == klq.b();
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Genre{name=");
        sb.append(this.a);
        sb.append(", percentage=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
