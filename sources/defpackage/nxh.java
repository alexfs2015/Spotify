package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel;
import java.util.List;

/* renamed from: nxh reason: default package */
public final class nxh extends nxm {
    private final List<LocalSourceJacksonModel> a;

    public nxh(List<LocalSourceJacksonModel> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null sources");
    }

    @JsonProperty("sources")
    public final List<LocalSourceJacksonModel> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nxm)) {
            return false;
        }
        return this.a.equals(((nxm) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalSourcesRequest{sources=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
