package defpackage;

import android.graphics.Bitmap;

/* renamed from: trq reason: default package */
public abstract class trq {

    /* renamed from: trq$a */
    public static final class a extends trq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Absent{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<d> gcs, gcs<c> gcs2, gcs<b> gcs3, gcs<a> gcs4) {
            gcs4.accept(this);
        }
    }

    /* renamed from: trq$b */
    public static final class b extends trq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failed{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<d> gcs, gcs<c> gcs2, gcs<b> gcs3, gcs<a> gcs4) {
            gcs3.accept(this);
        }
    }

    /* renamed from: trq$c */
    public static final class c extends trq {
        public final Bitmap a;
        public final boolean b;

        c(Bitmap bitmap, boolean z) {
            this.a = (Bitmap) gcr.a(bitmap);
            this.b = z;
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

        public final void a(gcs<d> gcs, gcs<c> gcs2, gcs<b> gcs3, gcs<a> gcs4) {
            gcs2.accept(this);
        }
    }

    /* renamed from: trq$d */
    public static final class d extends trq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<d> gcs, gcs<c> gcs2, gcs<b> gcs3, gcs<a> gcs4) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<d> gcs, gcs<c> gcs2, gcs<b> gcs3, gcs<a> gcs4);

    trq() {
    }

    public static trq a(Bitmap bitmap, boolean z) {
        return new c(bitmap, z);
    }
}
