package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class OfflineTrackAlbum extends OfflineSearchEntity {
    private static final long serialVersionUID = 1879427616445452548L;

    @JsonCreator
    public OfflineTrackAlbum(@JsonProperty("image") String str, @JsonProperty("name") String str2, @JsonProperty("uri") String str3) {
        super(str2, str3, str);
    }
}
