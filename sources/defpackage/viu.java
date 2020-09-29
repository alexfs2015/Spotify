package defpackage;

/* renamed from: viu reason: default package */
final class viu extends viz {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    viu(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        return;
                    }
                    throw new NullPointerException("Null authServerUrl");
                }
                throw new NullPointerException("Null apiServerUrl");
            }
            throw new NullPointerException("Null authcode");
        }
        throw new NullPointerException("Null idToken");
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

    public final String d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamsungTokenResponse{idToken=");
        sb.append(this.a);
        sb.append(", authcode=");
        sb.append(this.b);
        sb.append(", apiServerUrl=");
        sb.append(this.c);
        sb.append(", authServerUrl=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof viz) {
            viz viz = (viz) obj;
            return this.a.equals(viz.a()) && this.b.equals(viz.b()) && this.c.equals(viz.c()) && this.d.equals(viz.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
