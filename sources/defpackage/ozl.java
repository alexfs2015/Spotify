package defpackage;

import java.util.List;

/* renamed from: ozl reason: default package */
final class ozl extends ozm {
    private final List<uzv> a;

    ozl(List<uzv> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null topics");
    }

    public final List<uzv> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastTopicsResponse{topics=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ozm)) {
            return false;
        }
        return this.a.equals(((ozm) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
