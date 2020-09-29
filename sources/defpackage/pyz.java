package defpackage;

/* renamed from: pyz reason: default package */
public abstract class pyz {

    /* renamed from: pyz$a */
    public static final class a extends pyz {
        a() {
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: pyz$b */
    public static final class b extends pyz {
        b() {
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewButton{}";
        }
    }

    /* renamed from: pyz$c */
    public static final class c extends pyz {
        c() {
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewSubmission{}";
        }
    }

    pyz() {
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
