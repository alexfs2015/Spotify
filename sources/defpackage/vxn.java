package defpackage;

/* renamed from: vxn reason: default package */
public abstract class vxn {

    /* renamed from: vxn$a */
    public static final class a extends vxn {
        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee.apply(this);
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AgeSelected{}";
        }
    }

    /* renamed from: vxn$b */
    public static final class b extends vxn {
        final int a;
        final int b;
        final int c;
        final vxq d;

        b(int i, int i2, int i3, vxq vxq) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = (vxq) gec.a(vxq);
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee3.apply(this);
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b && bVar.c == this.c && bVar.d.equals(this.d);
        }

        public final int hashCode() {
            return ((((((Integer.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AgeVerified{year=");
            sb.append(this.a);
            sb.append(", monthOfYear=");
            sb.append(this.b);
            sb.append(", dayOfMonth=");
            sb.append(this.c);
            sb.append(", ageState=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: vxn$c */
    public static final class c extends vxn {
        final int a;
        final int b;
        final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3) {
            return gee2.apply(this);
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a == this.a && cVar.b == this.b && cVar.c == this.c;
        }

        public final int hashCode() {
            return ((((Integer.valueOf(this.a).hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BirthDayChanged{year=");
            sb.append(this.a);
            sb.append(", monthOfYear=");
            sb.append(this.b);
            sb.append(", dayOfMonth=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    vxn() {
    }

    public static vxn a(int i, int i2, int i3, vxq vxq) {
        return new b(i, i2, i3, vxq);
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3);

    public abstract void a(ged<a> ged, ged<c> ged2, ged<b> ged3);
}
