package defpackage;

/* renamed from: vlj reason: default package */
public abstract class vlj {

    /* renamed from: vlj$a */
    public static final class a extends vlj {
        public final String a;

        a(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: vlj$b */
    public static final class b extends vlj {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToNext{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: vlj$c */
    public static final class c extends vlj {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenEmailHintPicker{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: vlj$d */
    public static final class d extends vlj {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenKeyboard{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    /* renamed from: vlj$e */
    public static final class e extends vlj {
        public final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: vlj$f */
    public static final class f extends vlj {
        public final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
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

    /* renamed from: vlj$g */
    public static final class g extends vlj {
        public final String a;
        public final boolean b;

        g(String str, boolean z) {
            this.a = (String) gcr.a(str);
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

    vlj() {
    }

    public static vlj a(String str, boolean z) {
        return new g(str, z);
    }

    public static vlj a(String str) {
        return new f(str);
    }

    public static vlj b(String str) {
        return new a(str);
    }
}
