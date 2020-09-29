package com.spotify.music.libs.album.model;

import java.util.List;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumDisc reason: invalid class name */
abstract class C$AutoValue_AlbumDisc extends AlbumDisc {
    private final List<AlbumTrack> tracks;

    C$AutoValue_AlbumDisc(List<AlbumTrack> list) {
        if (list != null) {
            this.tracks = list;
            return;
        }
        throw new NullPointerException("Null tracks");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumDisc)) {
            return false;
        }
        return this.tracks.equals(((AlbumDisc) obj).getTracks());
    }

    public List<AlbumTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return this.tracks.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumDisc{tracks=");
        sb.append(this.tracks);
        sb.append("}");
        return sb.toString();
    }
}
