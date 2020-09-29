package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: vbh reason: default package */
final class vbh extends vbl {
    private final boolean a;
    private final String b;
    private final boolean c;
    private final String d;
    private final ImmutableList<b> e;

    /* renamed from: vbh$a */
    static final class a extends defpackage.vbl.a {
        private Boolean a;
        private String b;
        private Boolean c;
        private String d;
        private ImmutableList<b> e;

        a() {
        }

        private a(vbl vbl) {
            this.a = Boolean.valueOf(vbl.a());
            this.b = vbl.b();
            this.c = Boolean.valueOf(vbl.c());
            this.d = vbl.d();
            this.e = vbl.e();
        }

        /* synthetic */ a(vbl vbl, byte b2) {
            this(vbl);
        }

        public final defpackage.vbl.a a(ImmutableList<b> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterToggles");
        }

        public final defpackage.vbl.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null showSortTitle");
        }

        public final defpackage.vbl.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final vbl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" canSort");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" showSortTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canTextFilter");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showTextFilterTitle");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" filterToggles");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                vbh vbh = new vbh(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d, this.e, 0);
                return vbh;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.vbl.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null showTextFilterTitle");
        }

        public final defpackage.vbl.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    private vbh(boolean z, String str, boolean z2, String str2, ImmutableList<b> immutableList) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
        this.e = immutableList;
    }

    /* synthetic */ vbh(boolean z, String str, boolean z2, String str2, ImmutableList immutableList, byte b2) {
        this(z, str, z2, str2, immutableList);
    }

    public final boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final ImmutableList<b> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbl) {
            vbl vbl = (vbl) obj;
            return this.a == vbl.a() && this.b.equals(vbl.b()) && this.c == vbl.c() && this.d.equals(vbl.d()) && this.e.equals(vbl.e());
        }
    }

    public final defpackage.vbl.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YourLibraryPageOptionsMenuConfiguration{canSort=");
        sb.append(this.a);
        sb.append(", showSortTitle=");
        sb.append(this.b);
        sb.append(", canTextFilter=");
        sb.append(this.c);
        sb.append(", showTextFilterTitle=");
        sb.append(this.d);
        sb.append(", filterToggles=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
