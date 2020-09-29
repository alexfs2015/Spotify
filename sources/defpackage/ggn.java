package defpackage;

/* renamed from: ggn reason: default package */
public abstract class ggn {

    /* renamed from: ggn$a */
    public static final class a extends ggn {
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
            sb.append("FindDevice{physicalDeviceId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ggn$b */
    public static final class b extends ggn {
        public final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowSwitchDeviceDialog{gaiaDeviceJson=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ggn$c */
    public static final class c extends ggn {
        public final String a;

        c(String str) {
            this.a = (String) gcr.a(str);
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
            sb.append("SwitchToDevice{deviceId=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ggn() {
    }

    public static ggn a(String str) {
        return new a(str);
    }

    public static ggn b(String str) {
        return new c(str);
    }
}
