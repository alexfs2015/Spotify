package defpackage;

/* renamed from: sgf reason: default package */
public abstract class sgf {

    /* renamed from: sgf$a */
    public static final class a extends sgf {
        public final int a;

        public a(int i) {
            this.a = i;
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

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs2.accept(this);
        }
    }

    /* renamed from: sgf$b */
    public static final class b extends sgf {
        public final int a;

        public b(int i) {
            this.a = i;
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

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs3.accept(this);
        }
    }

    /* renamed from: sgf$c */
    public static final class c extends sgf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ClickedTrendingSearch{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs4.accept(this);
        }
    }

    /* renamed from: sgf$d */
    public static final class d extends sgf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "DoneButtonClicked{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs5.accept(this);
        }
    }

    /* renamed from: sgf$e */
    public static final class e extends sgf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InitialQuery{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs6.accept(this);
        }
    }

    /* renamed from: sgf$f */
    public static final class f extends sgf {
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
            sb.append("TabSwitched{tabId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs7.accept(this);
        }
    }

    /* renamed from: sgf$g */
    public static final class g extends sgf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "UserInput{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<g> gcs, gcs<a> gcs2, gcs<b> gcs3, gcs<c> gcs4, gcs<d> gcs5, gcs<e> gcs6, gcs<f> gcs7);

    sgf() {
    }
}
