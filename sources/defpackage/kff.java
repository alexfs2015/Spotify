package defpackage;

/* renamed from: kff reason: default package */
public abstract class kff {

    /* renamed from: kff$a */
    public static final class a extends kff {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Pause{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: kff$b */
    public static final class b extends kff {
        public final String a;
        private final boolean b;

        b(String str, boolean z) {
            this.a = (String) gcr.a(str);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.b == this.b && bVar.a.equals(this.a);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + Boolean.valueOf(this.b).hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Prepare{previewUrl=");
            sb.append(this.a);
            sb.append(", playWhenReady=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: kff$c */
    public static final class c extends kff {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Resume{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }
    }

    /* renamed from: kff$d */
    public static final class d extends kff {
        public final long a;

        d(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof d) && ((d) obj).a == this.a;
        }

        public final int hashCode() {
            return Long.valueOf(this.a).hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SeekAndResume{position=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    kff() {
    }
}
