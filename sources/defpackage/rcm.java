package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: rcm reason: default package */
abstract class rcm extends rdb {
    final int a;
    final int b;
    final Boolean c;
    final boolean d;
    final boolean e;
    private final b g;
    private final ImmutableMap<String, String> h;

    /* renamed from: rcm$a */
    static final class a extends defpackage.rdb.a {
        private Integer a;
        private Integer b;
        private b c;
        private ImmutableMap<String, String> d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        a() {
        }

        private a(rdb rdb) {
            this.a = Integer.valueOf(rdb.a());
            this.b = Integer.valueOf(rdb.b());
            this.c = rdb.c();
            this.d = rdb.d();
            this.e = rdb.e();
            this.f = Boolean.valueOf(rdb.f());
            this.g = Boolean.valueOf(rdb.g());
        }

        /* synthetic */ a(rdb rdb, byte b2) {
            this(rdb);
        }

        public final defpackage.rdb.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rdb.a a(ImmutableMap<String, String> immutableMap) {
            if (immutableMap != null) {
                this.d = immutableMap;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final defpackage.rdb.a a(Boolean bool) {
            this.e = bool;
            return this;
        }

        public final defpackage.rdb.a a(b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null filterAndSortOptions");
        }

        public final defpackage.rdb.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final rdb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" viewportRangeStart");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" viewportRangeSize");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" filterAndSortOptions");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" options");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" availableOnly");
                str = sb5.toString();
            }
            if (this.g == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" offlinedFirst");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                rcx rcx = new rcx(this.a.intValue(), this.b.intValue(), this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue());
                return rcx;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.rdb.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.rdb.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    rcm(int i, int i2, b bVar, ImmutableMap<String, String> immutableMap, Boolean bool, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        if (bVar != null) {
            this.g = bVar;
            if (immutableMap != null) {
                this.h = immutableMap;
                this.c = bool;
                this.d = z;
                this.e = z2;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null filterAndSortOptions");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public b c() {
        return this.g;
    }

    public ImmutableMap<String, String> d() {
        return this.h;
    }

    public final Boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdb) {
            rdb rdb = (rdb) obj;
            if (this.a == rdb.a() && this.b == rdb.b() && this.g.equals(rdb.c()) && this.h.equals(rdb.d())) {
                Boolean bool = this.c;
                if (bool != null ? bool.equals(rdb.e()) : rdb.e() == null) {
                    return this.d == rdb.f() && this.e == rdb.g();
                }
            }
        }
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public final defpackage.rdb.a h() {
        return new a(this, 0);
    }

    public int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        Boolean bool = this.c;
        int i = 1231;
        int hashCode2 = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSourceConfiguration{viewportRangeStart=");
        sb.append(this.a);
        sb.append(", viewportRangeSize=");
        sb.append(this.b);
        sb.append(", filterAndSortOptions=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", isOffline=");
        sb.append(this.c);
        sb.append(", availableOnly=");
        sb.append(this.d);
        sb.append(", offlinedFirst=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
