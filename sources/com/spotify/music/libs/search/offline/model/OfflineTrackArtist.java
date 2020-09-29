package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class OfflineTrackArtist extends OfflineSearchEntity {
    private static final long serialVersionUID = 4807632244952093030L;

    @JsonCreator
    public OfflineTrackArtist(@JsonProperty("uri") String str, @JsonProperty("image") String str2, @JsonProperty("name") String str3) {
        super(str3, str, str2);
    }

    public final String toString() {
        return getName();
    }
}
