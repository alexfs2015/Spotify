package defpackage;

/* renamed from: pqf reason: default package */
public abstract class pqf {

    /* renamed from: pqf$a */
    public static final class a extends pqf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelButtonPressed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct2.apply(this);
        }
    }

    /* renamed from: pqf$b */
    public static final class b extends pqf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorMessageShown{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct6.apply(this);
        }
    }

    /* renamed from: pqf$c */
    public static final class c extends pqf {
        final String a;
        private final String b;

        c(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EventAborted{triggerType=");
            sb.append(this.a);
            sb.append(", pattern=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct8.apply(this);
        }
    }

    /* renamed from: pqf$d */
    public static final class d extends pqf {
        final String a;
        final String b;

        d(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = (String) gcr.a(str2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EventReceived{triggerType=");
            sb.append(this.a);
            sb.append(", pattern=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct7.apply(this);
        }
    }

    /* renamed from: pqf$e */
    public static final class e extends pqf {
        final String a;

        e(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("MessageLoadingFailed{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct5.apply(this);
        }
    }

    /* renamed from: pqf$f */
    public static final class f extends pqf {
        final prk a;
        final ppb b;

        public f(prk prk, ppb ppb) {
            this.a = (prk) gcr.a(prk);
            this.b = (ppb) gcr.a(ppb);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a.equals(this.a) && fVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageReceived{trigger=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct4.apply(this);
        }
    }

    /* renamed from: pqf$g */
    public static final class g extends pqf {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewButtonPressed{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct.apply(this);
        }
    }

    /* renamed from: pqf$h */
    public static final class h extends pqf {
        final String a;
        final String b;

        public h(String str, String str2) {
            this.a = (String) gcr.a(str);
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && gcr.a(hVar.b, this.b);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PreviewRequested{triggerType=");
            sb.append(this.a);
            sb.append(", creativeId=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8) {
            return gct3.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<g, R_> gct, gct<a, R_> gct2, gct<h, R_> gct3, gct<f, R_> gct4, gct<e, R_> gct5, gct<b, R_> gct6, gct<d, R_> gct7, gct<c, R_> gct8);

    pqf() {
    }

    public static pqf a(String str) {
        return new e(str);
    }

    public static pqf a(String str, String str2) {
        return new d(str, str2);
    }

    public static pqf b(String str, String str2) {
        return new c(str, str2);
    }
}
