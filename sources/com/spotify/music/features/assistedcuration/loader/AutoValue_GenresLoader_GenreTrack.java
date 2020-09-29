package com.spotify.music.features.assistedcuration.loader;

import com.spotify.music.features.assistedcuration.loader.GenresLoader.GenreTrack;
import java.util.List;

final class AutoValue_GenresLoader_GenreTrack extends GenreTrack {
    private final String albumName;
    private final String artistName;
    private final List<String> artistNames;
    private final boolean banned;
    private final boolean explicit;
    private final boolean hearted;
    private final String imageUri;
    private final String name;
    private final String previewId;
    private final String uri;

    AutoValue_GenresLoader_GenreTrack(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, List<String> list, String str6) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (str3 != null) {
                    this.previewId = str3;
                    this.explicit = z;
                    this.hearted = z2;
                    this.banned = z3;
                    if (str4 != null) {
                        this.albumName = str4;
                        if (str5 != null) {
                            this.artistName = str5;
                            if (list != null) {
                                this.artistNames = list;
                                if (str6 != null) {
                                    this.imageUri = str6;
                                    return;
                                }
                                throw new NullPointerException("Null imageUri");
                            }
                            throw new NullPointerException("Null artistNames");
                        }
                        throw new NullPointerException("Null artistName");
                    }
                    throw new NullPointerException("Null albumName");
                }
                throw new NullPointerException("Null previewId");
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

    public final String getPreviewId() {
        return this.previewId;
    }

    public final boolean isExplicit() {
        return this.explicit;
    }

    public final boolean isHearted() {
        return this.hearted;
    }

    public final boolean isBanned() {
        return this.banned;
    }

    public final String getAlbumName() {
        return this.albumName;
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final List<String> getArtistNames() {
        return this.artistNames;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenreTrack{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", previewId=");
        sb.append(this.previewId);
        sb.append(", explicit=");
        sb.append(this.explicit);
        sb.append(", hearted=");
        sb.append(this.hearted);
        sb.append(", banned=");
        sb.append(this.banned);
        sb.append(", albumName=");
        sb.append(this.albumName);
        sb.append(", artistName=");
        sb.append(this.artistName);
        sb.append(", artistNames=");
        sb.append(this.artistNames);
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GenreTrack) {
            GenreTrack genreTrack = (GenreTrack) obj;
            return this.uri.equals(genreTrack.getUri()) && this.name.equals(genreTrack.getName()) && this.previewId.equals(genreTrack.getPreviewId()) && this.explicit == genreTrack.isExplicit() && this.hearted == genreTrack.isHearted() && this.banned == genreTrack.isBanned() && this.albumName.equals(genreTrack.getAlbumName()) && this.artistName.equals(genreTrack.getArtistName()) && this.artistNames.equals(genreTrack.getArtistNames()) && this.imageUri.equals(genreTrack.getImageUri());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.previewId.hashCode()) * 1000003) ^ (this.explicit ? 1231 : 1237)) * 1000003) ^ (this.hearted ? 1231 : 1237)) * 1000003;
        if (!this.banned) {
            i = 1237;
        }
        return ((((((((hashCode ^ i) * 1000003) ^ this.albumName.hashCode()) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.artistNames.hashCode()) * 1000003) ^ this.imageUri.hashCode();
    }
}
