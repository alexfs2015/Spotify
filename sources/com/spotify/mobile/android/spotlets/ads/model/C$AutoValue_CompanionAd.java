package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_CompanionAd reason: invalid class name */
abstract class C$AutoValue_CompanionAd extends CompanionAd {
    private final int bitrate;
    private final boolean hasDisplay;
    private final int height;
    private final String imageHexId;
    private final boolean lockedRatio;
    private final String mimeType;
    private final boolean scalable;
    private final String url;
    private final int width;

    C$AutoValue_CompanionAd(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3) {
        this.imageHexId = str;
        this.mimeType = str2;
        this.width = i;
        this.height = i2;
        this.scalable = z;
        this.lockedRatio = z2;
        this.hasDisplay = z3;
        this.bitrate = i3;
        this.url = str3;
    }

    @JsonProperty("image_hex_id")
    public String getImageHexId() {
        return this.imageHexId;
    }

    @JsonProperty("mime_type")
    public String getMimeType() {
        return this.mimeType;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @JsonProperty("scalable")
    public boolean isScalable() {
        return this.scalable;
    }

    @JsonProperty("locked_ratio")
    public boolean isLockedRatio() {
        return this.lockedRatio;
    }

    @JsonProperty("has_display")
    public boolean isHasDisplay() {
        return this.hasDisplay;
    }

    @JsonProperty("bitrate")
    public int getBitrate() {
        return this.bitrate;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompanionAd{imageHexId=");
        sb.append(this.imageHexId);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", scalable=");
        sb.append(this.scalable);
        sb.append(", lockedRatio=");
        sb.append(this.lockedRatio);
        sb.append(", hasDisplay=");
        sb.append(this.hasDisplay);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", url=");
        sb.append(this.url);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionAd) {
            CompanionAd companionAd = (CompanionAd) obj;
            String str = this.imageHexId;
            if (str != null ? str.equals(companionAd.getImageHexId()) : companionAd.getImageHexId() == null) {
                String str2 = this.mimeType;
                if (str2 != null ? str2.equals(companionAd.getMimeType()) : companionAd.getMimeType() == null) {
                    if (this.width == companionAd.getWidth() && this.height == companionAd.getHeight() && this.scalable == companionAd.isScalable() && this.lockedRatio == companionAd.isLockedRatio() && this.hasDisplay == companionAd.isHasDisplay() && this.bitrate == companionAd.getBitrate()) {
                        String str3 = this.url;
                        return str3 != null ? str3.equals(companionAd.getUrl()) : companionAd.getUrl() == null;
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.imageHexId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mimeType;
        int i2 = 1231;
        int hashCode2 = (((((((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ (this.scalable ? 1231 : 1237)) * 1000003) ^ (this.lockedRatio ? 1231 : 1237)) * 1000003;
        if (!this.hasDisplay) {
            i2 = 1237;
        }
        int i3 = (((hashCode2 ^ i2) * 1000003) ^ this.bitrate) * 1000003;
        String str3 = this.url;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 ^ i;
    }
}
