package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: sbm reason: default package */
final class sbm extends a {
    private final boolean b;
    private final ImmutableList<sbe> c;
    private final boolean d;

    sbm(boolean z, ImmutableList<sbe> immutableList, boolean z2) {
        this.b = z;
        if (immutableList != null) {
            this.c = immutableList;
            this.d = z2;
            return;
        }
        throw new NullPointerException("Null recommendedArtists");
    }

    public final boolean a() {
        return this.b;
    }

    public final ImmutableList<sbe> b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.b == aVar.a() && this.c.equals(aVar.b()) && this.d == aVar.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artists{loading=");
        sb.append(this.b);
        sb.append(", recommendedArtists=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
