package defpackage;

import java.util.List;

/* renamed from: gdr reason: default package */
final class gdr extends geo {
    private final List<gex> a;
    private final gej b;
    private final geb c;
    private final String d;
    private final boolean e;

    /* renamed from: gdr$a */
    public static final class a extends defpackage.geo.a {
        private List<gex> a;
        private gej b;
        private geb c;
        private String d;
        private Boolean e;

        public final defpackage.geo.a a(List<gex> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null eventContextProviders");
        }

        public final defpackage.geo.a a(gej gej) {
            if (gej != null) {
                this.b = gej;
                return this;
            }
            throw new NullPointerException("Null logger");
        }

        public final defpackage.geo.a a(geb geb) {
            this.c = geb;
            return this;
        }

        public final defpackage.geo.a a(String str) {
            this.d = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final defpackage.geo.a a(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final geo a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventContextProviders");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" logger");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventScheduler");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" baseUrl");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" synchronous");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                gdr gdr = new gdr(this.a, this.b, this.c, this.d, this.e.booleanValue(), 0);
                return gdr;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ gdr(List list, gej gej, geb geb, String str, boolean z, byte b2) {
        this(list, gej, geb, str, z);
    }

    private gdr(List<gex> list, gej gej, geb geb, String str, boolean z) {
        this.a = list;
        this.b = gej;
        this.c = geb;
        this.d = str;
        this.e = z;
    }

    public final List<gex> a() {
        return this.a;
    }

    public final gej b() {
        return this.b;
    }

    public final geb c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final String d() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkConfiguration{eventContextProviders=");
        sb.append(this.a);
        sb.append(", logger=");
        sb.append(this.b);
        sb.append(", eventScheduler=");
        sb.append(this.c);
        sb.append(", baseUrl=");
        sb.append(this.d);
        sb.append(", synchronous=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof geo) {
            geo geo = (geo) obj;
            return this.a.equals(geo.a()) && this.b.equals(geo.b()) && this.c.equals(geo.c()) && this.d.equals(geo.d()) && this.e == geo.e();
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }
}
