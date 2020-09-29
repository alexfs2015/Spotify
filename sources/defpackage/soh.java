package defpackage;

import java.util.List;

/* renamed from: soh reason: default package */
abstract class soh extends soj {
    final sih a;
    final List<String> b;

    /* renamed from: soh$a */
    static final class a extends defpackage.soj.a {
        private sih a;
        private List<String> b;

        a() {
        }

        public final defpackage.soj.a a(sih sih) {
            if (sih != null) {
                this.a = sih;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public final defpackage.soj.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null uris");
        }

        public final soj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" viewUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uris");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new soi(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    soh(sih sih, List<String> list) {
        if (sih != null) {
            this.a = sih;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null uris");
        }
        throw new NullPointerException("Null viewUri");
    }

    public final sih a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ModerationViewConfig{viewUri=");
        sb.append(this.a);
        sb.append(", uris=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soj) {
            soj soj = (soj) obj;
            return this.a.equals(soj.a()) && this.b.equals(soj.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
