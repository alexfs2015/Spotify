package defpackage;

/* renamed from: uzs reason: default package */
final class uzs extends uzv {
    private final String a;
    private final String b;

    uzs(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastTopic{name=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzv) {
            uzv uzv = (uzv) obj;
            return this.a.equals(uzv.a()) && this.b.equals(uzv.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
