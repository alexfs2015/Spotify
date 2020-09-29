package defpackage;

/* renamed from: nwq reason: default package */
public abstract class nwq {

    /* renamed from: nwq$a */
    public static final class a extends nwq {
        public final String a;

        a(String str) {
            this.a = (String) gec.a(str);
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

    nwq() {
    }

    public static nwq a(String str) {
        return new a(str);
    }
}
