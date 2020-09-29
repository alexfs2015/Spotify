package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class OfflineEpisode extends OfflineSearchEntity {
    private static final long serialVersionUID = 6573089720037526087L;

    @JsonCreator
    public OfflineEpisode(@JsonProperty("name") String str, @JsonProperty("image") String str2, @JsonProperty("uri") String str3) {
        super(str, str3, str2);
    }
}
