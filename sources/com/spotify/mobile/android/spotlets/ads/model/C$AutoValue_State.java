package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_State reason: invalid class name */
abstract class C$AutoValue_State extends State {
    private final AdBreakState adBreakState;
    private final String adId;
    private final String adSlotId;
    private final boolean adsEnabled;
    private final String appStartupId;
    private final icb pendingAds;
    private final String streamTimeInMs;

    C$AutoValue_State(boolean z, String str, AdBreakState adBreakState2, String str2, String str3, icb icb, String str4) {
        this.adsEnabled = z;
        this.appStartupId = str;
        if (adBreakState2 != null) {
            this.adBreakState = adBreakState2;
            this.adSlotId = str2;
            this.adId = str3;
            this.pendingAds = icb;
            this.streamTimeInMs = str4;
            return;
        }
        throw new NullPointerException("Null adBreakState");
    }

    @JsonProperty("ad_enabled")
    public boolean isAdsEnabled() {
        return this.adsEnabled;
    }

    @JsonProperty("app_startup_id")
    public String getAppStartupId() {
        return this.appStartupId;
    }

    @JsonProperty("ad_break_state")
    public AdBreakState getAdBreakState() {
        return this.adBreakState;
    }

    @JsonProperty("slot_id")
    public String getAdSlotId() {
        return this.adSlotId;
    }

    @JsonProperty("ad_id")
    public String getAdId() {
        return this.adId;
    }

    @JsonProperty("pending_ads")
    public icb getPendingAds() {
        return this.pendingAds;
    }

    @JsonProperty("stream_time_in_ms")
    public String getStreamTimeInMs() {
        return this.streamTimeInMs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof State) {
            State state = (State) obj;
            if (this.adsEnabled == state.isAdsEnabled()) {
                String str = this.appStartupId;
                if (str != null ? str.equals(state.getAppStartupId()) : state.getAppStartupId() == null) {
                    if (this.adBreakState.equals(state.getAdBreakState())) {
                        String str2 = this.adSlotId;
                        if (str2 != null ? str2.equals(state.getAdSlotId()) : state.getAdSlotId() == null) {
                            String str3 = this.adId;
                            if (str3 != null ? str3.equals(state.getAdId()) : state.getAdId() == null) {
                                icb icb = this.pendingAds;
                                if (icb != null ? icb.equals(state.getPendingAds()) : state.getPendingAds() == null) {
                                    String str4 = this.streamTimeInMs;
                                    return str4 != null ? str4.equals(state.getStreamTimeInMs()) : state.getStreamTimeInMs() == null;
                                }
                            }
                        }
                    }
                }
            }
        }
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
        icb icb = this.pendingAds;
        int hashCode4 = (hashCode3 ^ (icb == null ? 0 : icb.hashCode())) * 1000003;
        String str4 = this.streamTimeInMs;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 ^ i2;
    }
}
