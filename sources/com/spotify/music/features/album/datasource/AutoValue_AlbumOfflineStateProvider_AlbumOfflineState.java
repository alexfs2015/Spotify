package com.spotify.music.features.album.datasource;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.AlbumOfflineState;
import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineAlbum;

final class AutoValue_AlbumOfflineStateProvider_AlbumOfflineState extends AlbumOfflineState {
    private final OfflineAlbum album;

    AutoValue_AlbumOfflineStateProvider_AlbumOfflineState(OfflineAlbum offlineAlbum) {
        if (offlineAlbum != null) {
            this.album = offlineAlbum;
            return;
        }
        throw new NullPointerException("Null album");
    }

    public final OfflineAlbum getAlbum() {
        return this.album;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumOfflineState{album=");
        sb.append(this.album);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumOfflineState)) {
            return false;
        }
        return this.album.equals(((AlbumOfflineState) obj).getAlbum());
    }

    public final int hashCode() {
        return this.album.hashCode() ^ 1000003;
    }
}
