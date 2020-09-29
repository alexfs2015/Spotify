package defpackage;

/* renamed from: saz reason: default package */
final class saz extends sbe {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    saz(String str, String str2, String str3, String str4) {
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
                    throw new NullPointerException("Null followers");
                }
                throw new NullPointerException("Null image");
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

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbe) {
            sbe sbe = (sbe) obj;
            return this.a.equals(sbe.a()) && this.b.equals(sbe.b()) && this.c.equals(sbe.c()) && this.d.equals(sbe.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedArtist{uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", followers=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
