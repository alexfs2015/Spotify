package defpackage;

/* renamed from: qup reason: default package */
abstract class qup extends qur {
    final String a;
    final String b;
    final String c;

    /* renamed from: qup$a */
    static final class a extends defpackage.qur.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        private a(qur qur) {
            this.a = qur.a();
            this.b = qur.b();
            this.c = qur.c();
        }

        /* synthetic */ a(qur qur, byte b2) {
            this(qur);
        }

        public final defpackage.qur.a a(String str) {
            this.a = str;
            return this;
        }

        public final qur a() {
            return new quq(this.a, this.b, this.c);
        }

        public final defpackage.qur.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.qur.a c(String str) {
            this.c = str;
            return this;
        }
    }

    qup(String str, String str2, String str3) {
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

    /* access modifiers changed from: 0000 */
    public final defpackage.qur.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qur) {
            qur qur = (qur) obj;
            String str = this.a;
            if (str != null ? str.equals(qur.a()) : qur.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(qur.b()) : qur.b() == null) {
                    String str3 = this.c;
                    return str3 != null ? str3.equals(qur.c()) : qur.c() == null;
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
}
