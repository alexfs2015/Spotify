package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertTicketing reason: invalid class name */
abstract class C$AutoValue_ConcertTicketing extends ConcertTicketing {
    private final String maxPrice;
    private final String minPrice;

    C$AutoValue_ConcertTicketing(String str, String str2) {
        this.minPrice = str;
        this.maxPrice = str2;
    }

    @JsonProperty("minPrice")
    public String getMinPrice() {
        return this.minPrice;
    }

    @JsonProperty("maxPrice")
    public String getMaxPrice() {
        return this.maxPrice;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertTicketing{minPrice=");
        sb.append(this.minPrice);
        sb.append(", maxPrice=");
        sb.append(this.maxPrice);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConcertTicketing) {
            ConcertTicketing concertTicketing = (ConcertTicketing) obj;
            String str = this.minPrice;
            if (str != null ? str.equals(concertTicketing.getMinPrice()) : concertTicketing.getMinPrice() == null) {
                String str2 = this.maxPrice;
                return str2 != null ? str2.equals(concertTicketing.getMaxPrice()) : concertTicketing.getMaxPrice() == null;
            }
        }
    }

    public int hashCode() {
        String str = this.minPrice;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.maxPrice;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }
}
