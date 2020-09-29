package defpackage;

import java.util.List;

/* renamed from: gfc reason: default package */
final class gfc extends gfz {
    private final List<ggi> a;
    private final gfu b;
    private final gfm c;
    private final String d;
    private final boolean e;

    /* renamed from: gfc$a */
    public static final class a extends defpackage.gfz.a {
        private List<ggi> a;
        private gfu b;
        private gfm c;
        private String d;
        private Boolean e;

        public final defpackage.gfz.a a(gfm gfm) {
            this.c = gfm;
            return this;
        }

        public final defpackage.gfz.a a(gfu gfu) {
            if (gfu != null) {
                this.b = gfu;
                return this;
            }
            throw new NullPointerException("Null logger");
        }

        public final defpackage.gfz.a a(String str) {
            this.d = str;
            return this;
        }

        public final defpackage.gfz.a a(List<ggi> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null eventContextProviders");
        }

        /* access modifiers changed from: 0000 */
        public final defpackage.gfz.a a(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final gfz a() {
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
                gfc gfc = new gfc(this.a, this.b, this.c, this.d, this.e.booleanValue(), 0);
                return gfc;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private gfc(List<ggi> list, gfu gfu, gfm gfm, String str, boolean z) {
        this.a = list;
        this.b = gfu;
        this.c = gfm;
        this.d = str;
        this.e = z;
    }

    /* synthetic */ gfc(List list, gfu gfu, gfm gfm, String str, boolean z, byte b2) {
        this(list, gfu, gfm, str, z);
    }

    public final List<ggi> a() {
        return this.a;
    }

    public final gfu b() {
        return this.b;
    }

    public final gfm c() {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfz) {
            gfz gfz = (gfz) obj;
            return this.a.equals(gfz.a()) && this.b.equals(gfz.b()) && this.c.equals(gfz.c()) && this.d.equals(gfz.d()) && this.e == gfz.e();
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
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
}
