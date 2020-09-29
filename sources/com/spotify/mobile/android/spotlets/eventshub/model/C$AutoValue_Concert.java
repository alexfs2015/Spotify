package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Concert reason: invalid class name */
abstract class C$AutoValue_Concert extends Concert {
    private final List<Artist> artists;
    private final String dateString;
    private final boolean festival;
    private final String id;
    private final String location;
    private final List<ConcertPartner> partnerConcerts;
    private final List<ConcertTicketing> ticketing;
    private final String title;
    private final String venue;

    C$AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3) {
        this.id = str;
        this.dateString = str2;
        this.title = str3;
        this.location = str4;
        this.venue = str5;
        if (list != null) {
            this.artists = list;
            this.festival = z;
            this.partnerConcerts = list2;
            this.ticketing = list3;
            return;
        }
        throw new NullPointerException("Null artists");
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonProperty("date")
    public String getDateString() {
        return this.dateString;
    }

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @JsonProperty("festival")
    public boolean isFestival() {
        return this.festival;
    }

    @JsonProperty("partnerConcerts")
    public List<ConcertPartner> getPartnerConcerts() {
        return this.partnerConcerts;
    }

    @JsonProperty("ticketing")
    public List<ConcertTicketing> getTicketing() {
        return this.ticketing;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Concert{id=");
        sb.append(this.id);
        sb.append(", dateString=");
        sb.append(this.dateString);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", venue=");
        sb.append(this.venue);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", festival=");
        sb.append(this.festival);
        sb.append(", partnerConcerts=");
        sb.append(this.partnerConcerts);
        sb.append(", ticketing=");
        sb.append(this.ticketing);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Concert) {
            Concert concert = (Concert) obj;
            String str = this.id;
            if (str != null ? str.equals(concert.getId()) : concert.getId() == null) {
                String str2 = this.dateString;
                if (str2 != null ? str2.equals(concert.getDateString()) : concert.getDateString() == null) {
                    String str3 = this.title;
                    if (str3 != null ? str3.equals(concert.getTitle()) : concert.getTitle() == null) {
                        String str4 = this.location;
                        if (str4 != null ? str4.equals(concert.getLocation()) : concert.getLocation() == null) {
                            String str5 = this.venue;
                            if (str5 != null ? str5.equals(concert.getVenue()) : concert.getVenue() == null) {
                                if (this.artists.equals(concert.getArtists()) && this.festival == concert.isFestival()) {
                                    List<ConcertPartner> list = this.partnerConcerts;
                                    if (list != null ? list.equals(concert.getPartnerConcerts()) : concert.getPartnerConcerts() == null) {
                                        List<ConcertTicketing> list2 = this.ticketing;
                                        return list2 != null ? list2.equals(concert.getTicketing()) : concert.getTicketing() == null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.dateString;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.title;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.location;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.venue;
        int hashCode5 = (((((hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.festival ? 1231 : 1237)) * 1000003;
        List<ConcertPartner> list = this.partnerConcerts;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<ConcertTicketing> list2 = this.ticketing;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 ^ i;
    }
}
