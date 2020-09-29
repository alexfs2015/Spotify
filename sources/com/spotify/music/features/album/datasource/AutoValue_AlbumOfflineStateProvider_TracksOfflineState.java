package com.spotify.music.features.album.datasource;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineTrack;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.TracksOfflineState;
import java.util.List;

final class AutoValue_AlbumOfflineStateProvider_TracksOfflineState extends TracksOfflineState {
    private final List<OfflineTrack> tracks;

    AutoValue_AlbumOfflineStateProvider_TracksOfflineState(List<OfflineTrack> list) {
        if (list != null) {
            this.tracks = list;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    public final List<OfflineTrack> getTracks() {
        return this.tracks;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TracksOfflineState{tracks=");
        sb.append(this.tracks);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TracksOfflineState)) {
            return false;
        }
        return this.tracks.equals(((TracksOfflineState) obj).getTracks());
    }

    public final int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }
}
