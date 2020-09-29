package defpackage;

/* renamed from: vxs reason: default package */
public abstract class vxs {

    /* renamed from: vxs$a */
    public static final class a extends vxs {
        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BadAge{}";
        }
    }

    /* renamed from: vxs$b */
    public static final class b extends vxs {
        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TooYoung{}";
        }
    }

    /* renamed from: vxs$c */
    public static final class c extends vxs {
        public final void a(ged<c> ged, ged<b> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unknown{}";
        }
    }

    vxs() {
    }

    public abstract void a(ged<c> ged, ged<b> ged2, ged<a> ged3);
}
