package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qty reason: default package */
abstract class qty extends b {
    final boolean a;
    final vns b;
    final ImmutableMap<String, Boolean> c;
    private final String e;

    /* renamed from: qty$a */
    static final class a extends defpackage.qum.b.a {
        private Boolean a;
        private String b;
        private vns c;
        private ImmutableMap<String, Boolean> d;

        a() {
        }

        public final defpackage.qum.b.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.qum.b.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final defpackage.qum.b.a a(vns vns) {
            this.c = vns;
            return this;
        }

        public final defpackage.qum.b.a a(ImmutableMap<String, Boolean> immutableMap) {
            if (immutableMap != null) {
                this.d = immutableMap;
                return this;
            }
            throw new NullPointerException("Null filterStates");
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
                return new quj(this.a.booleanValue(), this.b, this.c, this.d);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    qty(boolean z, String str, vns vns, ImmutableMap<String, Boolean> immutableMap) {
        this.a = z;
        if (str != null) {
            this.e = str;
            this.b = vns;
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

    public final vns c() {
        return this.b;
    }

    public final ImmutableMap<String, Boolean> d() {
        return this.c;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a() && this.e.equals(bVar.b())) {
                vns vns = this.b;
                if (vns != null ? vns.equals(bVar.c()) : bVar.c() == null) {
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
        vns vns = this.b;
        return ((hashCode ^ (vns == null ? 0 : vns.hashCode())) * 1000003) ^ this.c.hashCode();
    }
}
