package defpackage;

import android.graphics.Bitmap;

/* renamed from: tro reason: default package */
public abstract class tro {

    /* renamed from: tro$a */
    public static final class a extends tro {
        final String a;
        final String b;
        final String c;
        final boolean d;
        final int e;

        public a(String str, String str2, String str3, boolean z, int i) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = (String) gcr.a(str3);
            this.d = z;
            this.e = i;
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

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct.apply(this);
        }
    }

    /* renamed from: tro$b */
    public static final class b extends tro {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EpisodeImageFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct7.apply(this);
        }
    }

    /* renamed from: tro$c */
    public static final class c extends tro {
        final Bitmap a;
        final boolean b;

        public c(Bitmap bitmap, boolean z) {
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
            sb.append("EpisodeImageLoaded{bitmap=");
            sb.append(this.a);
            sb.append(", fromNetwork=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct6.apply(this);
        }
    }

    /* renamed from: tro$d */
    public static final class d extends tro {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EpisodeImageLoading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct5.apply(this);
        }
    }

    /* renamed from: tro$e */
    public static final class e extends tro {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PodcastImageFailed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct4.apply(this);
        }
    }

    /* renamed from: tro$f */
    public static final class f extends tro {
        final Bitmap a;
        final boolean b;
        final int c;
        final int d;

        public f(Bitmap bitmap, boolean z, int i, int i2) {
            this.a = (Bitmap) gcr.a(bitmap);
            this.b = z;
            this.c = i;
            this.d = i2;
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

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct3.apply(this);
        }
    }

    /* renamed from: tro$g */
    public static final class g extends tro {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PodcastImageLoading{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7) {
            return gct2.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<a, R_> gct, gct<g, R_> gct2, gct<f, R_> gct3, gct<e, R_> gct4, gct<d, R_> gct5, gct<c, R_> gct6, gct<b, R_> gct7);

    tro() {
    }
}
