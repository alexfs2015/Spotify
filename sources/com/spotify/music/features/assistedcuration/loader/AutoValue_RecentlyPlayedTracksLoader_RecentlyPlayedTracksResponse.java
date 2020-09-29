package com.spotify.music.features.assistedcuration.loader;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.RecentlyPlayedTracksResponse;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseTrack;
import java.util.List;

final class AutoValue_RecentlyPlayedTracksLoader_RecentlyPlayedTracksResponse extends RecentlyPlayedTracksResponse {
    private final List<ResponseTrack> tracks;

    AutoValue_RecentlyPlayedTracksLoader_RecentlyPlayedTracksResponse(List<ResponseTrack> list) {
        if (list != null) {
            this.tracks = list;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    public final List<ResponseTrack> getTracks() {
        return this.tracks;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentlyPlayedTracksResponse{tracks=");
        sb.append(this.tracks);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecentlyPlayedTracksResponse)) {
            return false;
        }
        return this.tracks.equals(((RecentlyPlayedTracksResponse) obj).getTracks());
    }

    public final int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }
}
