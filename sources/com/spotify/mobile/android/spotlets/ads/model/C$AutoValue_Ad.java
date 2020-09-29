package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_Ad reason: invalid class name */
abstract class C$AutoValue_Ad extends Ad {
    private final String adPlaybackId;
    private final int adType;
    private final String advertiser;
    private final String caption;
    private final String clickTrackingUrl;
    private final String clickUrl;
    private final CompanionAd companionAd;
    private final List<CompanionAd> companionAds;
    private final String creativeId;
    private final List<Display> displays;
    private final long duration;
    private final String id;
    private final List<Image> images;
    private final String lineItemId;
    private final Map<String, String> metadata;
    private final boolean nonExplicit;
    private final boolean skippable;
    private final boolean testAd;
    private final String title;
    private final String uri;
    private final List<Video> videos;

    C$AutoValue_Ad(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, int i, boolean z, boolean z2, Map<String, String> map, CompanionAd companionAd2, List<Video> list, List<Image> list2, List<Display> list3, List<CompanionAd> list4, String str8, String str9, String str10, boolean z3) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        Map<String, String> map2 = map;
        String str16 = str8;
        String str17 = str9;
        String str18 = str10;
        if (str11 != null) {
            this.id = str11;
            if (str12 != null) {
                this.uri = str12;
                if (str13 != null) {
                    this.advertiser = str13;
                    if (str14 != null) {
                        this.title = str14;
                        if (str15 != null) {
                            this.clickUrl = str15;
                            this.clickTrackingUrl = str6;
                            this.duration = j;
                            this.caption = str7;
                            this.adType = i;
                            this.testAd = z;
                            this.nonExplicit = z2;
                            if (map2 != null) {
                                this.metadata = map2;
                                this.companionAd = companionAd2;
                                this.videos = list;
                                this.images = list2;
                                this.displays = list3;
                                this.companionAds = list4;
                                if (str16 != null) {
                                    this.lineItemId = str16;
                                    if (str17 != null) {
                                        this.creativeId = str17;
                                        if (str18 != null) {
                                            this.adPlaybackId = str18;
                                            this.skippable = z3;
                                            return;
                                        }
                                        throw new NullPointerException("Null adPlaybackId");
                                    }
                                    throw new NullPointerException("Null creativeId");
                                }
                                throw new NullPointerException("Null lineItemId");
                            }
                            throw new NullPointerException("Null metadata");
                        }
                        throw new NullPointerException("Null clickUrl");
                    }
                    throw new NullPointerException("Null title");
                }
                throw new NullPointerException("Null advertiser");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null id");
    }

    @JsonProperty("id")
    public String id() {
        return this.id;
    }

    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    @JsonProperty("advertiser")
    public String advertiser() {
        return this.advertiser;
    }

    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    @JsonProperty("click_url")
    public String clickUrl() {
        return this.clickUrl;
    }

    @JsonProperty("click_tracking_url")
    public String clickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    @JsonProperty("duration")
    public long duration() {
        return this.duration;
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @JsonProperty("ad_type")
    public int adType() {
        return this.adType;
    }

    @JsonProperty("test_ad")
    public boolean testAd() {
        return this.testAd;
    }

    @JsonProperty("non_explicit")
    public boolean nonExplicit() {
        return this.nonExplicit;
    }

    @JsonProperty("metadata")
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @JsonProperty("companion_ad")
    public CompanionAd companionAd() {
        return this.companionAd;
    }

    @JsonProperty("videos")
    public List<Video> videos() {
        return this.videos;
    }

    @JsonProperty("images")
    public List<Image> images() {
        return this.images;
    }

    @JsonProperty("display")
    public List<Display> displays() {
        return this.displays;
    }

    @JsonProperty("companion_ads")
    public List<CompanionAd> companionAds() {
        return this.companionAds;
    }

    @JsonProperty("line_item_id")
    public String lineItemId() {
        return this.lineItemId;
    }

    @JsonProperty("creative_id")
    public String creativeId() {
        return this.creativeId;
    }

    @JsonProperty("ad_playback_id")
    public String adPlaybackId() {
        return this.adPlaybackId;
    }

    @JsonProperty("skippable")
    public boolean skippable() {
        return this.skippable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ad{id=");
        sb.append(this.id);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", advertiser=");
        sb.append(this.advertiser);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", clickUrl=");
        sb.append(this.clickUrl);
        sb.append(", clickTrackingUrl=");
        sb.append(this.clickTrackingUrl);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", adType=");
        sb.append(this.adType);
        sb.append(", testAd=");
        sb.append(this.testAd);
        sb.append(", nonExplicit=");
        sb.append(this.nonExplicit);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", companionAd=");
        sb.append(this.companionAd);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", displays=");
        sb.append(this.displays);
        sb.append(", companionAds=");
        sb.append(this.companionAds);
        sb.append(", lineItemId=");
        sb.append(this.lineItemId);
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", adPlaybackId=");
        sb.append(this.adPlaybackId);
        sb.append(", skippable=");
        sb.append(this.skippable);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ad) {
            Ad ad = (Ad) obj;
            if (this.id.equals(ad.id()) && this.uri.equals(ad.uri()) && this.advertiser.equals(ad.advertiser()) && this.title.equals(ad.title()) && this.clickUrl.equals(ad.clickUrl())) {
                String str = this.clickTrackingUrl;
                if (str != null ? str.equals(ad.clickTrackingUrl()) : ad.clickTrackingUrl() == null) {
                    if (this.duration == ad.duration()) {
                        String str2 = this.caption;
                        if (str2 != null ? str2.equals(ad.caption()) : ad.caption() == null) {
                            if (this.adType == ad.adType() && this.testAd == ad.testAd() && this.nonExplicit == ad.nonExplicit() && this.metadata.equals(ad.metadata())) {
                                CompanionAd companionAd2 = this.companionAd;
                                if (companionAd2 != null ? companionAd2.equals(ad.companionAd()) : ad.companionAd() == null) {
                                    List<Video> list = this.videos;
                                    if (list != null ? list.equals(ad.videos()) : ad.videos() == null) {
                                        List<Image> list2 = this.images;
                                        if (list2 != null ? list2.equals(ad.images()) : ad.images() == null) {
                                            List<Display> list3 = this.displays;
                                            if (list3 != null ? list3.equals(ad.displays()) : ad.displays() == null) {
                                                List<CompanionAd> list4 = this.companionAds;
                                                if (list4 != null ? list4.equals(ad.companionAds()) : ad.companionAds() == null) {
                                                    return this.lineItemId.equals(ad.lineItemId()) && this.creativeId.equals(ad.creativeId()) && this.adPlaybackId.equals(ad.adPlaybackId()) && this.skippable == ad.skippable();
                                                }
                                            }
                                        }
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
        int hashCode = (((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.advertiser.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        String str = this.clickTrackingUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.duration;
        int i2 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.caption;
        int i3 = 1231;
        int hashCode3 = (((((((((i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.adType) * 1000003) ^ (this.testAd ? 1231 : 1237)) * 1000003) ^ (this.nonExplicit ? 1231 : 1237)) * 1000003) ^ this.metadata.hashCode()) * 1000003;
        CompanionAd companionAd2 = this.companionAd;
        int hashCode4 = (hashCode3 ^ (companionAd2 == null ? 0 : companionAd2.hashCode())) * 1000003;
        List<Video> list = this.videos;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Image> list2 = this.images;
        int hashCode6 = (hashCode5 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<Display> list3 = this.displays;
        int hashCode7 = (hashCode6 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List<CompanionAd> list4 = this.companionAds;
        if (list4 != null) {
            i = list4.hashCode();
        }
        int hashCode8 = (((((((hashCode7 ^ i) * 1000003) ^ this.lineItemId.hashCode()) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.adPlaybackId.hashCode()) * 1000003;
        if (!this.skippable) {
            i3 = 1237;
        }
        return hashCode8 ^ i3;
    }
}
