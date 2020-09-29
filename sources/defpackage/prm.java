package defpackage;

/* renamed from: prm reason: default package */
abstract class prm extends prr {
    final String a;
    final String b;
    final prg c;

    /* renamed from: prm$a */
    static final class a extends defpackage.prr.a {
        private String a;
        private String b;
        private prg c;

        a() {
        }

        private a(prr prr) {
            this.a = prr.a();
            this.b = prr.b();
            this.c = prr.c();
        }

        /* synthetic */ a(prr prr, byte b2) {
            this(prr);
        }

        public final defpackage.prr.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.prr.a a(prg prg) {
            if (prg != null) {
                this.c = prg;
                return this;
            }
            throw new NullPointerException("Null profileListData");
        }

        public final prr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" username");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" profileListData");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new prn(this.a, this.b, this.c);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.prr.a b(String str) {
            this.b = str;
            return this;
        }
    }

    prm(String str, String str2, prg prg) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (prg != null) {
                    this.c = prg;
                    return;
                }
                throw new NullPointerException("Null profileListData");
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final prg c() {
        return this.c;
    }

    public final defpackage.prr.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof prr) {
            prr prr = (prr) obj;
            return this.a.equals(prr.a()) && this.b.equals(prr.b()) && this.c.equals(prr.c());
        }
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileListModel{title=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", profileListData=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
