package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: pyy reason: default package */
final class pyy extends pzd {
    private final pyz b;
    private final ImmutableMap<String, String> c;
    private final String d;

    /* renamed from: pyy$a */
    static final class a implements defpackage.pzd.a {
        private pyz a;
        private ImmutableMap<String, String> b;
        private String c;

        a() {
        }

        private a(pzd pzd) {
            this.a = pzd.a();
            this.b = pzd.b();
            this.c = pzd.c();
        }

        /* synthetic */ a(pzd pzd, byte b2) {
            this(pzd);
        }

        public final defpackage.pzd.a a(ImmutableMap<String, String> immutableMap) {
            if (immutableMap != null) {
                this.b = immutableMap;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public final defpackage.pzd.a a(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.pzd.a a(pyz pyz) {
            if (pyz != null) {
                this.a = pyz;
                return this;
            }
            throw new NullPointerException("Null displayMode");
        }

        public final pzd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" displayMode");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" events");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new pyy(this.a, this.b, this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private pyy(pyz pyz, ImmutableMap<String, String> immutableMap, String str) {
        this.b = pyz;
        this.c = immutableMap;
        this.d = str;
    }

    /* synthetic */ pyy(pyz pyz, ImmutableMap immutableMap, String str, byte b2) {
        this(pyz, immutableMap, str);
    }

    public final pyz a() {
        return this.b;
    }

    public final ImmutableMap<String, String> b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final defpackage.pzd.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pzd) {
            pzd pzd = (pzd) obj;
            if (this.b.equals(pzd.a()) && this.c.equals(pzd.b())) {
                String str = this.d;
                return str != null ? str.equals(pzd.c()) : pzd.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewToolModel{displayMode=");
        sb.append(this.b);
        sb.append(", events=");
        sb.append(this.c);
        sb.append(", errorMessage=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
