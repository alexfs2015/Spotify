package com.spotify.music.features.freetieralbum.offline;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.Track;

final class AutoValue_AlbumOfflineStateProvider_Track extends Track {
    private final String link;
    private final uzf offlineState;

    AutoValue_AlbumOfflineStateProvider_Track(uzf uzf, String str) {
        if (uzf != null) {
            this.offlineState = uzf;
            if (str != null) {
                this.link = str;
                return;
            }
            throw new NullPointerException("Null link");
        }
        throw new NullPointerException("Null offlineState");
    }

    public final uzf getOfflineState() {
        return this.offlineState;
    }

    public final String getLink() {
        return this.link;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{offlineState=");
        sb.append(this.offlineState);
        sb.append(", link=");
        sb.append(this.link);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Track) {
            Track track = (Track) obj;
            return this.offlineState.equals(track.getOfflineState()) && this.link.equals(track.getLink());
        }
    }

    public final int hashCode() {
        return ((this.offlineState.hashCode() ^ 1000003) * 1000003) ^ this.link.hashCode();
    }
}
