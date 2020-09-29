package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: ibm reason: default package */
public abstract class ibm {

    /* renamed from: ibm$a */
    public static final class a extends ibm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppBackgrounded{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct7.apply(this);
        }
    }

    /* renamed from: ibm$b */
    public static final class b extends ibm {
        final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("MarqueeAdRequestError{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct3.apply(this);
        }
    }

    /* renamed from: ibm$c */
    public static final class c extends ibm {
        final AdSlotEvent a;

        c(AdSlotEvent adSlotEvent) {
            this.a = (AdSlotEvent) gcr.a(adSlotEvent);
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
            sb.append("MarqueeAdRequestSucceeded{marqueeAdSlotEvent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ibm$d */
    public static final class d extends ibm {
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
            sb.append("MetadataLoadedFailed{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct6.apply(this);
        }
    }

    /* renamed from: ibm$e */
    public static final class e extends ibm {
        final ibc a;

        public e(ibc ibc) {
            this.a = (ibc) gcr.a(ibc);
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
            sb.append("MetadataLoadedSucceeded{marquee=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct5.apply(this);
        }
    }

    /* renamed from: ibm$f */
    public static final class f extends ibm {
        final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof f) && ((f) obj).a == this.a;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QuicksilverFormatDisplayed{isDisplayed=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct4.apply(this);
        }
    }

    /* renamed from: ibm$g */
    public static final class g extends ibm {
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
            sb.append("UriChanged{viewUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<g, R_> gct, gct<c, R_> gct2, gct<b, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<d, R_> gct6, gct<a, R_> gct7);

    ibm() {
    }
}
