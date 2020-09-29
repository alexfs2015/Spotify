package defpackage;

/* renamed from: vkh reason: default package */
public abstract class vkh {

    /* renamed from: vkh$a */
    public static final class a extends vkh {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AgeSelected{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct.apply(this);
        }
    }

    /* renamed from: vkh$b */
    public static final class b extends vkh {
        final int a;
        final int b;
        final int c;
        final vkk d;

        b(int i, int i2, int i3, vkk vkk) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = (vkk) gcr.a(vkk);
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

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vkh$c */
    public static final class c extends vkh {
        final int a;
        final int b;
        final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
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

        public final void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3);

    public abstract void a(gcs<a> gcs, gcs<c> gcs2, gcs<b> gcs3);

    vkh() {
    }

    public static vkh a(int i, int i2, int i3, vkk vkk) {
        return new b(i, i2, i3, vkk);
    }
}
