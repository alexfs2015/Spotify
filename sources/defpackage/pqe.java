package defpackage;

/* renamed from: pqe reason: default package */
public abstract class pqe {

    /* renamed from: pqe$a */
    public static final class a extends pqe {
        public final String a;
        public final String b;
        public final String c;

        a(String str, String str2, String str3) {
            this.a = (String) gcr.a(str);
            this.b = str2;
            this.c = (String) gcr.a(str3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && gcr.a(aVar.b, this.b) && aVar.c.equals(this.c);
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = (this.a.hashCode() + 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FetchMessage{triggerType=");
            sb.append(this.a);
            sb.append(", uri=");
            sb.append(this.b);
            sb.append(", creativeId=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: pqe$b */
    public static final class b extends pqe {
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
            sb.append("PublishMessage{trigger=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    pqe() {
    }
}
