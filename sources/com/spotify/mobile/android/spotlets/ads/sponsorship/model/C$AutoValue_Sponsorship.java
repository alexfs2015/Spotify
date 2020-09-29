package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.sponsorship.model.$AutoValue_Sponsorship reason: invalid class name */
abstract class C$AutoValue_Sponsorship extends Sponsorship {
    private final Long endTime;
    private final Long startTime;
    private final String uri;

    C$AutoValue_Sponsorship(Long l, Long l2, String str) {
        if (l != null) {
            this.startTime = l;
            if (l2 != null) {
                this.endTime = l2;
                if (str != null) {
                    this.uri = str;
                    return;
                }
                throw new NullPointerException("Null uri");
            }
            throw new NullPointerException("Null endTime");
        }
        throw new NullPointerException("Null startTime");
    }

    @JsonProperty("endTime")
    public Long endTime() {
        return this.endTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Sponsorship) {
            Sponsorship sponsorship = (Sponsorship) obj;
            return this.startTime.equals(sponsorship.startTime()) && this.endTime.equals(sponsorship.endTime()) && this.uri.equals(sponsorship.uri());
        }
    }

    public int hashCode() {
        return ((((this.startTime.hashCode() ^ 1000003) * 1000003) ^ this.endTime.hashCode()) * 1000003) ^ this.uri.hashCode();
    }

    @JsonProperty("startTime")
    public Long startTime() {
        return this.startTime;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Sponsorship{startTime=");
        sb.append(this.startTime);
        String str = "T=si,m nee";
        sb.append(", endTime=");
        sb.append(this.endTime);
        String str2 = ",rimu ";
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("spotifyUri")
    public String uri() {
        return this.uri;
    }
}
