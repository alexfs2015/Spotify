package defpackage;

/* renamed from: khg reason: default package */
public abstract class khg {

    /* renamed from: khg$a */
    public static final class a extends khg {
        final String a;

        public a(String str) {
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
            sb.append("StoryEnter{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct.apply(this);
        }
    }

    /* renamed from: khg$b */
    public static final class b extends khg {
        final String a;

        public b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StoryErrorEnter{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct5.apply(this);
        }
    }

    /* renamed from: khg$c */
    public static final class c extends khg {
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
            sb.append("StoryErrorExit{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct6.apply(this);
        }
    }

    /* renamed from: khg$d */
    public static final class d extends khg {
        final String a;

        public d(String str) {
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
            sb.append("StoryExit{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct2.apply(this);
        }
    }

    /* renamed from: khg$e */
    public static final class e extends khg {
        final String a;

        public e(String str) {
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
            sb.append("StoryLoadingEnter{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct3.apply(this);
        }
    }

    /* renamed from: khg$f */
    public static final class f extends khg {
        final String a;

        public f(String str) {
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
            sb.append("StoryLoadingExit{storyId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<d, R_> gct2, gct<e, R_> gct3, gct<f, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6);

    khg() {
    }
}
