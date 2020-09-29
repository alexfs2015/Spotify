package defpackage;

import java.util.Set;

/* renamed from: gfa reason: default package */
final class gfa extends gfo {
    private final Set<Integer> a;
    private final boolean b;

    /* renamed from: gfa$a */
    static final class a extends defpackage.gfo.a {
        private Set<Integer> a;
        private Boolean b;

        a() {
        }

        public final defpackage.gfo.a a(Set<Integer> set) {
            if (set != null) {
                this.a = set;
                return this;
            }
            throw new NullPointerException("Null deletableIndices");
        }

        public final defpackage.gfo.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final gfo a() {
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
                return new gfa(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private gfa(Set<Integer> set, boolean z) {
        this.a = set;
        this.b = z;
    }

    /* synthetic */ gfa(Set set, boolean z, byte b2) {
        this(set, z);
    }

    public final Set<Integer> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfo) {
            gfo gfo = (gfo) obj;
            return this.a.equals(gfo.a()) && this.b == gfo.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventsResponse{deletableIndices=");
        sb.append(this.a);
        sb.append(", shouldBackoff=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
