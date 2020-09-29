package defpackage;

/* renamed from: por reason: default package */
public abstract class por {

    /* renamed from: por$a */
    public static final class a extends por {
        final String a;

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
            sb.append("MessageDismissed{format=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct2.apply(this);
        }
    }

    /* renamed from: por$b */
    public static final class b extends por {
        final prk a;
        final ppb b;

        public b(prk prk, ppb ppb) {
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
            sb.append("MessageDisplayRequested{trigger=");
            sb.append(this.a);
            sb.append(", quicksilverMessage=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }

        public final <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2) {
            return gct.apply(this);
        }
    }

    public abstract <R_> R_ a(gct<b, R_> gct, gct<a, R_> gct2);

    por() {
    }
}
