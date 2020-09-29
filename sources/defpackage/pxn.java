package defpackage;

/* renamed from: pxn reason: default package */
public abstract class pxn {

    /* renamed from: pxn$a */
    public static final class a extends pxn {
        final String a;

        public a(String str) {
            this.a = (String) gec.a(str);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee2.apply(this);
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
    }

    /* renamed from: pxn$b */
    public static final class b extends pxn {
        final qag a;
        final pxx b;

        public b(qag qag, pxx pxx) {
            this.a = (qag) gec.a(qag);
            this.b = (pxx) gec.a(pxx);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2) {
            return gee.apply(this);
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
    }

    pxn() {
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<a, R_> gee2);
}
