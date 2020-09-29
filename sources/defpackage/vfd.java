package defpackage;

/* renamed from: vfd reason: default package */
public abstract class vfd<T> {

    /* renamed from: vfd$a */
    public static final class a extends vfd<Object> {
        a() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c<Object>, R_> gee2, gee<a, R_> gee3) {
            return gee3.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NetworkBecameAvailable{}";
        }
    }

    /* renamed from: vfd$b */
    public static final class b extends vfd<Object> {
        b() {
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c<Object>, R_> gee2, gee<a, R_> gee3) {
            return gee.apply(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "StartLoading{}";
        }
    }

    /* renamed from: vfd$c */
    public static final class c<T> extends vfd<T> {
        final vez<T> a;

        c(vez<T> vez) {
            this.a = (vez) gec.a(vez);
        }

        public final <R_> R_ a(gee<b, R_> gee, gee<c<T>, R_> gee2, gee<a, R_> gee3) {
            return gee2.apply(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StateChanged{newState=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    vfd() {
    }

    public static <T> vfd<T> a(vez<T> vez) {
        return new c(vez);
    }

    public abstract <R_> R_ a(gee<b, R_> gee, gee<c<T>, R_> gee2, gee<a, R_> gee3);
}
