package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: nyn reason: default package */
public abstract class nyn {

    /* renamed from: nyn$a */
    public static final class a extends nyn {
        public final kko<Context, Drawable> a;
        public final int b;

        public a(kko<Context, Drawable> kko, int i) {
            this.a = (kko) gcr.a(kko);
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.b == this.b && aVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Integer.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Chevron{drawable=");
            sb.append(this.a);
            sb.append(", contentDescResId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: nyn$b */
    public static final class b extends nyn {
        public final kko<Context, Drawable> a;
        public final boolean b;
        public final int c;

        public b(kko<Context, Drawable> kko, boolean z, int i) {
            this.a = (kko) gcr.a(kko);
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.c == this.c && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Heart{drawable=");
            sb.append(this.a);
            sb.append(", isActivated=");
            sb.append(this.b);
            sb.append(", contentDescResId=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: nyn$c */
    public static final class c extends nyn {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Video{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3) {
            gcs3.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2, gcs<c> gcs3);

    nyn() {
    }
}
