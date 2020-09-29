package defpackage;

import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import java.util.List;
import java.util.Map;

/* renamed from: pyi reason: default package */
public abstract class pyi {

    /* renamed from: pyi$a */
    public static final class a extends pyi {
        final QuicksilverClickAction a;

        public a(QuicksilverClickAction quicksilverClickAction) {
            this.a = (QuicksilverClickAction) gec.a(quicksilverClickAction);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee7.apply(this);
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
    }

    /* renamed from: pyi$b */
    public static final class b extends pyi {
        final String a;

        public b(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee5.apply(this);
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
    }

    /* renamed from: pyi$c */
    public static final class c extends pyi {
        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DismissRequested{}";
        }
    }

    /* renamed from: pyi$d */
    public static final class d extends pyi {
        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee8.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InflationError{}";
        }
    }

    /* renamed from: pyi$e */
    public static final class e extends pyi {
        final int a;

        public e(int i) {
            this.a = i;
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee2.apply(this);
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
    }

    /* renamed from: pyi$f */
    public static final class f extends pyi {
        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NotePresented{}";
        }
    }

    /* renamed from: pyi$g */
    public static final class g extends pyi {
        final List<qbg> a;

        public g(List<qbg> list) {
            this.a = (List) gec.a(list);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
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
            sb.append("TouchBoundariesReceived{touchBoundaries=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pyi$h */
    public static final class h extends pyi {
        final String a;
        final String b;
        final Map<String, String> c;

        public h(String str, String str2, Map<String, String> map) {
            this.a = str;
            this.b = str2;
            this.c = map;
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8) {
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

    pyi() {
    }

    public abstract <R_> R_ a(gee<g, R_> gee, gee<e, R_> gee2, gee<f, R_> gee3, gee<h, R_> gee4, gee<b, R_> gee5, gee<c, R_> gee6, gee<a, R_> gee7, gee<d, R_> gee8);
}
