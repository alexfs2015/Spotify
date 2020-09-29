package defpackage;

import com.spotify.signup.api.services.model.EmailSignupStatus;

/* renamed from: vld reason: default package */
public abstract class vld {

    /* renamed from: vld$a */
    public static final class a extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AbortSignup{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<a> gcs19 = gcs9;
            gcs9.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<a, R_> gct19 = gct9;
            return gct9.apply(this);
        }
    }

    /* renamed from: vld$b */
    public static final class b extends vld {
        public final EmailSignupStatus a;

        b(EmailSignupStatus emailSignupStatus) {
            this.a = (EmailSignupStatus) gcr.a(emailSignupStatus);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountCreationCompleted{status=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<b> gcs19 = gcs12;
            gcs12.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<b, R_> gct19 = gct12;
            return gct12.apply(this);
        }
    }

    /* renamed from: vld$c */
    public static final class c extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AccountCreationRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<c> gcs19 = gcs11;
            gcs11.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<c, R_> gct19 = gct11;
            return gct11.apply(this);
        }
    }

    /* renamed from: vld$d */
    public static final class d extends vld {
        private final vkh a;

        d(vkh vkh) {
            this.a = (vkh) gcr.a(vkh);
        }

        public final vkh a() {
            return this.a;
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
            sb.append("AgeEvent{event=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<d> gcs19 = gcs3;
            gcs3.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<d, R_> gct19 = gct3;
            return gct3.apply(this);
        }
    }

    /* renamed from: vld$e */
    public static final class e extends vld {
        private final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return ((e) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ContinueSigningUp{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs18.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            return gct18.apply(this);
        }
    }

    /* renamed from: vld$f */
    public static final class f extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CredentialSaved{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs16.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            return gct16.apply(this);
        }
    }

    /* renamed from: vld$g */
    public static final class g extends vld {
        private final vlk a;

        g(vlk vlk) {
            this.a = (vlk) gcr.a(vlk);
        }

        public final vlk a() {
            return this.a;
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
            sb.append("EmailEvent{event=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<g> gcs19 = gcs;
            gcs.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<g, R_> gct19 = gct;
            return gct.apply(this);
        }
    }

    /* renamed from: vld$h */
    public static final class h extends vld {
        private final vly a;

        h(vly vly) {
            this.a = (vly) gcr.a(vly);
        }

        public final vly a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return ((h) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GenderEvent{event=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<h> gcs19 = gcs4;
            gcs4.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<h, R_> gct19 = gct4;
            return gct4.apply(this);
        }
    }

    /* renamed from: vld$i */
    public static final class i extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "GoBack{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<i> gcs19 = gcs6;
            gcs6.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<i, R_> gct19 = gct6;
            return gct6.apply(this);
        }
    }

    /* renamed from: vld$j */
    public static final class j extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "GoForward{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<j> gcs19 = gcs7;
            gcs7.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<j, R_> gct19 = gct7;
            return gct7.apply(this);
        }
    }

    /* renamed from: vld$k */
    public static final class k extends vld {
        final boolean a;

        public k(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof k) && ((k) obj).a == this.a;
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

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<k> gcs19 = gcs13;
            gcs13.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<k, R_> gct19 = gct13;
            return gct13.apply(this);
        }
    }

    /* renamed from: vld$l */
    public static final class l extends vld {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LicensesAccepted{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<l> gcs19 = gcs10;
            gcs10.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<l, R_> gct19 = gct10;
            return gct10.apply(this);
        }
    }

    /* renamed from: vld$m */
    public static final class m extends vld {
        final String a;
        final String b;
        public final boolean c;

        m(String str, String str2, boolean z) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return mVar.c == this.c && mVar.a.equals(this.a) && mVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoginAttemptCompleted{username=");
            sb.append(this.a);
            sb.append(", password=***");
            sb.append(", success=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs15.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            return gct15.apply(this);
        }
    }

    /* renamed from: vld$n */
    public static final class n extends vld {
        final String a;
        final String b;

        public n(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return nVar.a.equals(this.a) && nVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LoginRequested{username=");
            sb.append(this.a);
            sb.append(", password=***");
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs14.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            return gct14.apply(this);
        }
    }

    /* renamed from: vld$o */
    public static final class o extends vld {
        private final vmg a;

        o(vmg vmg) {
            this.a = (vmg) gcr.a(vmg);
        }

        public final vmg a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            return ((o) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NameEvent{event=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<o> gcs19 = gcs5;
            gcs5.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<o, R_> gct19 = gct5;
            return gct5.apply(this);
        }
    }

    /* renamed from: vld$p */
    public static final class p extends vld {
        private final vmq a;

        p(vmq vmq) {
            this.a = (vmq) gcr.a(vmq);
        }

        public final vmq a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return ((p) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PasswordEvent{event=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<p> gcs19 = gcs2;
            gcs2.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<p, R_> gct19 = gct2;
            return gct2.apply(this);
        }
    }

    /* renamed from: vld$q */
    public static final class q extends vld {
        final String a;

        public q(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return ((q) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RedirectToLogin{email=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs17.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            return gct17.apply(this);
        }
    }

    /* renamed from: vld$r */
    public static final class r extends vld {
        final vla a;

        public r(vla vla) {
            this.a = (vla) gcr.a(vla);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            return ((r) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SignupConfigurationReceived{signupConfiguration=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18) {
            gcs<r> gcs19 = gcs8;
            gcs8.accept(this);
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18) {
            gct<r, R_> gct19 = gct8;
            return gct8.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<g, R_> gct, gct<p, R_> gct2, gct<d, R_> gct3, gct<h, R_> gct4, gct<o, R_> gct5, gct<i, R_> gct6, gct<j, R_> gct7, gct<r, R_> gct8, gct<a, R_> gct9, gct<l, R_> gct10, gct<c, R_> gct11, gct<b, R_> gct12, gct<k, R_> gct13, gct<n, R_> gct14, gct<m, R_> gct15, gct<f, R_> gct16, gct<q, R_> gct17, gct<e, R_> gct18);

    public abstract void a(gcs<g> gcs, gcs<p> gcs2, gcs<d> gcs3, gcs<h> gcs4, gcs<o> gcs5, gcs<i> gcs6, gcs<j> gcs7, gcs<r> gcs8, gcs<a> gcs9, gcs<l> gcs10, gcs<c> gcs11, gcs<b> gcs12, gcs<k> gcs13, gcs<n> gcs14, gcs<m> gcs15, gcs<f> gcs16, gcs<q> gcs17, gcs<e> gcs18);

    vld() {
    }

    public static vld a(vlk vlk) {
        return new g(vlk);
    }

    public static vld a(vmq vmq) {
        return new p(vmq);
    }

    public static vld a(vkh vkh) {
        return new d(vkh);
    }

    public static vld a(vly vly) {
        return new h(vly);
    }

    public static vld a(vmg vmg) {
        return new o(vmg);
    }

    public static vld a(EmailSignupStatus emailSignupStatus) {
        return new b(emailSignupStatus);
    }

    public static vld a(String str, String str2, boolean z) {
        return new m(str, str2, z);
    }

    public static vld a(String str) {
        return new e(str);
    }
}
