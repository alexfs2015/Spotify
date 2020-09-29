package defpackage;

/* renamed from: vly reason: default package */
public abstract class vly {

    /* renamed from: vly$a */
    public static final class a extends vly {
        public final vlw a;

        public a(vlw vlw) {
            this.a = (vlw) gcr.a(vlw);
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
            sb.append("GenderSelected{gender=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct);

    public abstract void a(gcs<a> gcs);

    vly() {
    }
}
