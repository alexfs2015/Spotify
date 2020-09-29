package defpackage;

import java.util.List;

/* renamed from: mvq reason: default package */
final class mvq extends mvu {
    private final String a;
    private final String b;
    private final List<mvm> c;

    /* renamed from: mvq$a */
    public static final class a extends defpackage.mvu.a {
        private String a;
        private String b;
        private List<mvm> c;

        public final defpackage.mvu.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.mvu.a a(List<mvm> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final mvu a() {
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
                return new mvq(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.mvu.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    private mvq(String str, String str2, List<mvm> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* synthetic */ mvq(String str, String str2, List list, byte b2) {
        this(str, str2, list);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<mvm> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvu) {
            mvu mvu = (mvu) obj;
            return this.a.equals(mvu.a()) && this.b.equals(mvu.b()) && this.c.equals(mvu.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
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
}
