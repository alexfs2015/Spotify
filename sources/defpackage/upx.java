package defpackage;

/* renamed from: upx reason: default package */
public abstract class upx {

    /* renamed from: upx$a */
    public static final class a extends upx {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "EndSession{}";
        }
    }

    /* renamed from: upx$b */
    public static final class b extends upx {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LeaveSession{}";
        }
    }

    /* renamed from: upx$c */
    public static final class c extends upx {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NavigateBack{}";
        }
    }

    /* renamed from: upx$d */
    public static final class d extends upx {
        public final String a;

        d(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: upx$e */
    public static final class e extends upx {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowConfirmEndDialog{}";
        }
    }

    upx() {
    }
}
