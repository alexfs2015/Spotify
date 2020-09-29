package defpackage;

/* renamed from: jbz reason: default package */
final class jbz extends jcc {
    private final jew a;
    private final String b;
    private final String c;
    private final jva d;

    jbz(jew jew, String str, String str2, jva jva) {
        if (jew != null) {
            this.a = jew;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (jva != null) {
                        this.d = jva;
                        return;
                    }
                    throw new NullPointerException("Null spotifyLink");
                }
                throw new NullPointerException("Null completeHttpsShareUri");
            }
            throw new NullPointerException("Null id");
        }
        throw new NullPointerException("Null shareEntityData");
    }

    public final jew a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final jva d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcc) {
            jcc jcc = (jcc) obj;
            return this.a.equals(jcc.a()) && this.b.equals(jcc.b()) && this.c.equals(jcc.c()) && this.d.equals(jcc.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniqueShare{shareEntityData=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", completeHttpsShareUri=");
        sb.append(this.c);
        sb.append(", spotifyLink=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
