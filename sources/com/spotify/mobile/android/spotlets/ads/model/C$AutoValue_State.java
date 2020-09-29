package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_State reason: invalid class name */
abstract class C$AutoValue_State extends State {
    private final AdBreakState adBreakState;
    private final String adId;
    private final String adSlotId;
    private final boolean adsEnabled;
    private final String appStartupId;
    private final ien pendingAds;
    private final String streamTimeInMs;

    C$AutoValue_State(boolean z, String str, AdBreakState adBreakState2, String str2, String str3, ien ien, String str4) {
        this.adsEnabled = z;
        this.appStartupId = str;
        if (adBreakState2 != null) {
            this.adBreakState = adBreakState2;
            this.adSlotId = str2;
            this.adId = str3;
            this.pendingAds = ien;
            this.streamTimeInMs = str4;
            return;
        }
        throw new NullPointerException("Null adBreakState");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r1.equals(r6.getPendingAds()) != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            r0 = 1
            r4 = 1
            if (r6 != r5) goto L_0x0006
            return r0
        L_0x0006:
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.ads.model.State
            r4 = 1
            r2 = 0
            if (r1 == 0) goto L_0x00ac
            r4 = 3
            com.spotify.mobile.android.spotlets.ads.model.State r6 = (com.spotify.mobile.android.spotlets.ads.model.State) r6
            r4 = 4
            boolean r1 = r5.adsEnabled
            r4 = 2
            boolean r3 = r6.isAdsEnabled()
            r4 = 7
            if (r1 != r3) goto L_0x00ac
            r4 = 7
            java.lang.String r1 = r5.appStartupId
            r4 = 2
            if (r1 != 0) goto L_0x0028
            r4 = 0
            java.lang.String r1 = r6.getAppStartupId()
            if (r1 != 0) goto L_0x00ac
            goto L_0x0035
        L_0x0028:
            r4 = 2
            java.lang.String r3 = r6.getAppStartupId()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x00ac
        L_0x0035:
            com.spotify.mobile.android.spotlets.ads.model.AdBreakState r1 = r5.adBreakState
            com.spotify.mobile.android.spotlets.ads.model.AdBreakState r3 = r6.getAdBreakState()
            r4 = 6
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00ac
            java.lang.String r1 = r5.adSlotId
            r4 = 6
            if (r1 != 0) goto L_0x0050
            r4 = 0
            java.lang.String r1 = r6.getAdSlotId()
            if (r1 != 0) goto L_0x00ac
            goto L_0x005c
        L_0x0050:
            java.lang.String r3 = r6.getAdSlotId()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x00ac
        L_0x005c:
            r4 = 4
            java.lang.String r1 = r5.adId
            if (r1 != 0) goto L_0x0069
            r4 = 0
            java.lang.String r1 = r6.getAdId()
            if (r1 != 0) goto L_0x00ac
            goto L_0x0074
        L_0x0069:
            r4 = 1
            java.lang.String r3 = r6.getAdId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ac
        L_0x0074:
            r4 = 5
            ien r1 = r5.pendingAds
            if (r1 != 0) goto L_0x0082
            r4 = 4
            ien r1 = r6.getPendingAds()
            if (r1 != 0) goto L_0x00ac
            r4 = 0
            goto L_0x008f
        L_0x0082:
            r4 = 2
            ien r3 = r6.getPendingAds()
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00ac
        L_0x008f:
            r4 = 7
            java.lang.String r1 = r5.streamTimeInMs
            r4 = 0
            if (r1 != 0) goto L_0x009e
            r4 = 0
            java.lang.String r6 = r6.getStreamTimeInMs()
            r4 = 7
            if (r6 != 0) goto L_0x00ac
            goto L_0x00ab
        L_0x009e:
            r4 = 3
            java.lang.String r6 = r6.getStreamTimeInMs()
            r4 = 5
            boolean r6 = r1.equals(r6)
            r4 = 4
            if (r6 == 0) goto L_0x00ac
        L_0x00ab:
            return r0
        L_0x00ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.ads.model.C$AutoValue_State.equals(java.lang.Object):boolean");
    }

    @JsonProperty("ad_break_state")
    public AdBreakState getAdBreakState() {
        return this.adBreakState;
    }

    @JsonProperty("ad_id")
    public String getAdId() {
        return this.adId;
    }

    @JsonProperty("slot_id")
    public String getAdSlotId() {
        return this.adSlotId;
    }

    @JsonProperty("app_startup_id")
    public String getAppStartupId() {
        return this.appStartupId;
    }

    @JsonProperty("pending_ads")
    public ien getPendingAds() {
        return this.pendingAds;
    }

    @JsonProperty("stream_time_in_ms")
    public String getStreamTimeInMs() {
        return this.streamTimeInMs;
    }

    public int hashCode() {
        int i = ((this.adsEnabled ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.appStartupId;
        int i2 = 0;
        int hashCode = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.adBreakState.hashCode()) * 1000003;
        String str2 = this.adSlotId;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.adId;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ien ien = this.pendingAds;
        int hashCode4 = (hashCode3 ^ (ien == null ? 0 : ien.hashCode())) * 1000003;
        String str4 = this.streamTimeInMs;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 ^ i2;
    }

    @JsonProperty("ad_enabled")
    public boolean isAdsEnabled() {
        return this.adsEnabled;
    }
}
