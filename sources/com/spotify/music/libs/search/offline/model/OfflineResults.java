package com.spotify.music.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.io.Serializable;

@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineResults implements JacksonModel, Serializable {
    private static final long serialVersionUID = -5317210667781463632L;
    public final OfflineEpisodeList episodes;
    public final OfflinePlaylistList playlists;
    public final String searchTerm;
    public final OfflineTrackList tracks;

    @JsonCreator
    public OfflineResults(@JsonProperty("searchTerm") String str, @JsonProperty("episodes") OfflineEpisodeList offlineEpisodeList, @JsonProperty("tracks") OfflineTrackList offlineTrackList, @JsonProperty("playlists") OfflinePlaylistList offlinePlaylistList) {
        this.searchTerm = (String) fay.a(str);
        this.tracks = OfflineTrackList.fromNullable(offlineTrackList);
        this.episodes = OfflineEpisodeList.fromNullable(offlineEpisodeList);
        this.playlists = OfflinePlaylistList.fromNullable(offlinePlaylistList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineResults)) {
            return false;
        }
        OfflineResults offlineResults = (OfflineResults) obj;
        return this.searchTerm.equals(offlineResults.searchTerm) && this.tracks.equals(offlineResults.tracks) && this.episodes.equals(offlineResults.episodes) && this.playlists.equals(offlineResults.playlists);
    }

    public int hashCode() {
        return (((((this.searchTerm.hashCode() * 31) + this.tracks.hashCode()) * 31) + this.episodes.hashCode()) * 31) + this.playlists.hashCode();
    }
}
