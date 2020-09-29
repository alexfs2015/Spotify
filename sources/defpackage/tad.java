package defpackage;

/* renamed from: tad reason: default package */
public abstract class tad {

    /* renamed from: tad$a */
    public static final class a extends tad {
        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoNothing{}";
        }
    }

    /* renamed from: tad$b */
    public static final class b extends tad {
        final jva a;

        b(jva jva) {
            this.a = (jva) gec.a(jva);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee3.apply(this);
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
    }

    /* renamed from: tad$c */
    public static final class c extends tad {
        final jqx a;

        c(jqx jqx) {
            this.a = (jqx) gec.a(jqx);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee2.apply(this);
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
    }

    tad() {
    }

    public static tad a(jqx jqx) {
        return new c(jqx);
    }

    public static tad a(jva jva) {
        return new b(jva);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3);
}
