package defpackage;

/* renamed from: gbs reason: default package */
public abstract class gbs {

    /* renamed from: gbs$a */
    public static final class a extends gbs {
        public final void a(ged<b> ged, ged<a> ged2) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ExperimentFallback{}";
        }
    }

    /* renamed from: gbs$b */
    public static final class b extends gbs {
        public final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final void a(ged<b> ged, ged<a> ged2) {
            ged.accept(this);
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
    }

    gbs() {
    }

    public abstract void a(ged<b> ged, ged<a> ged2);
}
