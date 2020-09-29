package defpackage;

/* renamed from: gar reason: default package */
public abstract class gar {

    /* renamed from: gar$a */
    public static final class a extends gar {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ExperimentFallback{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2) {
            gcs2.accept(this);
        }
    }

    /* renamed from: gar$b */
    public static final class b extends gar {
        public final String a;

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
            sb.append("FeatureFlagsReceived{flags=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<a> gcs2) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<a> gcs2);

    gar() {
    }
}
