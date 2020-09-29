package com.spotify.music.features.album.datasource;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineTrack;

final class AutoValue_AlbumOfflineStateProvider_OfflineTrack extends OfflineTrack {
    private final uzf offlineState;
    private final String uri;

    AutoValue_AlbumOfflineStateProvider_OfflineTrack(uzf uzf, String str) {
        if (uzf != null) {
            this.offlineState = uzf;
            if (str != null) {
                this.uri = str;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null offlineState");
    }

    public final uzf getOfflineState() {
        return this.offlineState;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTrack{offlineState=");
        sb.append(this.offlineState);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineTrack) {
            OfflineTrack offlineTrack = (OfflineTrack) obj;
            return this.offlineState.equals(offlineTrack.getOfflineState()) && this.uri.equals(offlineTrack.getUri());
        }
    }

    public final int hashCode() {
        return ((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }
}
