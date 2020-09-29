package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: vaf reason: default package */
final class vaf extends vai {
    private final List<vak> a;

    vaf(List<vak> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null selection");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("selection")
    public final List<vak> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastCompleteRequestBody{selection=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vai)) {
            return false;
        }
        return this.a.equals(((vai) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
