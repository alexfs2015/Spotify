package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;

/* renamed from: ibk reason: default package */
public abstract class ibk {

    /* renamed from: ibk$a */
    public static final class a extends ibk {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelLoadMetadataRequest{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: ibk$b */
    public static final class b extends ibk {
        final AdSlotEvent a;

        b(AdSlotEvent adSlotEvent) {
            this.a = (AdSlotEvent) gcr.a(adSlotEvent);
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

    /* renamed from: ibk$c */
    public static final class c extends ibk {
        final String a;

        c(String str) {
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
            sb.append("LogMarqueeAdRequestError{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ibk$d */
    public static final class d extends ibk {
        final String a;

        d(String str) {
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
            sb.append("LogMarqueeNotDisplayed{adId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ibk$e */
    public static final class e extends ibk {
        final ibc a;

        e(ibc ibc) {
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
            sb.append("RenderMarquee{marquee=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ibk$f */
    public static final class f extends ibk {
        private final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
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

    ibk() {
    }

    public static ibk a(String str) {
        return new c(str);
    }
}
