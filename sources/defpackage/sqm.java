package defpackage;

/* renamed from: sqm reason: default package */
public abstract class sqm {

    /* renamed from: sqm$a */
    public static final class a extends sqm {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AutoFilledSuggestion{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sqm$b */
    public static final class b extends sqm {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).a == this.a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClickedSuggestion{itemIndex=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sqm$c */
    public static final class c extends sqm {
        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged4.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClickedTrendingSearch{}";
        }
    }

    /* renamed from: sqm$d */
    public static final class d extends sqm {
        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged5.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoneButtonClicked{}";
        }
    }

    /* renamed from: sqm$e */
    public static final class e extends sqm {
        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged6.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InitialQuery{}";
        }
    }

    /* renamed from: sqm$f */
    public static final class f extends sqm {
        private final String a;

        f(String str) {
            this.a = (String) gec.a(str);
        }

        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged7.accept(this);
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
            sb.append("TabSwitched{tabId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: sqm$g */
    public static final class g extends sqm {
        g() {
        }

        public final void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UserInput{}";
        }
    }

    sqm() {
    }

    public abstract void a(ged<g> ged, ged<a> ged2, ged<b> ged3, ged<c> ged4, ged<d> ged5, ged<e> ged6, ged<f> ged7);
}
