package defpackage;

/* renamed from: khi reason: default package */
public abstract class khi {

    /* renamed from: khi$a */
    public static final class a extends khi {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MuteRequested{}";
        }
    }

    /* renamed from: khi$b */
    public static final class b extends khi {
        final long a;

        public b(long j) {
            this.a = j;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PauseRequested{timestamp=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: khi$c */
    public static final class c extends khi {
        final String a;

        public c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayRequested{previewUrl=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: khi$d */
    public static final class d extends khi {
        final long a;

        public d(long j) {
            this.a = j;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayerReady{timestamp=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: khi$e */
    public static final class e extends khi {
        final long a;

        public e(long j) {
            this.a = j;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResumeRequested{timestamp=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: khi$f */
    public static final class f extends khi {
        final long a;

        public f(long j) {
            this.a = j;
        }

        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof f) && ((f) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UnmuteRequested{timestamp=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    khi() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<e, R_> gee3, gee<a, R_> gee4, gee<f, R_> gee5, gee<d, R_> gee6);
}
