package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class State implements Parcelable, JacksonModel {
    @JsonProperty("ad_break_state")
    public abstract AdBreakState getAdBreakState();

    @JsonProperty("ad_id")
    public abstract String getAdId();

    @JsonProperty("slot_id")
    public abstract String getAdSlotId();

    @JsonProperty("app_startup_id")
    public abstract String getAppStartupId();

    @JsonProperty("pending_ads")
    public abstract icb getPendingAds();

    @JsonProperty("stream_time_in_ms")
    public abstract String getStreamTimeInMs();

    @JsonProperty("ad_enabled")
    public abstract boolean isAdsEnabled();

    @JsonCreator
    public static State create(@JsonProperty("ad_enabled") boolean z, @JsonProperty("app_startup_id") String str, @JsonProperty("ad_break_state") AdBreakState adBreakState, @JsonProperty("slot_id") String str2, @JsonProperty("ad_id") String str3, @JsonProperty("pending_ads") icb icb, @JsonProperty("stream_time_in_ms") String str4) {
        AutoValue_State autoValue_State = new AutoValue_State(z, str, adBreakState, str2, str3, icb, str4);
        return autoValue_State;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(300);
        sb.append("ad_enabled: ");
        sb.append(isAdsEnabled());
        sb.append(10);
        sb.append("app_startup_id: ");
        sb.append(getAppStartupId());
        sb.append(10);
        sb.append("ad_break_state: ");
        sb.append(getAdBreakState());
        sb.append(10);
        sb.append("slot_id: ");
        sb.append(getAdSlotId());
        sb.append(10);
        sb.append("ad_id: ");
        sb.append(getAdId());
        sb.append(10);
        sb.append("stream_time_in_ms: ");
        sb.append(getStreamTimeInMs());
        sb.append(10);
        sb.append("pending_ads: \n");
        sb.append(getPendingAds());
        return sb.toString();
    }
}
