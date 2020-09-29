package defpackage;

import java.util.List;

/* renamed from: syo reason: default package */
abstract class syo extends syq {
    final sso a;
    final List<String> b;

    /* renamed from: syo$a */
    static final class a extends defpackage.syq.a {
        private sso a;
        private List<String> b;

        a() {
        }

        public final defpackage.syq.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null uris");
        }

        public final defpackage.syq.a a(sso sso) {
            if (sso != null) {
                this.a = sso;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public final syq a() {
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
                return new syp(this.a, this.b);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    syo(sso sso, List<String> list) {
        if (sso != null) {
            this.a = sso;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null uris");
        }
        throw new NullPointerException("Null viewUri");
    }

    public final sso a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof syq) {
            syq syq = (syq) obj;
            return this.a.equals(syq.a()) && this.b.equals(syq.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ModerationViewConfig{viewUri=");
        sb.append(this.a);
        sb.append(", uris=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
