package defpackage;

/* renamed from: kjt reason: default package */
public abstract class kjt {

    /* renamed from: kjt$a */
    public static final class a extends kjt {
        final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee.apply(this);
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
    }

    /* renamed from: kjt$b */
    public static final class b extends kjt {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee5.apply(this);
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
    }

    /* renamed from: kjt$c */
    public static final class c extends kjt {
        final String a;

        public c(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee6.apply(this);
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
    }

    /* renamed from: kjt$d */
    public static final class d extends kjt {
        final String a;

        public d(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee2.apply(this);
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
    }

    /* renamed from: kjt$e */
    public static final class e extends kjt {
        final String a;

        public e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee3.apply(this);
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
    }

    /* renamed from: kjt$f */
    public static final class f extends kjt {
        final String a;

        public f(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6) {
            return gee4.apply(this);
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
    }

    kjt() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<d, R_> gee2, gee<e, R_> gee3, gee<f, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6);
}
