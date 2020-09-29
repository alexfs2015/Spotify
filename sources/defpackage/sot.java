package defpackage;

/* renamed from: sot reason: default package */
public abstract class sot {

    /* renamed from: sot$a */
    public static final class a extends sot {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Push{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<c> gcs4) {
            gcs.accept(this);
        }
    }

    /* renamed from: sot$b */
    public static final class b extends sot {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ReplaceAll{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<a> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<c> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: sot$c */
    public static final class c extends sot {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReplaceAllFrom{tag=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<c> gcs4) {
            gcs4.accept(this);
        }
    }

    /* renamed from: sot$d */
    public static final class d extends sot {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ReplaceCurrent{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<a> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<c> gcs4) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<d> gcs2, gcs<b> gcs3, gcs<c> gcs4);

    sot() {
    }

    public static sot a(String str) {
        return new c(str);
    }
}
