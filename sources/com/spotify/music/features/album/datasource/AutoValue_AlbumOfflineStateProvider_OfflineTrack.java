package com.spotify.music.features.album.datasource;

import com.spotify.music.features.album.datasource.AlbumOfflineStateProvider.OfflineTrack;

final class AutoValue_AlbumOfflineStateProvider_OfflineTrack extends OfflineTrack {
    private final vli offlineState;
    private final String uri;

    AutoValue_AlbumOfflineStateProvider_OfflineTrack(vli vli, String str) {
        if (vli != null) {
            this.offlineState = vli;
            if (str != null) {
                this.uri = str;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null offlineState");
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

    public final vli getOfflineState() {
        return this.offlineState;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int hashCode() {
        return ((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTrack{offlineState=");
        sb.append(this.offlineState);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }
}
