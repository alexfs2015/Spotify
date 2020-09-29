package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class OfflinePlaylist extends OfflineSearchEntity {
    private static final long serialVersionUID = -5979480502365267469L;

    @JsonCreator
    public OfflinePlaylist(@JsonProperty("name") String str, @JsonProperty("uri") String str2) {
        super(str, str2, "");
    }
}
