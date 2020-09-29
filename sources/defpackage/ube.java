package defpackage;

import com.google.common.base.Optional;

/* renamed from: ube reason: default package */
public abstract class ube {

    /* renamed from: ube$a */
    public static final class a extends ube {
        public final Optional<String> a;
        public final String b;

        a(Optional<String> optional, String str) {
            this.a = (Optional) gcr.a(optional);
            this.b = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ExtractScannableBgColor{imageUri=");
            sb.append(this.a);
            sb.append(", displayName=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ube$b */
    public static final class b extends ube {
        public final boolean a;
        public final boolean b;

        b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b;
        }

        public final int hashCode() {
            return ((Boolean.valueOf(this.a).hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LeaveSession{close=");
            sb.append(this.a);
            sb.append(", pauseMusic=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ube$c */
    public static final class c extends ube {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ObtainSession{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: ube$d */
    public static final class d extends ube {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenParticipants{}";
        }

        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    /* renamed from: ube$e */
    public static final class e extends ube {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenScanner{}";
        }

        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }
    }

    /* renamed from: ube$f */
    public static final class f extends ube {
        public final String a;

        f(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return ((f) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OpenShareFlow{joinUri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ube$g */
    public static final class g extends ube {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowConfirmEndDialog{}";
        }

        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }
    }

    /* renamed from: ube$h */
    public static final class h extends ube {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowJoinFailedDialog{}";
        }

        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }
    }

    ube() {
    }

    public static ube a(Optional<String> optional, String str) {
        return new a(optional, str);
    }

    public static ube a(boolean z, boolean z2) {
        return new b(true, true);
    }
}
