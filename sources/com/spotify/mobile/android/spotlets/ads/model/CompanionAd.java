package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CompanionAd implements Parcelable, JacksonModel {

    public static final class a extends upv<CompanionAd> {
        public a() {
            super(AutoValue_CompanionAd.CREATOR);
        }
    }

    @JsonProperty("bitrate")
    public abstract int getBitrate();

    @JsonProperty("height")
    public abstract int getHeight();

    @JsonProperty("image_hex_id")
    public abstract String getImageHexId();

    @JsonProperty("mime_type")
    public abstract String getMimeType();

    @JsonProperty("url")
    public abstract String getUrl();

    @JsonProperty("width")
    public abstract int getWidth();

    @JsonProperty("has_display")
    public abstract boolean isHasDisplay();

    @JsonProperty("locked_ratio")
    public abstract boolean isLockedRatio();

    @JsonProperty("scalable")
    public abstract boolean isScalable();

    @JsonCreator
    public static CompanionAd create(@JsonProperty("mime_type") String str, @JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("scalable") boolean z, @JsonProperty("locked_ratio") boolean z2, @JsonProperty("has_display") boolean z3, @JsonProperty("bitrate") int i3, @JsonProperty("url") String str2, @JsonProperty("image_hex_id") String str3) {
        AutoValue_CompanionAd autoValue_CompanionAd = new AutoValue_CompanionAd(str3, str, i, i2, z, z2, z3, i3, str2);
        return autoValue_CompanionAd;
    }
}
