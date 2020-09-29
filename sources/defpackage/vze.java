package defpackage;

/* renamed from: vze reason: default package */
public abstract class vze {

    /* renamed from: vze$a */
    public static final class a extends vze {
        public final vzc a;

        public a(vzc vzc) {
            this.a = (vzc) gec.a(vzc);
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
    }

    vze() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee);

    public abstract void a(ged<a> ged);
}
