package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: idw reason: default package */
public abstract class idw {

    /* renamed from: idw$a */
    public static final class a extends idw {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelLoadMetadataRequest{}";
        }
    }

    /* renamed from: idw$b */
    public static final class b extends idw {
        final AdSlotEvent a;

        b(AdSlotEvent adSlotEvent) {
            this.a = (AdSlotEvent) gec.a(adSlotEvent);
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
            sb.append("LoadAdMetadata{adSlotEvent=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: idw$c */
    public static final class c extends idw {
        final String a;

        c(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("LogMarqueeAdRequestError{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: idw$d */
    public static final class d extends idw {
        final String a;

        d(String str) {
            this.a = (String) gec.a(str);
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
            sb.append("LogMarqueeNotDisplayed{adId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: idw$e */
    public static final class e extends idw {
        final ido a;

        e(ido ido) {
            this.a = (ido) gec.a(ido);
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
            sb.append("RenderMarquee{marquee=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: idw$f */
    public static final class f extends idw {
        private final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestMarqueeAd{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    idw() {
    }

    public static idw a(String str) {
        return new c(str);
    }
}
