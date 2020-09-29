package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_Video reason: invalid class name */
abstract class C$AutoValue_Video extends Video {
    private final int bitrate;
    private final boolean hasDisplay;
    private final int height;
    private final boolean lockedRatio;
    private final String mimeType;
    private final boolean scalable;
    private final String url;
    private final String videoHexId;
    private final int width;

    C$AutoValue_Video(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str2, String str3) {
        if (str != null) {
            this.mimeType = str;
            this.width = i;
            this.height = i2;
            this.scalable = z;
            this.lockedRatio = z2;
            this.hasDisplay = z3;
            this.bitrate = i3;
            this.url = str2;
            this.videoHexId = str3;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Video) {
            Video video = (Video) obj;
            if (this.mimeType.equals(video.getMimeType()) && this.width == video.getWidth() && this.height == video.getHeight() && this.scalable == video.isScalable() && this.lockedRatio == video.isLockedRatio() && this.hasDisplay == video.isHasDisplay() && this.bitrate == video.getBitrate()) {
                String str = this.url;
                if (str != null ? str.equals(video.getUrl()) : video.getUrl() == null) {
                    String str2 = this.videoHexId;
                    if (str2 != null ? str2.equals(video.getVideoHexId()) : video.getVideoHexId() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @JsonProperty("bitrate")
    public int getBitrate() {
        return this.bitrate;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @JsonProperty("mime_type")
    public String getMimeType() {
        return this.mimeType;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonProperty("video_hex_id")
    public String getVideoHexId() {
        return this.videoHexId;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ (this.scalable ? 1231 : 1237)) * 1000003) ^ (this.lockedRatio ? 1231 : 1237)) * 1000003;
        if (!this.hasDisplay) {
            i = 1237;
        }
        int i2 = (((hashCode ^ i) * 1000003) ^ this.bitrate) * 1000003;
        String str = this.url;
        int i3 = 0;
        int hashCode2 = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.videoHexId;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 ^ i3;
    }

    @JsonProperty("has_display")
    public boolean isHasDisplay() {
        return this.hasDisplay;
    }

    @JsonProperty("locked_ratio")
    public boolean isLockedRatio() {
        return this.lockedRatio;
    }

    @JsonProperty("scalable")
    public boolean isScalable() {
        return this.scalable;
    }

    public String toString() {
        String str = "eismTdpmieV=ye{";
        StringBuilder sb = new StringBuilder("Video{mimeType=");
        sb.append(this.mimeType);
        String str2 = "d,hmiwt=";
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        String str3 = "ls=coeaab,l";
        sb.append(", scalable=");
        sb.append(this.scalable);
        sb.append(", lockedRatio=");
        sb.append(this.lockedRatio);
        String str4 = "ihps,b=laaD y";
        sb.append(", hasDisplay=");
        sb.append(this.hasDisplay);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        String str5 = "b url,";
        sb.append(", url=");
        sb.append(this.url);
        String str6 = "oid HeIt,edxv";
        sb.append(", videoHexId=");
        sb.append(this.videoHexId);
        sb.append("}");
        return sb.toString();
    }
}
