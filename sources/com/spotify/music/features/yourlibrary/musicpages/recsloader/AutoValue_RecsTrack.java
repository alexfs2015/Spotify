package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_RecsTrack extends RecsTrack {
    private final RecsItem album;
    private final List<RecsItem> artists;
    private final boolean explicit;
    private final String name;
    private final String previewId;
    private final String uri;

    AutoValue_RecsTrack(String str, String str2, String str3, RecsItem recsItem, List<RecsItem> list, boolean z) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (str3 != null) {
                    this.previewId = str3;
                    this.album = recsItem;
                    if (list != null) {
                        this.artists = list;
                        this.explicit = z;
                        return;
                    }
                    throw new NullPointerException("Null artists");
                }
                throw new NullPointerException("Null previewId");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @JsonProperty("album")
    public final RecsItem album() {
        return this.album;
    }

    @JsonProperty("artists")
    public final List<RecsItem> artists() {
        return this.artists;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecsTrack) {
            RecsTrack recsTrack = (RecsTrack) obj;
            if (this.uri.equals(recsTrack.uri()) && this.name.equals(recsTrack.name()) && this.previewId.equals(recsTrack.previewId())) {
                RecsItem recsItem = this.album;
                if (recsItem != null ? recsItem.equals(recsTrack.album()) : recsTrack.album() == null) {
                    return this.artists.equals(recsTrack.artists()) && this.explicit == recsTrack.explicit();
                }
            }
        }
    }

    @JsonProperty("explicit")
    public final boolean explicit() {
        return this.explicit;
    }

    public final int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.previewId.hashCode()) * 1000003;
        RecsItem recsItem = this.album;
        return ((((hashCode ^ (recsItem == null ? 0 : recsItem.hashCode())) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.explicit ? 1231 : 1237);
    }

    @JsonProperty("name")
    public final String name() {
        return this.name;
    }

    @JsonProperty("preview_id")
    public final String previewId() {
        return this.previewId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecsTrack{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", previewId=");
        sb.append(this.previewId);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", explicit=");
        sb.append(this.explicit);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }
}
