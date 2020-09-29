package com.spotify.music.features.assistedcuration.loader;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseItem;
import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseTrack;
import java.util.List;

final class AutoValue_RecentlyPlayedTracksLoader_ResponseTrack extends ResponseTrack {
    private final ResponseItem album;
    private final List<ResponseItem> artists;
    private final boolean explicit;
    private final String image;
    private final String name;
    private final String previewId;
    private final String uri;

    AutoValue_RecentlyPlayedTracksLoader_ResponseTrack(String str, String str2, String str3, String str4, boolean z, ResponseItem responseItem, List<ResponseItem> list) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (str3 != null) {
                    this.image = str3;
                    if (str4 != null) {
                        this.previewId = str4;
                        this.explicit = z;
                        if (responseItem != null) {
                            this.album = responseItem;
                            if (list != null) {
                                this.artists = list;
                                return;
                            }
                            throw new NullPointerException("Null artists");
                        }
                        throw new NullPointerException("Null album");
                    }
                    throw new NullPointerException("Null previewId");
                }
                throw new NullPointerException("Null image");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public final boolean isExplicit() {
        return this.explicit;
    }

    public final ResponseItem getAlbum() {
        return this.album;
    }

    public final List<ResponseItem> getArtists() {
        return this.artists;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseTrack{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", previewId=");
        sb.append(this.previewId);
        sb.append(", explicit=");
        sb.append(this.explicit);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseTrack) {
            ResponseTrack responseTrack = (ResponseTrack) obj;
            return this.uri.equals(responseTrack.getUri()) && this.name.equals(responseTrack.getName()) && this.image.equals(responseTrack.getImage()) && this.previewId.equals(responseTrack.getPreviewId()) && this.explicit == responseTrack.isExplicit() && this.album.equals(responseTrack.getAlbum()) && this.artists.equals(responseTrack.getArtists());
        }
    }

    public final int hashCode() {
        return ((((((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.image.hashCode()) * 1000003) ^ this.previewId.hashCode()) * 1000003) ^ (this.explicit ? 1231 : 1237)) * 1000003) ^ this.album.hashCode()) * 1000003) ^ this.artists.hashCode();
    }
}
