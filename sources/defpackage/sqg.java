package defpackage;

/* renamed from: sqg reason: default package */
public final class sqg extends sql {
    private final String a;
    private final sqm b;
    private final String c;

    public sqg(String str, sqm sqm, String str2) {
        if (str != null) {
            this.a = str;
            if (sqm != null) {
                this.b = sqm;
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

    public final sqm b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sql) {
            sql sql = (sql) obj;
            if (this.a.equals(sql.a()) && this.b.equals(sql.b())) {
                String str = this.c;
                return str != null ? str.equals(sql.c()) : sql.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
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
}
