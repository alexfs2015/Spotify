package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_RelatedArtistModel reason: invalid class name */
abstract class C$AutoValue_RelatedArtistModel extends RelatedArtistModel {
    private final String artistName;
    private final String artistUri;

    C$AutoValue_RelatedArtistModel(String str, String str2) {
        if (str != null) {
            this.artistName = str;
            if (str2 != null) {
                this.artistUri = str2;
                return;
            }
            throw new NullPointerException("Null artistUri");
        }
        throw new NullPointerException("Null artistName");
    }

    @JsonProperty
    public String artistName() {
        return this.artistName;
    }

    @JsonProperty
    public String artistUri() {
        return this.artistUri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RelatedArtistModel{artistName=");
        sb.append(this.artistName);
        sb.append(", artistUri=");
        sb.append(this.artistUri);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RelatedArtistModel) {
            RelatedArtistModel relatedArtistModel = (RelatedArtistModel) obj;
            return this.artistName.equals(relatedArtistModel.artistName()) && this.artistUri.equals(relatedArtistModel.artistUri());
        }
    }

    public int hashCode() {
        return ((this.artistName.hashCode() ^ 1000003) * 1000003) ^ this.artistUri.hashCode();
    }
}
