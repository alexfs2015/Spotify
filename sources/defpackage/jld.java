package defpackage;

/* renamed from: jld reason: default package */
final class jld extends jlh {
    private final String a;
    private final String b;
    private final String c;

    jld(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null value");
            }
            throw new NullPointerException("Null fieldName");
        }
        throw new NullPointerException("Null locale");
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field{locale=");
        sb.append(this.a);
        sb.append(", fieldName=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jlh) {
            jlh jlh = (jlh) obj;
            return this.a.equals(jlh.a()) && this.b.equals(jlh.b()) && this.c.equals(jlh.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
