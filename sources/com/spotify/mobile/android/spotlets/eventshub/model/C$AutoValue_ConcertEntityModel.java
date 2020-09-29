package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertEntityModel reason: invalid class name */
abstract class C$AutoValue_ConcertEntityModel extends ConcertEntityModel {
    private final List<Album> albumsForConcert;
    private final List<Artist> artists;
    private final String color;
    private final ConcertResult concertResult;
    private final String ticketAvailability;
    private final List<ConcertResult> upcomingConcerts;
    private final String upcomingConcertsSource;
    private final String userLocation;

    C$AutoValue_ConcertEntityModel(ConcertResult concertResult2, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        if (concertResult2 != null) {
            this.concertResult = concertResult2;
            if (list != null) {
                this.artists = list;
                this.upcomingConcerts = list2;
                this.albumsForConcert = list3;
                this.userLocation = str;
                this.upcomingConcertsSource = str2;
                this.color = str3;
                this.ticketAvailability = str4;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResult");
    }

    @JsonProperty("concert")
    public ConcertResult getConcertResult() {
        return this.concertResult;
    }

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @JsonProperty("upcomingConcerts")
    public List<ConcertResult> getUpcomingConcerts() {
        return this.upcomingConcerts;
    }

    @JsonProperty("albums")
    public List<Album> getAlbumsForConcert() {
        return this.albumsForConcert;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    @JsonProperty("upcomingConcertsSource")
    public String getUpcomingConcertsSource() {
        return this.upcomingConcertsSource;
    }

    @JsonProperty("color")
    public String getColor() {
        return this.color;
    }

    @JsonProperty("ticketAvailability")
    public String getTicketAvailability() {
        return this.ticketAvailability;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertEntityModel{concertResult=");
        sb.append(this.concertResult);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", upcomingConcerts=");
        sb.append(this.upcomingConcerts);
        sb.append(", albumsForConcert=");
        sb.append(this.albumsForConcert);
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        sb.append(", upcomingConcertsSource=");
        sb.append(this.upcomingConcertsSource);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", ticketAvailability=");
        sb.append(this.ticketAvailability);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConcertEntityModel) {
            ConcertEntityModel concertEntityModel = (ConcertEntityModel) obj;
            if (this.concertResult.equals(concertEntityModel.getConcertResult()) && this.artists.equals(concertEntityModel.getArtists())) {
                List<ConcertResult> list = this.upcomingConcerts;
                if (list != null ? list.equals(concertEntityModel.getUpcomingConcerts()) : concertEntityModel.getUpcomingConcerts() == null) {
                    List<Album> list2 = this.albumsForConcert;
                    if (list2 != null ? list2.equals(concertEntityModel.getAlbumsForConcert()) : concertEntityModel.getAlbumsForConcert() == null) {
                        String str = this.userLocation;
                        if (str != null ? str.equals(concertEntityModel.getUserLocation()) : concertEntityModel.getUserLocation() == null) {
                            String str2 = this.upcomingConcertsSource;
                            if (str2 != null ? str2.equals(concertEntityModel.getUpcomingConcertsSource()) : concertEntityModel.getUpcomingConcertsSource() == null) {
                                String str3 = this.color;
                                if (str3 != null ? str3.equals(concertEntityModel.getColor()) : concertEntityModel.getColor() == null) {
                                    String str4 = this.ticketAvailability;
                                    return str4 != null ? str4.equals(concertEntityModel.getTicketAvailability()) : concertEntityModel.getTicketAvailability() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.concertResult.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        List<ConcertResult> list = this.upcomingConcerts;
        int i = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Album> list2 = this.albumsForConcert;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str = this.userLocation;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.upcomingConcertsSource;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.color;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.ticketAvailability;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 ^ i;
    }
}
