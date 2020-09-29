package defpackage;

/* renamed from: vyh reason: default package */
public abstract class vyh {

    /* renamed from: vyh$a */
    public static final class a extends vyh {
        public final vyg a;

        a(vyg vyg) {
            this.a = (vyg) gec.a(vyg);
        }

        public final void a(ged<a> ged, ged<b> ged2) {
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
            sb.append("Fallback{signupConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vyh$b */
    public static final class b extends vyh {
        public final vyg a;

        b(vyg vyg) {
            this.a = (vyg) gec.a(vyg);
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
            sb.append("Loaded{signupConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vyh() {
    }

    public static vyh a(vyg vyg) {
        return new a(vyg);
    }

    public static vyh b(vyg vyg) {
        return new b(vyg);
    }

    public abstract void a(ged<a> ged, ged<b> ged2);
}
