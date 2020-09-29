package defpackage;

import java.util.Set;

/* renamed from: gdp reason: default package */
final class gdp extends ged {
    private final Set<Integer> a;
    private final boolean b;

    /* renamed from: gdp$a */
    static final class a extends defpackage.ged.a {
        private Set<Integer> a;
        private Boolean b;

        a() {
        }

        public final defpackage.ged.a a(Set<Integer> set) {
            if (set != null) {
                this.a = set;
                return this;
            }
            throw new NullPointerException("Null deletableIndices");
        }

        public final defpackage.ged.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final ged a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" deletableIndices");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" shouldBackoff");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new gdp(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ gdp(Set set, boolean z, byte b2) {
        this(set, z);
    }

    private gdp(Set<Integer> set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final Set<Integer> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventsResponse{deletableIndices=");
        sb.append(this.a);
        sb.append(", shouldBackoff=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ged) {
            ged ged = (ged) obj;
            return this.a.equals(ged.a()) && this.b == ged.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}
