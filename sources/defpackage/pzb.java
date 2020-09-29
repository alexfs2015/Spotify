package defpackage;

/* renamed from: pzb reason: default package */
public abstract class pzb {

    /* renamed from: pzb$a */
    public static final class a extends pzb {
        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "CancelButtonPressed{}";
        }
    }

    /* renamed from: pzb$b */
    public static final class b extends pzb {
        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee6.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ErrorMessageShown{}";
        }
    }

    /* renamed from: pzb$c */
    public static final class c extends pzb {
        final String a;
        private final String b;

        c(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee8.apply(this);
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
    }

    /* renamed from: pzb$d */
    public static final class d extends pzb {
        final String a;
        final String b;

        d(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee7.apply(this);
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
    }

    /* renamed from: pzb$e */
    public static final class e extends pzb {
        final String a;

        e(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
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
            sb.append("MessageLoadingFailed{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pzb$f */
    public static final class f extends pzb {
        final qag a;
        final pxx b;

        public f(qag qag, pxx pxx) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee4.apply(this);
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
    }

    /* renamed from: pzb$g */
    public static final class g extends pzb {
        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewButtonPressed{}";
        }
    }

    /* renamed from: pzb$h */
    public static final class h extends pzb {
        final String a;
        final String b;

        public h(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = str2;
        }

        public final <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return hVar.a.equals(this.a) && gec.a(hVar.b, this.b);
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
    }

    pzb() {
    }

    public static pzb a(String str) {
        return new e(str);
    }

    public static pzb a(String str, String str2) {
        return new d(str, str2);
    }

    public static pzb b(String str, String str2) {
        return new c(str, str2);
    }

    public abstract <R_> R_ a(gee<g, R_> gee, gee<a, R_> gee2, gee<h, R_> gee3, gee<f, R_> gee4, gee<e, R_> gee5, gee<b, R_> gee6, gee<d, R_> gee7, gee<c, R_> gee8);
}
