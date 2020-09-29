package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineEpisodeList implements JacksonModel, Serializable {
    private static final long serialVersionUID = -574000858124179211L;
    public final List<OfflineEpisode> hits;

    @JsonCreator
    public OfflineEpisodeList(@JsonProperty("hits") List<OfflineEpisode> list) {
        this.hits = gcn.a(list);
    }

    public static OfflineEpisodeList fromNullable(OfflineEpisodeList offlineEpisodeList) {
        return offlineEpisodeList == null ? getEmptyOfflineEpisodeList() : offlineEpisodeList;
    }

    private static OfflineEpisodeList getEmptyOfflineEpisodeList() {
        return new OfflineEpisodeList(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineEpisodeList)) {
            return false;
        }
        return this.hits.equals(((OfflineEpisodeList) obj).hits);
    }

    public int hashCode() {
        return this.hits.hashCode();
    }
}
