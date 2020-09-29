package defpackage;

/* renamed from: nqn reason: default package */
public abstract class nqn {

    /* renamed from: nqn$a */
    public static final class a extends nqn {
        public final String a;

        a(String str) {
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
            sb.append("FetchSessionList{lastSessionEndTime=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    nqn() {
    }

    public static nqn a(String str) {
        return new a(str);
    }
}
