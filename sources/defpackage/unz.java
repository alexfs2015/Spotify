package defpackage;

import com.google.common.base.Optional;

/* renamed from: unz reason: default package */
public abstract class unz {

    /* renamed from: unz$a */
    public static final class a extends unz {
        public final Optional<String> a;
        public final String b;

        a(Optional<String> optional, String str) {
            this.a = (Optional) gec.a(optional);
            this.b = (String) gec.a(str);
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

    /* renamed from: unz$b */
    public static final class b extends unz {
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

    /* renamed from: unz$c */
    public static final class c extends unz {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ObtainSession{}";
        }
    }

    /* renamed from: unz$d */
    public static final class d extends unz {
        d() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenParticipants{}";
        }
    }

    /* renamed from: unz$e */
    public static final class e extends unz {
        e() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof e;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "OpenScanner{}";
        }
    }

    /* renamed from: unz$f */
    public static final class f extends unz {
        public final String a;

        f(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: unz$g */
    public static final class g extends unz {
        g() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof g;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowConfirmEndDialog{}";
        }
    }

    /* renamed from: unz$h */
    public static final class h extends unz {
        h() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof h;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowJoinFailedDialog{}";
        }
    }

    unz() {
    }

    public static unz a(Optional<String> optional, String str) {
        return new a(optional, str);
    }

    public static unz a(boolean z, boolean z2) {
        return new b(true, true);
    }
}
