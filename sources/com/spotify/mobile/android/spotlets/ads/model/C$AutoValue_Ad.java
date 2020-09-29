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

    @JsonProperty("ad_playback_id")
    public String adPlaybackId() {
        return this.adPlaybackId;
    }

    @JsonProperty("ad_type")
    public int adType() {
        return this.adType;
    }

    @JsonProperty("advertiser")
    public String advertiser() {
        return this.advertiser;
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @JsonProperty("click_tracking_url")
    public String clickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    @JsonProperty("click_url")
    public String clickUrl() {
        return this.clickUrl;
    }

    @JsonProperty("companion_ad")
    public CompanionAd companionAd() {
        return this.companionAd;
    }

    @JsonProperty("companion_ads")
    public List<CompanionAd> companionAds() {
        return this.companionAds;
    }

    @JsonProperty("creative_id")
    public String creativeId() {
        return this.creativeId;
    }

    @JsonProperty("display")
    public List<Display> displays() {
        return this.displays;
    }

    @JsonProperty("duration")
    public long duration() {
        return this.duration;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1.equals(r9.clickTrackingUrl()) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r1.equals(r9.caption()) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
        if (r1.equals(r9.companionAd()) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        if (r1.equals(r9.videos()) != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        if (r1.equals(r9.images()) != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0139, code lost:
        if (r1.equals(r9.displays()) != false) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 4
            r0 = 1
            r7 = 0
            if (r9 != r8) goto L_0x0007
            r7 = 0
            return r0
        L_0x0007:
            r7 = 4
            boolean r1 = r9 instanceof com.spotify.mobile.android.spotlets.ads.model.Ad
            r7 = 5
            r2 = 0
            r7 = 2
            if (r1 == 0) goto L_0x018b
            r7 = 0
            com.spotify.mobile.android.spotlets.ads.model.Ad r9 = (com.spotify.mobile.android.spotlets.ads.model.Ad) r9
            r7 = 4
            java.lang.String r1 = r8.id
            java.lang.String r3 = r9.id()
            r7 = 2
            boolean r1 = r1.equals(r3)
            r7 = 5
            if (r1 == 0) goto L_0x018b
            java.lang.String r1 = r8.uri
            r7 = 6
            java.lang.String r3 = r9.uri()
            r7 = 1
            boolean r1 = r1.equals(r3)
            r7 = 7
            if (r1 == 0) goto L_0x018b
            r7 = 2
            java.lang.String r1 = r8.advertiser
            r7 = 5
            java.lang.String r3 = r9.advertiser()
            r7 = 3
            boolean r1 = r1.equals(r3)
            r7 = 2
            if (r1 == 0) goto L_0x018b
            r7 = 0
            java.lang.String r1 = r8.title
            r7 = 4
            java.lang.String r3 = r9.title()
            r7 = 0
            boolean r1 = r1.equals(r3)
            r7 = 1
            if (r1 == 0) goto L_0x018b
            r7 = 1
            java.lang.String r1 = r8.clickUrl
            java.lang.String r3 = r9.clickUrl()
            r7 = 1
            boolean r1 = r1.equals(r3)
            r7 = 3
            if (r1 == 0) goto L_0x018b
            r7 = 4
            java.lang.String r1 = r8.clickTrackingUrl
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = r9.clickTrackingUrl()
            r7 = 7
            if (r1 != 0) goto L_0x018b
            r7 = 7
            goto L_0x007a
        L_0x006d:
            r7 = 6
            java.lang.String r3 = r9.clickTrackingUrl()
            r7 = 5
            boolean r1 = r1.equals(r3)
            r7 = 3
            if (r1 == 0) goto L_0x018b
        L_0x007a:
            r7 = 7
            long r3 = r8.duration
            r7 = 6
            long r5 = r9.duration()
            r7 = 6
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 5
            if (r1 != 0) goto L_0x018b
            java.lang.String r1 = r8.caption
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = r9.caption()
            r7 = 7
            if (r1 != 0) goto L_0x018b
            r7 = 3
            goto L_0x00a1
        L_0x0095:
            r7 = 2
            java.lang.String r3 = r9.caption()
            boolean r1 = r1.equals(r3)
            r7 = 1
            if (r1 == 0) goto L_0x018b
        L_0x00a1:
            r7 = 5
            int r1 = r8.adType
            int r3 = r9.adType()
            r7 = 5
            if (r1 != r3) goto L_0x018b
            boolean r1 = r8.testAd
            r7 = 3
            boolean r3 = r9.testAd()
            r7 = 3
            if (r1 != r3) goto L_0x018b
            boolean r1 = r8.nonExplicit
            r7 = 6
            boolean r3 = r9.nonExplicit()
            if (r1 != r3) goto L_0x018b
            r7 = 2
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.metadata
            java.util.Map r3 = r9.metadata()
            r7 = 2
            boolean r1 = r1.equals(r3)
            r7 = 6
            if (r1 == 0) goto L_0x018b
            r7 = 7
            com.spotify.mobile.android.spotlets.ads.model.CompanionAd r1 = r8.companionAd
            if (r1 != 0) goto L_0x00dc
            r7 = 1
            com.spotify.mobile.android.spotlets.ads.model.CompanionAd r1 = r9.companionAd()
            r7 = 2
            if (r1 != 0) goto L_0x018b
            r7 = 4
            goto L_0x00e9
        L_0x00dc:
            r7 = 4
            com.spotify.mobile.android.spotlets.ads.model.CompanionAd r3 = r9.companionAd()
            r7 = 5
            boolean r1 = r1.equals(r3)
            r7 = 7
            if (r1 == 0) goto L_0x018b
        L_0x00e9:
            r7 = 3
            java.util.List<com.spotify.mobile.android.spotlets.ads.model.Video> r1 = r8.videos
            if (r1 != 0) goto L_0x00f7
            r7 = 6
            java.util.List r1 = r9.videos()
            if (r1 != 0) goto L_0x018b
            r7 = 1
            goto L_0x0103
        L_0x00f7:
            r7 = 1
            java.util.List r3 = r9.videos()
            r7 = 5
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x018b
        L_0x0103:
            r7 = 2
            java.util.List<com.spotify.mobile.android.spotlets.ads.model.Image> r1 = r8.images
            r7 = 3
            if (r1 != 0) goto L_0x0113
            r7 = 5
            java.util.List r1 = r9.images()
            r7 = 5
            if (r1 != 0) goto L_0x018b
            r7 = 6
            goto L_0x011f
        L_0x0113:
            java.util.List r3 = r9.images()
            r7 = 1
            boolean r1 = r1.equals(r3)
            r7 = 3
            if (r1 == 0) goto L_0x018b
        L_0x011f:
            r7 = 7
            java.util.List<com.spotify.mobile.android.spotlets.ads.model.Display> r1 = r8.displays
            if (r1 != 0) goto L_0x012e
            r7 = 5
            java.util.List r1 = r9.displays()
            r7 = 2
            if (r1 != 0) goto L_0x018b
            r7 = 3
            goto L_0x013b
        L_0x012e:
            r7 = 0
            java.util.List r3 = r9.displays()
            r7 = 0
            boolean r1 = r1.equals(r3)
            r7 = 5
            if (r1 == 0) goto L_0x018b
        L_0x013b:
            r7 = 0
            java.util.List<com.spotify.mobile.android.spotlets.ads.model.CompanionAd> r1 = r8.companionAds
            r7 = 2
            if (r1 != 0) goto L_0x0149
            java.util.List r1 = r9.companionAds()
            r7 = 5
            if (r1 != 0) goto L_0x018b
            goto L_0x0154
        L_0x0149:
            java.util.List r3 = r9.companionAds()
            r7 = 5
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x018b
        L_0x0154:
            java.lang.String r1 = r8.lineItemId
            java.lang.String r3 = r9.lineItemId()
            r7 = 5
            boolean r1 = r1.equals(r3)
            r7 = 1
            if (r1 == 0) goto L_0x018b
            java.lang.String r1 = r8.creativeId
            java.lang.String r3 = r9.creativeId()
            boolean r1 = r1.equals(r3)
            r7 = 0
            if (r1 == 0) goto L_0x018b
            r7 = 6
            java.lang.String r1 = r8.adPlaybackId
            r7 = 1
            java.lang.String r3 = r9.adPlaybackId()
            r7 = 3
            boolean r1 = r1.equals(r3)
            r7 = 2
            if (r1 == 0) goto L_0x018b
            r7 = 1
            boolean r1 = r8.skippable
            r7 = 4
            boolean r9 = r9.skippable()
            r7 = 5
            if (r1 != r9) goto L_0x018b
            return r0
        L_0x018b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.ads.model.C$AutoValue_Ad.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.advertiser.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.clickUrl.hashCode()) * 1000003;
        String str = this.clickTrackingUrl;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.duration;
        int i3 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.caption;
        int i4 = 1231;
        int hashCode3 = (((((((((i3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.adType) * 1000003) ^ (this.testAd ? 1231 : 1237)) * 1000003) ^ (this.nonExplicit ? 1231 : 1237)) * 1000003) ^ this.metadata.hashCode()) * 1000003;
        CompanionAd companionAd2 = this.companionAd;
        int hashCode4 = (hashCode3 ^ (companionAd2 == null ? 0 : companionAd2.hashCode())) * 1000003;
        List<Video> list = this.videos;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Image> list2 = this.images;
        int hashCode6 = (hashCode5 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<Display> list3 = this.displays;
        if (list3 == null) {
            i = 0;
            int i5 = 7 >> 0;
        } else {
            i = list3.hashCode();
        }
        int i6 = (hashCode6 ^ i) * 1000003;
        List<CompanionAd> list4 = this.companionAds;
        if (list4 != null) {
            i2 = list4.hashCode();
        }
        int hashCode7 = (((((((i6 ^ i2) * 1000003) ^ this.lineItemId.hashCode()) * 1000003) ^ this.creativeId.hashCode()) * 1000003) ^ this.adPlaybackId.hashCode()) * 1000003;
        if (!this.skippable) {
            i4 = 1237;
        }
        return hashCode7 ^ i4;
    }

    @JsonProperty("id")
    public String id() {
        return this.id;
    }

    @JsonProperty("images")
    public List<Image> images() {
        return this.images;
    }

    @JsonProperty("line_item_id")
    public String lineItemId() {
        return this.lineItemId;
    }

    @JsonProperty("metadata")
    public Map<String, String> metadata() {
        return this.metadata;
    }

    @JsonProperty("non_explicit")
    public boolean nonExplicit() {
        return this.nonExplicit;
    }

    @JsonProperty("skippable")
    public boolean skippable() {
        return this.skippable;
    }

    @JsonProperty("test_ad")
    public boolean testAd() {
        return this.testAd;
    }

    @JsonProperty("title")
    public String title() {
        return this.title;
    }

    public String toString() {
        String str = "ddsi{=";
        StringBuilder sb = new StringBuilder("Ad{id=");
        sb.append(this.id);
        String str2 = "i rm,=";
        sb.append(", uri=");
        sb.append(this.uri);
        String str3 = "e rao,=ditrse";
        sb.append(", advertiser=");
        sb.append(this.advertiser);
        sb.append(", title=");
        sb.append(this.title);
        String str4 = "rlU ibl=kcc";
        sb.append(", clickUrl=");
        sb.append(this.clickUrl);
        String str5 = "UklTc biic=cg,knrla";
        sb.append(", clickTrackingUrl=");
        sb.append(this.clickTrackingUrl);
        String str6 = "udnaot,t=i ";
        sb.append(", duration=");
        sb.append(this.duration);
        String str7 = "ca,=p itpo";
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", adType=");
        sb.append(this.adType);
        String str8 = "t=d, tetA";
        sb.append(", testAd=");
        sb.append(this.testAd);
        sb.append(", nonExplicit=");
        sb.append(this.nonExplicit);
        String str9 = "t,saeta=dam";
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", companionAd=");
        sb.append(this.companionAd);
        String str10 = "s=emvoid,";
        sb.append(", videos=");
        sb.append(this.videos);
        String str11 = "asm=oieg ";
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", displays=");
        sb.append(this.displays);
        String str12 = ", oaibnm=Apodsc";
        sb.append(", companionAds=");
        sb.append(this.companionAds);
        String str13 = " e=nIebIlm,ti";
        sb.append(", lineItemId=");
        sb.append(this.lineItemId);
        String str14 = "tre =evtci,aI";
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", adPlaybackId=");
        sb.append(this.adPlaybackId);
        String str15 = "lbespka,p= p";
        sb.append(", skippable=");
        sb.append(this.skippable);
        String str16 = "}";
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    @JsonProperty("videos")
    public List<Video> videos() {
        return this.videos;
    }
}
