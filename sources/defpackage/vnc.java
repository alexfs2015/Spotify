package defpackage;

import java.util.Set;

/* renamed from: vnc reason: default package */
public final class vnc extends vng {
    private final Set<voh> a;

    public vnc(Set<voh> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null selectedTopics");
    }

    public final Set<voh> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vng)) {
            return false;
        }
        return this.a.equals(((vng) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendTopicsModel{selectedTopics=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
