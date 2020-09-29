package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: idy reason: default package */
public abstract class idy {

    /* renamed from: idy$a */
    public static final class a extends idy {
        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "AppBackgrounded{}";
        }
    }

    /* renamed from: idy$b */
    public static final class b extends idy {
        final String a;

        b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee3.apply(this);
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
    }

    /* renamed from: idy$c */
    public static final class c extends idy {
        final AdSlotEvent a;

        c(AdSlotEvent adSlotEvent) {
            this.a = (AdSlotEvent) gec.a(adSlotEvent);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee2.apply(this);
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
    }

    /* renamed from: idy$d */
    public static final class d extends idy {
        final String a;

        public d(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee6.apply(this);
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
    }

    /* renamed from: idy$e */
    public static final class e extends idy {
        final ido a;

        public e(ido ido) {
            this.a = (ido) gec.a(ido);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee5.apply(this);
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
    }

    /* renamed from: idy$f */
    public static final class f extends idy {
        final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee4.apply(this);
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
    }

    /* renamed from: idy$g */
    public static final class g extends idy {
        final String a;

        public g(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7) {
            return gee.apply(this);
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
    }

    idy() {
    }

    public abstract <R_> R_ a(gee<g, R_> gee, gee<c, R_> gee2, gee<b, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<d, R_> gee6, gee<a, R_> gee7);
}
