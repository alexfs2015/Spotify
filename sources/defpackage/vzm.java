package defpackage;

/* renamed from: vzm reason: default package */
public abstract class vzm {

    /* renamed from: vzm$a */
    public static final class a extends vzm {
        final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = (String) gec.a(str);
            this.b = z;
        }

        public final <R_> R_ a(gee<a, R_> gee) {
            return gee.apply(this);
        }

        public final void a(ged<a> ged) {
            ged.accept(this);
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
    }

    vzm() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee);

    public abstract void a(ged<a> ged);
}
