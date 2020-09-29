package defpackage;

import java.util.Set;

/* renamed from: vao reason: default package */
public final class vao extends vas {
    private final Set<vbt> a;

    public vao(Set<vbt> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null selectedTopics");
    }

    public final Set<vbt> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendTopicsModel{selectedTopics=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vas)) {
            return false;
        }
        return this.a.equals(((vas) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
