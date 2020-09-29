package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineTrackList implements JacksonModel, Serializable {
    private static final long serialVersionUID = -5488772392642581215L;
    public final List<OfflineTrack> hits;

    @JsonCreator
    public OfflineTrackList(@JsonProperty("hits") List<OfflineTrack> list) {
        this.hits = gbp.a(list);
    }

    public static OfflineTrackList fromNullable(OfflineTrackList offlineTrackList) {
        return offlineTrackList == null ? getEmptyOfflineTrackList() : offlineTrackList;
    }

    private static OfflineTrackList getEmptyOfflineTrackList() {
        return new OfflineTrackList(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTrackList)) {
            return false;
        }
        return this.hits.equals(((OfflineTrackList) obj).hits);
    }

    public int hashCode() {
        return this.hits.hashCode();
    }
}
