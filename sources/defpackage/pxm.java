package defpackage;

/* renamed from: pxm reason: default package */
public abstract class pxm {

    /* renamed from: pxm$a */
    public static final class a extends pxm {
        public final qag a;
        public final pxx b;
        public final String c;

        a(qag qag, pxx pxx, String str) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
            this.c = (String) gec.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            return ((((this.a.hashCode() + 0) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LogDiscardedMessage{trigger=");
            sb.append(this.a);
            sb.append(", quicksilverMessage=");
            sb.append(this.b);
            sb.append(", reason=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pxm$b */
    public static final class b extends pxm {
        public final qag a;
        public final pxx b;

        b(qag qag, pxx pxx) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowMessage{trigger=");
            sb.append(this.a);
            sb.append(", quicksilverMessage=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pxm$c */
    public static final class c extends pxm {
        public final String a;
        public final pxq b;

        c(String str, pxq pxq) {
            this.a = (String) gec.a(str);
            this.b = (pxq) gec.a(pxq);
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
            sb.append("UpdateDisplayStatus{format=");
            sb.append(this.a);
            sb.append(", displayStatus=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    pxm() {
    }

    public static pxm a(String str, pxq pxq) {
        return new c(str, pxq);
    }

    public static pxm a(qag qag, pxx pxx) {
        return new b(qag, pxx);
    }

    public static pxm a(qag qag, pxx pxx, String str) {
        return new a(qag, pxx, str);
    }
}
