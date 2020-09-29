package defpackage;

/* renamed from: vxm reason: default package */
public abstract class vxm {

    /* renamed from: vxm$a */
    public static final class a extends vxm {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateToNext{}";
        }
    }

    /* renamed from: vxm$b */
    public static final class b extends vxm {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b && bVar.c == this.c;
        }

        public final int hashCode() {
            return ((((Integer.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SelectAge{year=");
            sb.append(this.a);
            sb.append(", monthOfYear=");
            sb.append(this.b);
            sb.append(", dayOfMonth=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vxm$c */
    public static final class c extends vxm {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;

        c(int i, int i2, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b == this.b && cVar.c == this.c && cVar.d == this.d;
        }

        public final int hashCode() {
            return ((((((Integer.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VerifyAge{year=");
            sb.append(this.a);
            sb.append(", monthOfYear=");
            sb.append(this.b);
            sb.append(", dayOfMonth=");
            sb.append(this.c);
            sb.append(", navigateAfterVerification=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    vxm() {
    }

    public static vxm a(int i, int i2, int i3, boolean z) {
        return new c(i, i2, i3, z);
    }
}
