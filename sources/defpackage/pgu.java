package defpackage;

import java.util.List;

/* renamed from: pgu reason: default package */
final class pgu extends pgv {
    private final List<vmj> a;

    pgu(List<vmj> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null topics");
    }

    public final List<vmj> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pgv)) {
            return false;
        }
        return this.a.equals(((pgv) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastTopicsResponse{topics=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
