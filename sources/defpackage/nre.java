package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel;
import java.util.List;

/* renamed from: nre reason: default package */
public final class nre extends nrj {
    private final List<LocalSourceJacksonModel> a;

    public nre(List<LocalSourceJacksonModel> list) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalSourcesRequest{sources=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nrj)) {
            return false;
        }
        return this.a.equals(((nrj) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
