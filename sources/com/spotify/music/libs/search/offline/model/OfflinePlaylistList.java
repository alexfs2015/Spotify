package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflinePlaylistList implements JacksonModel, Serializable {
    private static final long serialVersionUID = 5640818632950048238L;
    public final List<OfflinePlaylist> hits;

    @JsonCreator
    public OfflinePlaylistList(@JsonProperty("hits") List<OfflinePlaylist> list) {
        this.hits = gcn.a(list);
    }

    public static OfflinePlaylistList fromNullable(OfflinePlaylistList offlinePlaylistList) {
        return offlinePlaylistList == null ? getEmptyOfflinePlaylstList() : offlinePlaylistList;
    }

    private static OfflinePlaylistList getEmptyOfflinePlaylstList() {
        return new OfflinePlaylistList(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflinePlaylistList)) {
            return false;
        }
        return this.hits.equals(((OfflinePlaylistList) obj).hits);
    }

    public int hashCode() {
        return this.hits.hashCode();
    }
}
