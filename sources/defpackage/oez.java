package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: oez reason: default package */
public abstract class oez {

    /* renamed from: oez$a */
    public static final class a extends oez {
        public final knx<Context, Drawable> a;
        public final int b;

        public a(knx<Context, Drawable> knx, int i) {
            this.a = (knx) gec.a(knx);
            this.b = i;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3) {
            ged.accept(this);
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
    }

    /* renamed from: oez$b */
    public static final class b extends oez {
        public final knx<Context, Drawable> a;
        public final boolean b;
        public final int c;

        public b(knx<Context, Drawable> knx, boolean z, int i) {
            this.a = (knx) gec.a(knx);
            this.b = z;
            this.c = i;
        }

        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3) {
            ged2.accept(this);
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
    }

    /* renamed from: oez$c */
    public static final class c extends oez {
        public final void a(ged<a> ged, ged<b> ged2, ged<c> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Video{}";
        }
    }

    oez() {
    }

    public abstract void a(ged<a> ged, ged<b> ged2, ged<c> ged3);
}
