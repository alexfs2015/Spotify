package com.spotify.music.libs.album.model;

import java.util.List;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumRelated reason: invalid class name */
abstract class C$AutoValue_AlbumRelated extends AlbumRelated {
    private final List<AlbumRelease> releases;

    C$AutoValue_AlbumRelated(List<AlbumRelease> list) {
        if (list != null) {
            this.releases = list;
            return;
        }
        throw new NullPointerException("Null releases");
    }

    public List<AlbumRelease> getReleases() {
        return this.releases;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumRelated{releases=");
        sb.append(this.releases);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlbumRelated)) {
            return false;
        }
        return this.releases.equals(((AlbumRelated) obj).getReleases());
    }

    public int hashCode() {
        return this.releases.hashCode() ^ 1000003;
    }
}
