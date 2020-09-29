package defpackage;

/* renamed from: kfg reason: default package */
public abstract class kfg {

    /* renamed from: kfg$a */
    public static final class a extends kfg {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "MuteRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct4.apply(this);
        }
    }

    /* renamed from: kfg$b */
    public static final class b extends kfg {
        final long a;

        public b(long j) {
            this.a = j;
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

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: kfg$c */
    public static final class c extends kfg {
        final String a;

        public c(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: kfg$d */
    public static final class d extends kfg {
        final long a;

        public d(long j) {
            this.a = j;
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

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: kfg$e */
    public static final class e extends kfg {
        final long a;

        public e(long j) {
            this.a = j;
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

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: kfg$f */
    public static final class f extends kfg {
        final long a;

        public f(long j) {
            this.a = j;
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

        public final <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6) {
            return gct5.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<c, R_> gct, gct<b, R_> gct2, gct<e, R_> gct3, gct<a, R_> gct4, gct<f, R_> gct5, gct<d, R_> gct6);

    kfg() {
    }
}
