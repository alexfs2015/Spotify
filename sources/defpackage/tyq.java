package defpackage;

/* renamed from: tyq reason: default package */
final class tyq extends tyv {
    private final String a;
    private final int b;
    private final int c;
    private final Integer d;
    private final boolean e;

    tyq(String str, int i, int i2, Integer num, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = num;
            this.e = z;
            return;
        }
        throw new NullPointerException("Null podcastName");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final Integer d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tyv) {
            tyv tyv = (tyv) obj;
            if (this.a.equals(tyv.a()) && this.b == tyv.b() && this.c == tyv.c()) {
                Integer num = this.d;
                if (num != null ? num.equals(tyv.d()) : tyv.d() == null) {
                    if (this.e == tyv.e()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        Integer num = this.d;
        return ((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeSubtitle{podcastName=");
        sb.append(this.a);
        sb.append(", publishDate=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", timeLeft=");
        sb.append(this.d);
        sb.append(", isPlayed=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
