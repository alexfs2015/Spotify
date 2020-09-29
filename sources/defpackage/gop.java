package defpackage;

/* renamed from: gop reason: default package */
public abstract class gop {

    /* renamed from: gop$a */
    public static final class a extends gop {
        public final String a;
        public final String b;

        a(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AttemptSaveSavePassword{password=");
            sb.append(this.a);
            sb.append(", oneTimeResetPasswordToken=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gop$b */
    public static final class b extends gop {
        public final String a;
        public final String b;

        b(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AttemptsStoreCredentials{username=");
            sb.append(this.a);
            sb.append(", password=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gop$c */
    public static final class c extends gop {
        public final boolean a;
        public final String b;

        c(boolean z, String str) {
            this.a = z;
            this.b = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((Boolean.valueOf(this.a).hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Close{successful=");
            sb.append(this.a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: gop$d */
    public static final class d extends gop {
        public final String a;

        d(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ValidatePassword{password=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    gop() {
    }

    public static gop a(boolean z, String str) {
        return new c(z, str);
    }
}
