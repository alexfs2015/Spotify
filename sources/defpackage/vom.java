package defpackage;

/* renamed from: vom reason: default package */
public final class vom {
    final String a;
    final String b;
    final String c;
    final Integer d;

    /* renamed from: vom$a */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public Integer d;

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
        }

        public final vom a() {
            vom vom = new vom(this.a, this.b, this.c, this.d, 0);
            return vom;
        }
    }

    /* synthetic */ vom(String str, String str2, String str3, Integer num, byte b2) {
        this(str, str2, str3, num);
    }

    private vom(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        if (this.d != null) {
            sb.append('[');
            sb.append(this.d);
            sb.append(']');
        }
        if (this.b != null) {
            sb.append('{');
            sb.append(this.b);
            sb.append('}');
        }
        if (this.c != null) {
            sb.append('<');
            sb.append(this.c);
            sb.append('>');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vom vom = (vom) obj;
        if (!this.a.equals(vom.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? vom.b != null : !str.equals(vom.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? vom.c != null : !str2.equals(vom.c)) {
            return false;
        }
        Integer num = this.d;
        Integer num2 = vom.d;
        return num == null ? num2 == null : num.equals(num2);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public static a a() {
        return new a(0);
    }
}
