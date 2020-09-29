package defpackage;

/* renamed from: ohn reason: default package */
public abstract class ohn {

    /* renamed from: ohn$a */
    public static final class a extends ohn {
        public final void a(ged<a> ged, ged<b> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoggedIn{}";
        }
    }

    /* renamed from: ohn$b */
    public static final class b extends ohn {
        public final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged2.accept(this);
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
            sb.append("Validated{identifierToken=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ohn() {
    }

    public abstract void a(ged<a> ged, ged<b> ged2);
}
