package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: rcn reason: default package */
abstract class rcn extends b {
    final boolean a;
    final way b;
    final ImmutableMap<String, Boolean> c;
    private final String e;

    /* renamed from: rcn$a */
    static final class a extends defpackage.rdb.b.a {
        private Boolean a;
        private String b;
        private way c;
        private ImmutableMap<String, Boolean> d;

        a() {
        }

        public final defpackage.rdb.b.a a(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.d = immutableMap;
                return this;
            }
            throw new NullPointerException("Null filterStates");
        }

        public final defpackage.rdb.b.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final defpackage.rdb.b.a a(way way) {
            this.c = way;
            return this;
        }

        public final defpackage.rdb.b.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" textFilterActive");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" textFilter");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" filterStates");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new rcy(this.a.booleanValue(), this.b, this.c, this.d);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    rcn(boolean z, String str, way way, ImmutableMap<String, Boolean> immutableMap) {
        this.a = z;
        if (str != null) {
            this.e = str;
            this.b = way;
            if (immutableMap != null) {
                this.c = immutableMap;
                return;
            }
            throw new NullPointerException("Null filterStates");
        }
        throw new NullPointerException("Null textFilter");
    }

    public final boolean a() {
        return this.a;
    }

    public String b() {
        return this.e;
    }

    public final way c() {
        return this.b;
    }

    public final ImmutableMap<String, Boolean> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a() && this.e.equals(bVar.b())) {
                way way = this.b;
                if (way != null ? way.equals(bVar.c()) : bVar.c() == null) {
                    if (this.c.equals(bVar.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003;
        way way = this.b;
        return ((hashCode ^ (way == null ? 0 : way.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterAndSortOptions{textFilterActive=");
        sb.append(this.a);
        sb.append(", textFilter=");
        sb.append(this.e);
        sb.append(", sortOrder=");
        sb.append(this.b);
        sb.append(", filterStates=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
