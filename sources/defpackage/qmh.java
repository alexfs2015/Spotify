package defpackage;

/* renamed from: qmh reason: default package */
abstract class qmh extends qmj {
    final String a;
    final String b;
    final String c;

    /* renamed from: qmh$a */
    static final class a extends defpackage.qmj.a {
        private String a;
        private String b;
        private String c;

        /* synthetic */ a(qmj qmj, byte b2) {
            this(qmj);
        }

        a() {
        }

        private a(qmj qmj) {
            this.a = qmj.a();
            this.b = qmj.b();
            this.c = qmj.c();
        }

        public final defpackage.qmj.a a(String str) {
            this.a = str;
            return this;
        }

        public final defpackage.qmj.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.qmj.a c(String str) {
            this.c = str;
            return this;
        }

        public final qmj a() {
            return new qmi(this.a, this.b, this.c);
        }
    }

    qmh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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

    public String toString() {
        StringBuilder sb = new StringBuilder("Logging{section=");
        sb.append(this.a);
        sb.append(", contentSource=");
        sb.append(this.b);
        sb.append(", contentSourceUri=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qmj) {
            qmj qmj = (qmj) obj;
            String str = this.a;
            if (str != null ? str.equals(qmj.a()) : qmj.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(qmj.b()) : qmj.b() == null) {
                    String str3 = this.c;
                    return str3 != null ? str3.equals(qmj.c()) : qmj.c() == null;
                }
            }
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 ^ i;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.qmj.a d() {
        return new a(this, 0);
    }
}
