package defpackage;

/* renamed from: vlk reason: default package */
public abstract class vlk {

    /* renamed from: vlk$a */
    public static final class a extends vlk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EmailHintDismissed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct3.apply(this);
        }
    }

    /* renamed from: vlk$b */
    public static final class b extends vlk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EmailHintPickerRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: vlk$c */
    public static final class c extends vlk {
        final String a;

        public c(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("EmailHintSelected{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct2.apply(this);
        }
    }

    /* renamed from: vlk$d */
    public static final class d extends vlk {
        final String a;

        public d(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmailInputChanged{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct4.apply(this);
        }
    }

    /* renamed from: vlk$e */
    public static final class e extends vlk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EmailSubmitted{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs7.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: vlk$f */
    public static final class f extends vlk {
        public final vlr a;
        final boolean b;

        public f(vlr vlr, boolean z) {
            this.a = (vlr) gcr.a(vlr);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.b == this.b && fVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmailVerificationReceived{response=");
            sb.append(this.a);
            sb.append(", navigateToNextWhenValidated=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: vlk$g */
    public static final class g extends vlk {
        final String a;

        public g(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return ((g) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EmailVerificationRequested{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: vlk$h */
    public static final class h extends vlk {
        final boolean a;

        public h(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InternetConnectionStateChanged{hasConnection=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8) {
            gcs8.accept(this);
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8) {
            return gct8.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<c, R_> gct2, gct<a, R_> gct3, gct<d, R_> gct4, gct<g, R_> gct5, gct<f, R_> gct6, gct<e, R_> gct7, gct<h, R_> gct8);

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3, gcs<d> gcs4, gcs<g> gcs5, gcs<f> gcs6, gcs<e> gcs7, gcs<h> gcs8);

    vlk() {
    }
}
