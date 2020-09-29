package defpackage;

/* renamed from: wbu reason: default package */
public final class wbu {
    final String a;
    final String b;
    final String c;
    final Integer d;

    /* renamed from: wbu$a */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public Integer d;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final wbu a() {
            wbu wbu = new wbu(this.a, this.b, this.c, this.d, 0);
            return wbu;
        }
    }

    private wbu(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    /* synthetic */ wbu(String str, String str2, String str3, Integer num, byte b2) {
        this(str, str2, str3, num);
    }

    public static a a() {
        return new a(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wbu wbu = (wbu) obj;
        if (!this.a.equals(wbu.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? wbu.b != null : !str.equals(wbu.b)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? wbu.c != null : !str2.equals(wbu.c)) {
            return false;
        }
        Integer num = this.d;
        Integer num2 = wbu.d;
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
}
