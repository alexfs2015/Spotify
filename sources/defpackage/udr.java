package defpackage;

import android.graphics.Bitmap;

/* renamed from: udr reason: default package */
public abstract class udr {

    /* renamed from: udr$a */
    public static final class a extends udr {
        final String a;
        final String b;
        final String c;
        final boolean d;
        final int e;

        public a(String str, String str2, String str3, boolean z, int i) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
            this.c = (String) gec.a(str3);
            this.d = z;
            this.e = i;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.d == this.d && aVar.e == this.e && aVar.a.equals(this.a) && aVar.b.equals(this.b) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.valueOf(this.d).hashCode()) * 31) + Integer.valueOf(this.e).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Create{title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", metadata=");
            sb.append(this.c);
            sb.append(", downloaded=");
            sb.append(this.d);
            sb.append(", progress=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: udr$b */
    public static final class b extends udr {
        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EpisodeImageFailed{}";
        }
    }

    /* renamed from: udr$c */
    public static final class c extends udr {
        final Bitmap a;
        final boolean b;

        public c(Bitmap bitmap, boolean z) {
            this.a = (Bitmap) gec.a(bitmap);
            this.b = z;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee6.apply(this);
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
            sb.append("EpisodeImageLoaded{bitmap=");
            sb.append(this.a);
            sb.append(", fromNetwork=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: udr$d */
    public static final class d extends udr {
        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EpisodeImageLoading{}";
        }
    }

    /* renamed from: udr$e */
    public static final class e extends udr {
        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PodcastImageFailed{}";
        }
    }

    /* renamed from: udr$f */
    public static final class f extends udr {
        final Bitmap a;
        final boolean b;
        final int c;
        final int d;

        public f(Bitmap bitmap, boolean z, int i, int i2) {
            this.a = (Bitmap) gec.a(bitmap);
            this.b = z;
            this.c = i;
            this.d = i2;
        }

        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((((((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode()) * 31) + Integer.valueOf(this.c).hashCode()) * 31) + Integer.valueOf(this.d).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PodcastImageLoaded{bitmap=");
            sb.append(this.a);
            sb.append(", fromNetwork=");
            sb.append(this.b);
            sb.append(", bgColor=");
            sb.append(this.c);
            sb.append(", textColor=");
            sb.append(this.d);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: udr$g */
    public static final class g extends udr {
        public final <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PodcastImageLoading{}";
        }
    }

    udr() {
    }

    public abstract <R_> R_ a(gee<a, R_> gee, gee<g, R_> gee2, gee<f, R_> gee3, gee<e, R_> gee4, gee<d, R_> gee5, gee<c, R_> gee6, gee<b, R_> gee7);
}
