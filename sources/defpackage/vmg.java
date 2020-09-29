package defpackage;

/* renamed from: vmg reason: default package */
public abstract class vmg {

    /* renamed from: vmg$a */
    public static final class a extends vmg {
        final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = (String) gcr.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NameChanged{name=");
            sb.append(this.a);
            sb.append(", changedByUser=");
            sb.append(this.b);
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

    vmg() {
    }
}
