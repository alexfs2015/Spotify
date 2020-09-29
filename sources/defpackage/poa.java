package defpackage;

import com.spotify.music.features.quicksilver.messages.models.BannerMessage;
import java.util.Map;

/* renamed from: poa reason: default package */
public abstract class poa {

    /* renamed from: poa$a */
    public static final class a extends poa {
        public final String a;

        public a(String str) {
            this.a = (String) gcr.a(str);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct2.apply(this);
        }
    }

    /* renamed from: poa$b */
    public static final class b extends poa {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerExpanded{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct8.apply(this);
        }
    }

    /* renamed from: poa$c */
    public static final class c extends poa {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerInflationError{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: poa$d */
    public static final class d extends poa {
        final prk a;
        final BannerMessage b;
        final long c;

        public d(prk prk, BannerMessage bannerMessage, long j) {
            this.a = (prk) gcr.a(prk);
            this.b = (BannerMessage) gcr.a(bannerMessage);
            this.c = j;
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

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: poa$e */
    public static final class e extends poa {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BannerPresented{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct3.apply(this);
        }
    }

    /* renamed from: poa$f */
    public static final class f extends poa {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FirstVisibleSnackBarItem{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: poa$g */
    public static final class g extends poa {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoMoreVisibleSnackBarItems{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: poa$h */
    public static final class h extends poa {
        final String a;
        final String b;
        final Map<String, String> c;

        public h(String str, String str2, Map<String, String> map) {
            this.a = str;
            this.b = str2;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return gcr.a(hVar.a, this.a) && gcr.a(hVar.b, this.b) && gcr.a(hVar.c, this.c);
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

        public final <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<d, R_> gct, gct<a, R_> gct2, gct<e, R_> gct3, gct<h, R_> gct4, gct<c, R_> gct5, gct<g, R_> gct6, gct<f, R_> gct7, gct<b, R_> gct8);

    poa() {
    }
}
