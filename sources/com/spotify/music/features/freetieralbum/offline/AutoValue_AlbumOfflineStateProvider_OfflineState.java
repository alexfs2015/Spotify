package com.spotify.music.features.freetieralbum.offline;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Album;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;
import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Track;
import java.util.List;

final class AutoValue_AlbumOfflineStateProvider_OfflineState extends OfflineState {
    private final Album album;
    private final List<Track> tracks;

    AutoValue_AlbumOfflineStateProvider_OfflineState(Album album2, List<Track> list) {
        if (album2 != null) {
            this.album = album2;
            if (list != null) {
                this.tracks = list;
                return;
            }
            throw new NullPointerException("Null tracks");
        }
        throw new NullPointerException("Null album");
    }

    public final Album getAlbum() {
        return this.album;
    }

    public final List<Track> getTracks() {
        return this.tracks;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineState{album=");
        sb.append(this.album);
        sb.append(", tracks=");
        sb.append(this.tracks);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineState) {
            OfflineState offlineState = (OfflineState) obj;
            return this.album.equals(offlineState.getAlbum()) && this.tracks.equals(offlineState.getTracks());
        }
    }

    public final int hashCode() {
        return ((this.album.hashCode() ^ 1000003) * 1000003) ^ this.tracks.hashCode();
    }
}
