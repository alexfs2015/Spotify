package defpackage;

/* renamed from: udc reason: default package */
public abstract class udc {

    /* renamed from: udc$a */
    public static final class a extends udc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EndSession{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: udc$b */
    public static final class b extends udc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LeaveSession{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }
    }

    /* renamed from: udc$c */
    public static final class c extends udc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateBack{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: udc$d */
    public static final class d extends udc {
        public final String a;

        d(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return ((d) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NavigateToUser{username=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: udc$e */
    public static final class e extends udc {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowConfirmEndDialog{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    udc() {
    }
}
