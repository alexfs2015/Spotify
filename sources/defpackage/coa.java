package defpackage;

import java.util.Arrays;

/* renamed from: coa reason: default package */
public final class coa {
    public final String a;
    public final double b;
    public final int c;
    private final double d;
    private final double e;

    public coa(String str, double d2, double d3, double d4, int i) {
        this.a = str;
        this.e = d2;
        this.d = d3;
        this.b = d4;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof coa)) {
            return false;
        }
        coa coa = (coa) obj;
        return bxm.a(this.a, coa.a) && this.d == coa.d && this.e == coa.e && this.c == coa.c && Double.compare(this.b, coa.b) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return bxm.a((Object) this).a("name", this.a).a("minBound", Double.valueOf(this.e)).a("maxBound", Double.valueOf(this.d)).a("percent", Double.valueOf(this.b)).a("count", Integer.valueOf(this.c)).toString();
    }
}
