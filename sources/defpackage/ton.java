package defpackage;

/* renamed from: ton reason: default package */
public abstract class ton {

    /* renamed from: ton$a */
    public static final class a extends ton {
        final String a;

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
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: ton$b */
    public static final class b extends ton {
        final uyy<uys> a;

        b(uyy<uys> uyy) {
            this.a = (uyy) gcr.a(uyy);
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
            sb.append("Success{episodeItems=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    ton() {
    }

    public static ton a(String str) {
        return new a(str);
    }

    public static ton a(uyy<uys> uyy) {
        return new b(uyy);
    }
}
