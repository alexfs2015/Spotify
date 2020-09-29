package defpackage;

import java.util.List;

/* renamed from: iwn reason: default package */
abstract class iwn extends ixd {
    final String a;
    final String b;
    final List<iwr> c;

    /* renamed from: iwn$a */
    static final class a extends defpackage.ixd.a {
        private String a;
        private String b;
        private List<iwr> c;

        a() {
        }

        public final defpackage.ixd.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public final defpackage.ixd.a b(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.ixd.a a(List<iwr> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null linkParams");
        }

        public final ixd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" linkParams");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new iwq(this.a, this.b, this.c);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    iwn(String str, String str2, List<iwr> list) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null linkParams");
        }
        throw new NullPointerException("Null entityUri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<iwr> c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shareable{entityUri=");
        sb.append(this.a);
        sb.append(", contextUri=");
        sb.append(this.b);
        sb.append(", linkParams=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ixd) {
            ixd ixd = (ixd) obj;
            if (this.a.equals(ixd.a())) {
                String str = this.b;
                if (str != null ? str.equals(ixd.b()) : ixd.b() == null) {
                    if (this.c.equals(ixd.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }
}
