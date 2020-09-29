package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_SponsorshipAdData extends SponsorshipAdData {
    private final String advertiserName;
    private final String clickThroughUrl;
    private final String clickTrackingUrl;
    private final String creativeId;
    private final String impression;
    private final String lineItemId;
    private final String logoUrl;
    private final String thirdPartyImpression;

    AutoValue_SponsorshipAdData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str != null) {
            this.thirdPartyImpression = str;
            if (str2 != null) {
                this.creativeId = str2;
                if (str3 != null) {
                    this.lineItemId = str3;
                    if (str4 != null) {
                        this.impression = str4;
                        if (str5 != null) {
                            this.logoUrl = str5;
                            if (str6 != null) {
                                this.clickThroughUrl = str6;
                                if (str7 != null) {
                                    this.clickTrackingUrl = str7;
                                    if (str8 != null) {
                                        this.advertiserName = str8;
                                        return;
                                    }
                                    throw new NullPointerException("Null advertiserName");
                                }
                                throw new NullPointerException("Null clickTrackingUrl");
                            }
                            throw new NullPointerException("Null clickThroughUrl");
                        }
                        throw new NullPointerException("Null logoUrl");
                    }
                    throw new NullPointerException("Null impression");
                }
                throw new NullPointerException("Null lineItemId");
            }
            throw new NullPointerException("Null creativeId");
        }
        throw new NullPointerException("Null thirdPartyImpression");
    }

    @JsonProperty("advertiserName")
    public final String advertiserName() {
        return this.advertiserName;
    }

    @JsonProperty("clickThrough")
    public final String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    @JsonProperty("clickTracking")
    public final String clickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    @JsonProperty("creativeId")
    public final String creativeId() {
        return this.creativeId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SponsorshipAdData) {
            SponsorshipAdData sponsorshipAdData = (SponsorshipAdData) obj;
            return this.thirdPartyImpression.equals(sponsorshipAdData.thirdPartyImpression()) && this.creativeId.equals(sponsorshipAdData.creativeId()) && this.lineItemId.equals(sponsorshipAdData.lineItemId()) && this.impression.equals(sponsorshipAdData.impression()) && this.logoUrl.equals(sponsorshipAdData.logoUrl()) && this.clickThroughUrl.equals(sponsorshipAdData.clickThroughUrl()) && this.clickTrackingUrl.equals(sponsorshipAdData.clickTrackingUrl()) && this.advertiserName.equals(sponsorshipAdData.advertiserName());
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.thirdPartyImpression.hashCode() ^ 1000003) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.lineItemId.hashCode()) * 1000003) ^ this.impression.hashCode()) * 1000003) ^ this.logoUrl.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.clickTrackingUrl.hashCode()) * 1000003) ^ this.advertiserName.hashCode();
    }

    @JsonProperty("impression")
    public final String impression() {
        return this.impression;
    }

    @JsonProperty("lineItemId")
    public final String lineItemId() {
        return this.lineItemId;
    }

    @JsonProperty("logoUrl")
    public final String logoUrl() {
        return this.logoUrl;
    }

    @JsonProperty("thirdPartyImpression")
    public final String thirdPartyImpression() {
        return this.thirdPartyImpression;
    }

    public final String toString() {
        String str = "dpsPSptytsD{eo=nAiroirhmsapInristosarad";
        StringBuilder sb = new StringBuilder("SponsorshipAdData{thirdPartyImpression=");
        sb.append(this.thirdPartyImpression);
        String str2 = "cavmd rt=eei,";
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        String str3 = "Itdnoel i,meI";
        sb.append(", lineItemId=");
        sb.append(this.lineItemId);
        String str4 = ",sriebom= ips";
        sb.append(", impression=");
        sb.append(this.impression);
        String str5 = "g,orUlb= l";
        sb.append(", logoUrl=");
        sb.append(this.logoUrl);
        sb.append(", clickThroughUrl=");
        sb.append(this.clickThroughUrl);
        sb.append(", clickTrackingUrl=");
        sb.append(this.clickTrackingUrl);
        String str6 = "v=t sdNte,rareiem";
        sb.append(", advertiserName=");
        sb.append(this.advertiserName);
        String str7 = "}";
        sb.append("}");
        return sb.toString();
    }
}
