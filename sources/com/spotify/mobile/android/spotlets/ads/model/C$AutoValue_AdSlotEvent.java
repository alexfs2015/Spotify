package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_AdSlotEvent reason: invalid class name */
abstract class C$AutoValue_AdSlotEvent extends AdSlotEvent {
    private final Ad ad;
    private final String eventString;
    private final String formatString;

    C$AutoValue_AdSlotEvent(String str, String str2, Ad ad2) {
        if (str != null) {
            this.eventString = str;
            if (str2 != null) {
                this.formatString = str2;
                if (ad2 != null) {
                    this.ad = ad2;
                    return;
                }
                throw new NullPointerException("Null ad");
            }
            throw new NullPointerException("Null formatString");
        }
        throw new NullPointerException("Null eventString");
    }

    @JsonProperty("event")
    public String getEventString() {
        return this.eventString;
    }

    @JsonProperty("format")
    public String getFormatString() {
        return this.formatString;
    }

    @JsonProperty("ad")
    public Ad getAd() {
        return this.ad;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdSlotEvent{eventString=");
        sb.append(this.eventString);
        sb.append(", formatString=");
        sb.append(this.formatString);
        sb.append(", ad=");
        sb.append(this.ad);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSlotEvent) {
            AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
            return this.eventString.equals(adSlotEvent.getEventString()) && this.formatString.equals(adSlotEvent.getFormatString()) && this.ad.equals(adSlotEvent.getAd());
        }
    }

    public int hashCode() {
        return ((((this.eventString.hashCode() ^ 1000003) * 1000003) ^ this.formatString.hashCode()) * 1000003) ^ this.ad.hashCode();
    }
}
