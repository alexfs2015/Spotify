package com.spotify.music.libs.album.model;

import java.util.List;

/* renamed from: com.spotify.music.libs.album.model.$AutoValue_AlbumTrack reason: invalid class name */
abstract class C$AutoValue_AlbumTrack extends AlbumTrack {
    private final List<AlbumArtist> artists;
    private final int duration;
    private final boolean explicit;
    private final String name;
    private final vli offline;
    private final boolean playable;
    private final String uri;

    C$AutoValue_AlbumTrack(boolean z, boolean z2, int i, String str, String str2, List<AlbumArtist> list, vli vli) {
        this.playable = z;
        this.explicit = z2;
        this.duration = i;
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (list != null) {
                    this.artists = list;
                    if (vli != null) {
                        this.offline = vli;
                        return;
                    }
                    throw new NullPointerException("Null offline");
                }
                throw new NullPointerException("Null artists");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlbumTrack) {
            AlbumTrack albumTrack = (AlbumTrack) obj;
            return this.playable == albumTrack.isPlayable() && this.explicit == albumTrack.isExplicit() && this.duration == albumTrack.getDuration() && this.uri.equals(albumTrack.getUri()) && this.name.equals(albumTrack.getName()) && this.artists.equals(albumTrack.getArtists()) && this.offline.equals(albumTrack.getOffline());
        }
    }

    public List<AlbumArtist> getArtists() {
        return this.artists;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getName() {
        return this.name;
    }

    public vli getOffline() {
        return this.offline;
    }

    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.playable ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.explicit) {
            i = 1237;
        }
        return ((((((((((i2 ^ i) * 1000003) ^ this.duration) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ this.offline.hashCode();
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    public boolean isPlayable() {
        return this.playable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlbumTrack{playable=");
        sb.append(this.playable);
        sb.append(", explicit=");
        sb.append(this.explicit);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", offline=");
        sb.append(this.offline);
        sb.append("}");
        return sb.toString();
    }
}
