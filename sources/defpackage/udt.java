package defpackage;

import android.graphics.Bitmap;

/* renamed from: udt reason: default package */
public abstract class udt {

    /* renamed from: udt$a */
    public static final class a extends udt {
        a() {
        }

        public final void a(ged<d> ged, ged<c> ged2, ged<b> ged3, ged<a> ged4) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Absent{}";
        }
    }

    /* renamed from: udt$b */
    public static final class b extends udt {
        b() {
        }

        public final void a(ged<d> ged, ged<c> ged2, ged<b> ged3, ged<a> ged4) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failed{}";
        }
    }

    /* renamed from: udt$c */
    public static final class c extends udt {
        public final Bitmap a;
        public final boolean b;

        c(Bitmap bitmap, boolean z) {
            this.a = (Bitmap) gec.a(bitmap);
            this.b = z;
        }

        public final void a(ged<d> ged, ged<c> ged2, ged<b> ged3, ged<a> ged4) {
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
            return cVar.b == this.b && cVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Loaded{bitmap=");
            sb.append(this.a);
            sb.append(", fromNetwork=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: udt$d */
    public static final class d extends udt {
        d() {
        }

        public final void a(ged<d> ged, ged<c> ged2, ged<b> ged3, ged<a> ged4) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    udt() {
    }

    public static udt a(Bitmap bitmap, boolean z) {
        return new c(bitmap, z);
    }

    public abstract void a(ged<d> ged, ged<c> ged2, ged<b> ged3, ged<a> ged4);
}
