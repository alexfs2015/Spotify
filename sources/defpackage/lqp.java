package defpackage;

import java.util.List;

/* renamed from: lqp reason: default package */
final class lqp extends defpackage.lqm.a {
    private final String a;
    private final String b;
    private final List<lqv> c;

    /* renamed from: lqp$a */
    static final class a implements C0052a {
        private String a;
        private String b;
        private List<lqv> c;

        a() {
        }

        public final C0052a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final C0052a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final C0052a a(List<lqv> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        public final defpackage.lqm.a a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tracks");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new lqp(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ lqp(String str, String str2, List list, byte b2) {
        this(str, str2, list);
    }

    private lqp(String str, String str2, List<lqv> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<lqv> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artist{uri=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tracks=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqm.a) {
            defpackage.lqm.a aVar = (defpackage.lqm.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
