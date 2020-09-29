package defpackage;

/* renamed from: sev reason: default package */
public final class sev extends sex {
    private final boolean a;
    private final boolean b;

    public sev(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sex) {
            sex sex = (sex) obj;
            return this.a == sex.a() && this.b == sex.b();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrationState{connected=");
        sb.append(this.a);
        sb.append(", installed=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
