package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qtx reason: default package */
abstract class qtx extends qum {
    final int a;
    final int b;
    final Boolean c;
    final boolean d;
    final boolean e;
    private final b g;
    private final ImmutableMap<String, String> h;

    /* renamed from: qtx$a */
    static final class a extends defpackage.qum.a {
        private Integer a;
        private Integer b;
        private b c;
        private ImmutableMap<String, String> d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        /* synthetic */ a(qum qum, byte b2) {
            this(qum);
        }

        a() {
        }

        private a(qum qum) {
            this.a = Integer.valueOf(qum.a());
            this.b = Integer.valueOf(qum.b());
            this.c = qum.c();
            this.d = qum.d();
            this.e = qum.e();
            this.f = Boolean.valueOf(qum.f());
            this.g = Boolean.valueOf(qum.g());
        }

        public final defpackage.qum.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.qum.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.qum.a a(b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null filterAndSortOptions");
        }

        public final defpackage.qum.a a(ImmutableMap<String, String> immutableMap) {
            if (immutableMap != null) {
                this.d = immutableMap;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final defpackage.qum.a a(Boolean bool) {
            this.e = bool;
            return this;
        }

        public final defpackage.qum.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.qum.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final qum a() {
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
                qui qui = new qui(this.a.intValue(), this.b.intValue(), this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue());
                return qui;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    qtx(int i, int i2, b bVar, ImmutableMap<String, String> immutableMap, Boolean bool, boolean z, boolean z2) {
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

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qum) {
            qum qum = (qum) obj;
            if (this.a == qum.a() && this.b == qum.b() && this.g.equals(qum.c()) && this.h.equals(qum.d())) {
                Boolean bool = this.c;
                if (bool != null ? bool.equals(qum.e()) : qum.e() == null) {
                    return this.d == qum.f() && this.e == qum.g();
                }
            }
        }
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

    public final defpackage.qum.a h() {
        return new a(this, 0);
    }
}
