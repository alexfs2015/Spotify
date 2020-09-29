package defpackage;

/* renamed from: vzc reason: default package */
public abstract class vzc {

    /* renamed from: vzc$a */
    public static final class a extends vzc {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee3.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3, ged<d> ged4) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Female{}";
        }
    }

    /* renamed from: vzc$b */
    public static final class b extends vzc {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee2.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3, ged<d> ged4) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Male{}";
        }
    }

    /* renamed from: vzc$c */
    public static final class c extends vzc {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3, ged<d> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "None{}";
        }
    }

    /* renamed from: vzc$d */
    public static final class d extends vzc {
        public final <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4) {
            return gee4.apply(this);
        }

        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3, ged<d> ged4) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoneBinary{}";
        }
    }

    vzc() {
    }

    public abstract <R_> R_ a(gee<c, R_> gee, gee<b, R_> gee2, gee<a, R_> gee3, gee<d, R_> gee4);

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3, ged<d> ged4);
}
