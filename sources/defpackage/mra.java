package defpackage;

import java.util.List;

/* renamed from: mra reason: default package */
final class mra extends mre {
    private final String a;
    private final String b;
    private final List<mqw> c;

    /* renamed from: mra$a */
    public static final class a extends defpackage.mre.a {
        private String a;
        private String b;
        private List<mqw> c;

        public final defpackage.mre.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.mre.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.mre.a a(List<mqw> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final mre a() {
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
                sb3.append(" artists");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new mra(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ mra(String str, String str2, List list, byte b2) {
        this(str, str2, list);
    }

    private mra(String str, String str2, List<mqw> list) {
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

    public final List<mqw> c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{uri=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", artists=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mre) {
            mre mre = (mre) obj;
            return this.a.equals(mre.a()) && this.b.equals(mre.b()) && this.c.equals(mre.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
