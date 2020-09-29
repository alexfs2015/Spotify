package defpackage;

/* renamed from: mod reason: default package */
public abstract class mod {

    /* renamed from: mod$a */
    public static final class a extends mod {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CloseClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct.apply(this);
        }
    }

    /* renamed from: mod$b */
    public static final class b extends mod {
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
            sb.append("SaveClicked{displayName=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct2.apply(this);
        }
    }

    /* renamed from: mod$c */
    public static final class c extends mod {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SaveFailed{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct4.apply(this);
        }
    }

    /* renamed from: mod$d */
    public static final class d extends mod {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SaveSuccessful{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2, gct<d, R_> gct3, gct<c, R_> gct4);

    mod() {
    }
}
