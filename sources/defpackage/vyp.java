package defpackage;

/* renamed from: vyp reason: default package */
public abstract class vyp {

    /* renamed from: vyp$a */
    public static final class a extends vyp {
        public final String a;

        a(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ForwardNameSuggestion{name=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyp$b */
    public static final class b extends vyp {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToNext{}";
        }
    }

    /* renamed from: vyp$c */
    public static final class c extends vyp {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenEmailHintPicker{}";
        }
    }

    /* renamed from: vyp$d */
    public static final class d extends vyp {
        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenKeyboard{}";
        }
    }

    /* renamed from: vyp$e */
    public static final class e extends vyp {
        public final String a;

        e(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrefillEmail{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyp$f */
    public static final class f extends vyp {
        public final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowLoginSuggestion{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyp$g */
    public static final class g extends vyp {
        public final String a;
        public final boolean b;

        g(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return gVar.b == this.b && gVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VerifyEmail{email=");
            sb.append(this.a);
            sb.append(", navigateToNextWhenValidated=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    vyp() {
    }

    public static vyp a(String str) {
        return new f(str);
    }

    public static vyp a(String str, boolean z) {
        return new g(str, z);
    }

    public static vyp b(String str) {
        return new a(str);
    }
}
