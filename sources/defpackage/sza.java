package defpackage;

/* renamed from: sza reason: default package */
public abstract class sza {

    /* renamed from: sza$a */
    public static final class a extends sza {
        a() {
        }

        public final void a(ged<a> ged, ged<d> ged2, ged<b> ged3, ged<c> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Push{}";
        }
    }

    /* renamed from: sza$b */
    public static final class b extends sza {
        b() {
        }

        public final void a(ged<a> ged, ged<d> ged2, ged<b> ged3, ged<c> ged4) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ReplaceAll{}";
        }
    }

    /* renamed from: sza$c */
    public static final class c extends sza {
        public final String a;

        c(String str) {
            this.a = (String) gec.a(str);
        }

        public final void a(ged<a> ged, ged<d> ged2, ged<b> ged3, ged<c> ged4) {
            ged4.accept(this);
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
    }

    /* renamed from: sza$d */
    public static final class d extends sza {
        d() {
        }

        public final void a(ged<a> ged, ged<d> ged2, ged<b> ged3, ged<c> ged4) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ReplaceCurrent{}";
        }
    }

    sza() {
    }

    public static sza a(String str) {
        return new c(str);
    }

    public abstract void a(ged<a> ged, ged<d> ged2, ged<b> ged3, ged<c> ged4);
}
