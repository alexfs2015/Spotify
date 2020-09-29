package defpackage;

/* renamed from: kti reason: default package */
final class kti extends ktj {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final String e;
    private final String f;
    private final long g;

    kti(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = j;
                    if (str4 != null) {
                        this.e = str4;
                        if (str5 != null) {
                            this.f = str5;
                            this.g = j2;
                            return;
                        }
                        throw new NullPointerException("Null appSignature");
                    }
                    throw new NullPointerException("Null packageName");
                }
                throw new NullPointerException("Null scopes");
            }
            throw new NullPointerException("Null redirectUri");
        }
        throw new NullPointerException("Null clientId");
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

    public final long d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedClientInfo{clientId=");
        sb.append(this.a);
        sb.append(", redirectUri=");
        sb.append(this.b);
        sb.append(", scopes=");
        sb.append(this.c);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", packageName=");
        sb.append(this.e);
        sb.append(", appSignature=");
        sb.append(this.f);
        sb.append(", lastUsedTimestamp=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
