package defpackage;

/* renamed from: poq reason: default package */
public abstract class poq {

    /* renamed from: poq$a */
    public static final class a extends poq {
        public final prk a;
        public final ppb b;
        public final String c;

        a(prk prk, ppb ppb, String str) {
            this.a = (prk) gcr.a(prk);
            this.b = (ppb) gcr.a(ppb);
            this.c = (String) gcr.a(str);
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

    /* renamed from: poq$b */
    public static final class b extends poq {
        public final prk a;
        public final ppb b;

        b(prk prk, ppb ppb) {
            this.a = (prk) gcr.a(prk);
            this.b = (ppb) gcr.a(ppb);
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

    /* renamed from: poq$c */
    public static final class c extends poq {
        public final String a;
        public final pou b;

        c(String str, pou pou) {
            this.a = (String) gcr.a(str);
            this.b = (pou) gcr.a(pou);
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

    poq() {
    }

    public static poq a(prk prk, ppb ppb) {
        return new b(prk, ppb);
    }

    public static poq a(String str, pou pou) {
        return new c(str, pou);
    }

    public static poq a(prk prk, ppb ppb, String str) {
        return new a(prk, ppb, str);
    }
}
