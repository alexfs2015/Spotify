package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ArtistConcertsModel reason: invalid class name */
abstract class C$AutoValue_ArtistConcertsModel extends ArtistConcertsModel {
    private final Artist artist;
    private final List<ConcertResult> concerts;
    private final String userLocation;

    C$AutoValue_ArtistConcertsModel(Artist artist2, String str, List<ConcertResult> list) {
        if (artist2 != null) {
            this.artist = artist2;
            this.userLocation = str;
            if (list != null) {
                this.concerts = list;
                return;
            }
            throw new NullPointerException("Null concerts");
        }
        throw new NullPointerException("Null artist");
    }

    @JsonProperty("artist")
    public Artist getArtist() {
        return this.artist;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    @JsonProperty("concerts")
    public List<ConcertResult> getConcerts() {
        return this.concerts;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArtistConcertsModel{artist=");
        sb.append(this.artist);
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        sb.append(", concerts=");
        sb.append(this.concerts);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ArtistConcertsModel) {
            ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) obj;
            if (this.artist.equals(artistConcertsModel.getArtist())) {
                String str = this.userLocation;
                if (str != null ? str.equals(artistConcertsModel.getUserLocation()) : artistConcertsModel.getUserLocation() == null) {
                    if (this.concerts.equals(artistConcertsModel.getConcerts())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.artist.hashCode() ^ 1000003) * 1000003;
        String str = this.userLocation;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.concerts.hashCode();
    }
}
