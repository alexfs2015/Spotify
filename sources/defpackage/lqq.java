package defpackage;

import java.util.List;

/* renamed from: lqq reason: default package */
final class lqq extends b {
    private final String a;
    private final List<String> b;

    /* renamed from: lqq$a */
    static final class a implements defpackage.lqm.b.a {
        private String a;
        private List<String> b;

        a() {
        }

        public final defpackage.lqm.b.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.lqm.b.a a(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null trackUris");
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" title");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trackUris");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new lqq(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ lqq(String str, List list, byte b2) {
        this(str, list);
    }

    private lqq(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data{title=");
        sb.append(this.a);
        sb.append(", trackUris=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
