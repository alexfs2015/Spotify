package defpackage;

import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.List;
import java.util.Map;

/* renamed from: ppm reason: default package */
public abstract class ppm {

    /* renamed from: ppm$a */
    public static final class a extends ppm {
        final QuicksilverClickAction a;

        public a(QuicksilverClickAction quicksilverClickAction) {
            this.a = (QuicksilverClickAction) gcr.a(quicksilverClickAction);
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
            sb.append("ActionPerformed{quicksilverClickAction=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: ppm$b */
    public static final class b extends ppm {
        final String a;

        public b(String str) {
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
            sb.append("ActionRequested{clickAction=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: ppm$c */
    public static final class c extends ppm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DismissRequested{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: ppm$d */
    public static final class d extends ppm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InflationError{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct8.apply(this);
        }
    }

    /* renamed from: ppm$e */
    public static final class e extends ppm {
        final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof e) && ((e) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NoteHeightReceived{noteHeight=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct2.apply(this);
        }
    }

    /* renamed from: ppm$f */
    public static final class f extends ppm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotePresented{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct3.apply(this);
        }
    }

    /* renamed from: ppm$g */
    public static final class g extends ppm {
        final List<psk> a;

        public g(List<psk> list) {
            this.a = (List) gcr.a(list);
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
            sb.append("TouchBoundariesReceived{touchBoundaries=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: ppm$h */
    public static final class h extends ppm {
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

        public final <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8) {
            return gct4.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<g, R_> gct, gct<e, R_> gct2, gct<f, R_> gct3, gct<h, R_> gct4, gct<b, R_> gct5, gct<c, R_> gct6, gct<a, R_> gct7, gct<d, R_> gct8);

    ppm() {
    }
}
