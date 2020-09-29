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

    @JsonProperty("video_hex_id")
    public String getVideoHexId() {
        return this.videoHexId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Video{mimeType=");
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
        sb.append(", videoHexId=");
        sb.append(this.videoHexId);
        sb.append("}");
        return sb.toString();
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
                    return str2 != null ? str2.equals(video.getVideoHexId()) : video.getVideoHexId() == null;
                }
            }
        }
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
}
