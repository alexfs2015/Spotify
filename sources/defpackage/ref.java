package defpackage;

/* renamed from: ref reason: default package */
public abstract class ref {

    /* renamed from: ref$a */
    public static final class a extends ref {
        final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConnectivityChanged{online=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct.apply(this);
        }
    }

    /* renamed from: ref$b */
    public static final class b extends ref {
        final rdv a;

        b(rdv rdv) {
            this.a = (rdv) gcr.a(rdv);
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
            sb.append("DataLoaded{profilePage=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2);

    ref() {
    }

    public static ref a(boolean z) {
        return new a(z);
    }

    public static ref a(rdv rdv) {
        return new b(rdv);
    }
}
