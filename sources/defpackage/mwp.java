package defpackage;

/* renamed from: mwp reason: default package */
final class mwp extends mwo {
    private final String a;
    private final String b;
    private final String c;

    mwp(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null displayName");
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwo) {
            mwo mwo = (mwo) obj;
            if (this.a.equals(mwo.a()) && this.b.equals(mwo.b())) {
                String str = this.c;
                return str != null ? str.equals(mwo.c()) : mwo.c() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistData{uri=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
