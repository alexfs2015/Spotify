package defpackage;

/* renamed from: spw reason: default package */
public abstract class spw {

    /* renamed from: spw$a */
    public static final class a extends spw {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoNothing{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: spw$b */
    public static final class b extends spw {
        final jst a;

        b(jst jst) {
            this.a = (jst) gcr.a(jst);
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
            sb.append("NavigateToLink{link=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: spw$c */
    public static final class c extends spw {
        final jol a;

        c(jol jol) {
            this.a = (jol) gcr.a(jol);
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
            sb.append("PushFragmentIdentifier{fragmentIdentifier=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3);

    spw() {
    }

    public static spw a(jol jol) {
        return new c(jol);
    }

    public static spw a(jst jst) {
        return new b(jst);
    }
}
