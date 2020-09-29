package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import java.util.Map;

/* renamed from: pww reason: default package */
public abstract class pww {

    /* renamed from: pww$a */
    public static final class a extends pww {
        public final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ActionRequested{clickActionId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pww$b */
    public static final class b extends pww {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerExpanded{}";
        }
    }

    /* renamed from: pww$c */
    public static final class c extends pww {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee5.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerInflationError{}";
        }
    }

    /* renamed from: pww$d */
    public static final class d extends pww {
        final qag a;
        final BannerMessage b;
        final long c;

        public d(qag qag, BannerMessage bannerMessage, long j) {
            this.a = (qag) gec.a(qag);
            this.b = (BannerMessage) gec.a(bannerMessage);
            this.c = j;
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.c == this.c && dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + Long.valueOf(this.c).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BannerMessageReceived{trigger=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", timeMessageReceived=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pww$e */
    public static final class e extends pww {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerPresented{}";
        }
    }

    /* renamed from: pww$f */
    public static final class f extends pww {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee7.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FirstVisibleSnackBarItem{}";
        }
    }

    /* renamed from: pww$g */
    public static final class g extends pww {
        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoMoreVisibleSnackBarItems{}";
        }
    }

    /* renamed from: pww$h */
    public static final class h extends pww {
        final String a;
        final String b;
        final Map<String, String> c;

        public h(String str, String str2, Map<String, String> map) {
            this.a = str;
            this.b = str2;
            this.c = map;
        }

        public final <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8) {
            return gee4.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return gec.a(hVar.a, this.a) && gec.a(hVar.b, this.b) && gec.a(hVar.c, this.c);
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Map<String, String> map = this.c;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WebviewEventReceived{type=");
            sb.append(this.a);
            sb.append(", target=");
            sb.append(this.b);
            sb.append(", metadata=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    pww() {
    }

    public abstract <R_> R_ a(gee<d, R_> gee, gee<a, R_> gee2, gee<e, R_> gee3, gee<h, R_> gee4, gee<c, R_> gee5, gee<g, R_> gee6, gee<f, R_> gee7, gee<b, R_> gee8);
}
