package defpackage;

/* renamed from: say reason: default package */
final class say extends sbd {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;

    say(String str, String str2, String str3, int i, int i2, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                this.d = i;
                this.e = i2;
                if (str4 != null) {
                    this.f = str4;
                    return;
                }
                throw new NullPointerException("Null ownerName");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbd) {
            sbd sbd = (sbd) obj;
            if (this.a.equals(sbd.a()) && this.b.equals(sbd.b())) {
                String str = this.c;
                if (str != null ? str.equals(sbd.c()) : sbd.c() == null) {
                    return this.d == sbd.d() && this.e == sbd.e() && this.f.equals(sbd.f());
                }
            }
        }
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entity{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", trackCount=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", ownerName=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
