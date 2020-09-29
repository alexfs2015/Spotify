package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: vmt reason: default package */
final class vmt extends vmw {
    private final List<vmy> a;

    vmt(List<vmy> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null selection");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("selection")
    public final List<vmy> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vmw)) {
            return false;
        }
        return this.a.equals(((vmw) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastCompleteRequestBody{selection=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
