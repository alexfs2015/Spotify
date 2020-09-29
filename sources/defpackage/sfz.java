package defpackage;

/* renamed from: sfz reason: default package */
public final class sfz extends sge {
    private final String a;
    private final sgf b;
    private final String c;

    public sfz(String str, sgf sgf, String str2) {
        if (str != null) {
            this.a = str;
            if (sgf != null) {
                this.b = sgf;
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null query");
    }

    public final String a() {
        return this.a;
    }

    public final sgf b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchQuery{query=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", requestId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sge) {
            sge sge = (sge) obj;
            if (this.a.equals(sge.a()) && this.b.equals(sge.b())) {
                String str = this.c;
                return str != null ? str.equals(sge.c()) : sge.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
