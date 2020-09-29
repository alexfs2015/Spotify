package defpackage;

/* renamed from: src reason: default package */
final class src extends sri {
    private final String a;
    private final String b;

    src(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null header");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sri) {
            sri sri = (sri) obj;
            return this.a.equals(sri.a()) && this.b.equals(sri.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTextHolder{header=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
