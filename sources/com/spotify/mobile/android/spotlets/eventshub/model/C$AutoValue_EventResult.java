package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_EventResult reason: invalid class name */
abstract class C$AutoValue_EventResult extends EventResult {
    private final List<String> artists;
    private final String closingDate;
    private final List<ConcertResult> concertResults;
    private final String location;
    private final String openingDate;
    private final String source;
    private final String venue;

    C$AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        if (list != null) {
            this.concertResults = list;
            if (list2 != null) {
                this.artists = list2;
                this.source = str;
                this.openingDate = str2;
                this.closingDate = str3;
                this.venue = str4;
                this.location = str5;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResults");
    }

    @JsonProperty("concerts")
    public List<ConcertResult> getConcertResults() {
        return this.concertResults;
    }

    @JsonProperty("artists")
    public List<String> getArtists() {
        return this.artists;
    }

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    @JsonProperty("openingDate")
    public String getOpeningDate() {
        return this.openingDate;
    }

    @JsonProperty("closingDate")
    public String getClosingDate() {
        return this.closingDate;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventResult{concertResults=");
        sb.append(this.concertResults);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", openingDate=");
        sb.append(this.openingDate);
        sb.append(", closingDate=");
        sb.append(this.closingDate);
        sb.append(", venue=");
        sb.append(this.venue);
        sb.append(", location=");
        sb.append(this.location);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventResult) {
            EventResult eventResult = (EventResult) obj;
            if (this.concertResults.equals(eventResult.getConcertResults()) && this.artists.equals(eventResult.getArtists())) {
                String str = this.source;
                if (str != null ? str.equals(eventResult.getSource()) : eventResult.getSource() == null) {
                    String str2 = this.openingDate;
                    if (str2 != null ? str2.equals(eventResult.getOpeningDate()) : eventResult.getOpeningDate() == null) {
                        String str3 = this.closingDate;
                        if (str3 != null ? str3.equals(eventResult.getClosingDate()) : eventResult.getClosingDate() == null) {
                            String str4 = this.venue;
                            if (str4 != null ? str4.equals(eventResult.getVenue()) : eventResult.getVenue() == null) {
                                String str5 = this.location;
                                return str5 != null ? str5.equals(eventResult.getLocation()) : eventResult.getLocation() == null;
                            }
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((this.concertResults.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        String str = this.source;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.openingDate;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.closingDate;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.venue;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.location;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }
}
