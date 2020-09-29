package defpackage;

/* renamed from: uan reason: default package */
public abstract class uan {

    /* renamed from: uan$a */
    public static final class a extends uan {
        final String a;

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
            sb.append("Failure{message=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: uan$b */
    public static final class b extends uan {
        final vlb<vkv> a;

        b(vlb<vkv> vlb) {
            this.a = (vlb) gec.a(vlb);
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

    uan() {
    }

    public static uan a(String str) {
        return new a(str);
    }

    public static uan a(vlb<vkv> vlb) {
        return new b(vlb);
    }
}
