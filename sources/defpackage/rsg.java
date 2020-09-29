package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: rsg reason: default package */
final class rsg extends b {
    private final boolean b;
    private final ImmutableList<rrz> c;
    private final String d;
    private final boolean e;

    rsg(boolean z, ImmutableList<rrz> immutableList, String str, boolean z2) {
        this.b = z;
        if (immutableList != null) {
            this.c = immutableList;
            this.d = str;
            this.e = z2;
            return;
        }
        throw new NullPointerException("Null stories");
    }

    public final boolean a() {
        return this.b;
    }

    public final ImmutableList<rrz> b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stories{loading=");
        sb.append(this.b);
        sb.append(", stories=");
        sb.append(this.c);
        sb.append(", moreStoriesUrl=");
        sb.append(this.d);
        sb.append(", error=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b == bVar.a() && this.c.equals(bVar.b())) {
                String str = this.d;
                if (str != null ? str.equals(bVar.c()) : bVar.c() == null) {
                    if (this.e == bVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode2 ^ i;
    }
}
