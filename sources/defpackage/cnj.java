package defpackage;

import java.util.Arrays;

/* renamed from: cnj reason: default package */
public final class cnj {
    public final String a;
    public final double b;
    public final int c;
    private final double d;
    private final double e;

    public cnj(String str, double d2, double d3, double d4, int i) {
        this.a = str;
        this.e = d2;
        this.d = d3;
        this.b = d4;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cnj)) {
            return false;
        }
        cnj cnj = (cnj) obj;
        return bwv.a(this.a, cnj.a) && this.d == cnj.d && this.e == cnj.e && this.c == cnj.c && Double.compare(this.b, cnj.b) == 0;
    }

    public final String toString() {
        return bwv.a((Object) this).a("name", this.a).a("minBound", Double.valueOf(this.e)).a("maxBound", Double.valueOf(this.d)).a("percent", Double.valueOf(this.b)).a("count", Integer.valueOf(this.c)).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
