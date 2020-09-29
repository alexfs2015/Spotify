package defpackage;

/* renamed from: nsq reason: default package */
public final class nsq extends nsu {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public nsq(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsu) {
            nsu nsu = (nsu) obj;
            return this.a == nsu.a() && this.b == nsu.b() && this.c == nsu.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeMixUserSettings{userEnabled=");
        sb.append(this.a);
        sb.append(", includeExplicit=");
        sb.append(this.b);
        sb.append(", isFamilyMember=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
