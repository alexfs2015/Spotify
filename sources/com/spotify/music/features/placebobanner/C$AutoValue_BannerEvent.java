package com.spotify.music.features.placebobanner;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.placebobanner.$AutoValue_BannerEvent reason: invalid class name */
abstract class C$AutoValue_BannerEvent extends BannerEvent {
    private final String configurationId;
    private final String event;

    C$AutoValue_BannerEvent(String str, String str2) {
        if (str != null) {
            this.event = str;
            if (str2 != null) {
                this.configurationId = str2;
                return;
            }
            throw new NullPointerException("Null configurationId");
        }
        throw new NullPointerException("Null event");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("configurationId")
    public String configurationId() {
        return this.configurationId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerEvent) {
            BannerEvent bannerEvent = (BannerEvent) obj;
            return this.event.equals(bannerEvent.event()) && this.configurationId.equals(bannerEvent.configurationId());
        }
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("event")
    public String event() {
        return this.event;
    }

    public int hashCode() {
        return ((this.event.hashCode() ^ 1000003) * 1000003) ^ this.configurationId.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerEvent{event=");
        sb.append(this.event);
        sb.append(", configurationId=");
        sb.append(this.configurationId);
        sb.append("}");
        return sb.toString();
    }
}
