package defpackage;

/* renamed from: ubf reason: default package */
public abstract class ubf {

    /* renamed from: ubf$a */
    public static final class a extends ubf {
        final boolean a;

        a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EndSessionButtonClicked{confirmed=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct8.apply(this);
        }
    }

    /* renamed from: ubf$b */
    public static final class b extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FacePileClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct4.apply(this);
        }
    }

    /* renamed from: ubf$c */
    public static final class c extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FailedToJoinSession{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct13.apply(this);
        }
    }

    /* renamed from: ubf$d */
    public static final class d extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LeaveSessionButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct7.apply(this);
        }
    }

    /* renamed from: ubf$e */
    public static final class e extends ubf {
        final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OnlineStateChanged{isOnline=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct3.apply(this);
        }
    }

    /* renamed from: ubf$f */
    public static final class f extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RequestObtainSession{}";
        }

        f() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct14.apply(this);
        }
    }

    /* renamed from: ubf$g */
    public static final class g extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ScanButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct5.apply(this);
        }
    }

    /* renamed from: ubf$h */
    public static final class h extends ubf {
        final int a;

        h(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof h) && ((h) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScannableBgColorExtracted{scannableBgColor=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ubf$i */
    public static final class i extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ScannableImageFailedToLoad{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof i;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct11.apply(this);
        }
    }

    /* renamed from: ubf$j */
    public static final class j extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ScannableImageLoaded{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof j;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct10.apply(this);
        }
    }

    /* renamed from: ubf$k */
    public static final class k extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "SessionDeletedByHost{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof k;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct12.apply(this);
        }
    }

    /* renamed from: ubf$l */
    public static final class l extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShareButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof l;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct9.apply(this);
        }
    }

    /* renamed from: ubf$m */
    public static final class m extends ubf {
        final uax a;

        m(uax uax) {
            this.a = (uax) gcr.a(uax);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            return ((m) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SocialListeningStateRecieved{socialListeningState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct.apply(this);
        }
    }

    /* renamed from: ubf$n */
    public static final class n extends ubf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TryAgainButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof n;
        }

        public final <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14) {
            return gct6.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<m, R_> gct, gct<h, R_> gct2, gct<e, R_> gct3, gct<b, R_> gct4, gct<g, R_> gct5, gct<n, R_> gct6, gct<d, R_> gct7, gct<a, R_> gct8, gct<l, R_> gct9, gct<j, R_> gct10, gct<i, R_> gct11, gct<k, R_> gct12, gct<c, R_> gct13, gct<f, R_> gct14);

    ubf() {
    }

    public static ubf a(uax uax) {
        return new m(uax);
    }

    public static ubf a(int i2) {
        return new h(i2);
    }

    public static ubf a(boolean z) {
        return new a(z);
    }
}
