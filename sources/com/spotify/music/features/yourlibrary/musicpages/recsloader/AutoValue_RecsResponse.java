package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_RecsResponse extends RecsResponse {
    private final List<RecsTrack> recommendedTracks;

    AutoValue_RecsResponse(List<RecsTrack> list) {
        if (list != null) {
            this.recommendedTracks = list;
            return;
        }
        throw new NullPointerException("Null recommendedTracks");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecsResponse)) {
            return false;
        }
        return this.recommendedTracks.equals(((RecsResponse) obj).recommendedTracks());
    }

    public final int hashCode() {
        return this.recommendedTracks.hashCode() ^ 1000003;
    }

    @JsonProperty("recommended_tracks")
    public final List<RecsTrack> recommendedTracks() {
        return this.recommendedTracks;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecsResponse{recommendedTracks=");
        sb.append(this.recommendedTracks);
        sb.append("}");
        return sb.toString();
    }
}
