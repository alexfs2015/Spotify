package defpackage;

/* renamed from: vmj reason: default package */
public abstract class vmj {

    /* renamed from: vmj$a */
    public static final class a extends vmj {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Empty{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct.apply(this);
        }
    }

    /* renamed from: vmj$b */
    public static final class b extends vmj {
        private final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final String a() {
            return this.a;
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
            sb.append("Valid{name=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<b, R_> gct2);

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    vmj() {
    }

    public static vmj a(String str) {
        return new b(str);
    }
}
