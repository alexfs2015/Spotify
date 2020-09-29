package defpackage;

/* renamed from: vmg reason: default package */
final class vmg extends vmj {
    private final String a;
    private final String b;

    vmg(String str, String str2) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmj) {
            vmj vmj = (vmj) obj;
            return this.a.equals(vmj.a()) && this.b.equals(vmj.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastTopic{name=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
