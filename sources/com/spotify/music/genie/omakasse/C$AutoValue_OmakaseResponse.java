package com.spotify.music.genie.omakasse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.genie.omakasse.$AutoValue_OmakaseResponse reason: invalid class name */
abstract class C$AutoValue_OmakaseResponse extends OmakaseResponse {
    private final List<String> uriList;

    C$AutoValue_OmakaseResponse(List<String> list) {
        this.uriList = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmakaseResponse)) {
            return false;
        }
        OmakaseResponse omakaseResponse = (OmakaseResponse) obj;
        List<String> list = this.uriList;
        List uriList2 = omakaseResponse.getUriList();
        return list == null ? uriList2 == null : list.equals(uriList2);
    }

    @JsonProperty("uri")
    public List<String> getUriList() {
        return this.uriList;
    }

    public int hashCode() {
        List<String> list = this.uriList;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmakaseResponse{uriList=");
        sb.append(this.uriList);
        sb.append("}");
        return sb.toString();
    }
}
