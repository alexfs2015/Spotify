package com.spotify.music.features.hiddencontent.loader;

import com.spotify.mobile.android.spotlets.collection.json.ArtistJacksonModel;
import com.spotify.mobile.android.spotlets.collection.json.TrackJacksonModel;
import com.spotify.music.features.hiddencontent.loader.BansLoader.BansResponse;
import java.util.List;

final class AutoValue_BansLoader_BansResponse extends BansResponse {
    private final List<ArtistJacksonModel> artists;
    private final List<TrackJacksonModel> tracks;

    AutoValue_BansLoader_BansResponse(List<TrackJacksonModel> list, List<ArtistJacksonModel> list2) {
        if (list != null) {
            this.tracks = list;
            if (list2 != null) {
                this.artists = list2;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null tracks");
    }

    public final List<TrackJacksonModel> getTracks() {
        return this.tracks;
    }

    public final List<ArtistJacksonModel> getArtists() {
        return this.artists;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BansResponse{tracks=");
        sb.append(this.tracks);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BansResponse) {
            BansResponse bansResponse = (BansResponse) obj;
            return this.tracks.equals(bansResponse.getTracks()) && this.artists.equals(bansResponse.getArtists());
        }
    }

    public final int hashCode() {
        return ((this.tracks.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode();
    }
}
