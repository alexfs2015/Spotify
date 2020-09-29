package com.spotify.music.features.quicksilver.qa;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.quicksilver.messages.models.BannerMessage;

/* renamed from: com.spotify.music.features.quicksilver.qa.$AutoValue_QuicksilverAdminBannerMessage reason: invalid class name */
abstract class C$AutoValue_QuicksilverAdminBannerMessage extends QuicksilverAdminBannerMessage {
    private final boolean active;
    private final BannerMessage content;
    private final int groupId;
    private final String id;
    private final String locales;
    private final int templateId;

    C$AutoValue_QuicksilverAdminBannerMessage(String str, boolean z, BannerMessage bannerMessage, int i, String str2, int i2) {
        if (str != null) {
            this.id = str;
            this.active = z;
            if (bannerMessage != null) {
                this.content = bannerMessage;
                this.groupId = i;
                if (str2 != null) {
                    this.locales = str2;
                    this.templateId = i2;
                    return;
                }
                throw new NullPointerException("Null locales");
            }
            throw new NullPointerException("Null content");
        }
        throw new NullPointerException("Null id");
    }

    @JsonProperty("active")
    public boolean active() {
        return this.active;
    }

    @JsonProperty("content")
    public BannerMessage content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuicksilverAdminBannerMessage) {
            QuicksilverAdminBannerMessage quicksilverAdminBannerMessage = (QuicksilverAdminBannerMessage) obj;
            return this.id.equals(quicksilverAdminBannerMessage.id()) && this.active == quicksilverAdminBannerMessage.active() && this.content.equals(quicksilverAdminBannerMessage.content()) && this.groupId == quicksilverAdminBannerMessage.groupId() && this.locales.equals(quicksilverAdminBannerMessage.locales()) && this.templateId == quicksilverAdminBannerMessage.templateId();
        }
    }

    @JsonProperty("group_id")
    public int groupId() {
        return this.groupId;
    }

    public int hashCode() {
        return ((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ (this.active ? 1231 : 1237)) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.groupId) * 1000003) ^ this.locales.hashCode()) * 1000003) ^ this.templateId;
    }

    @JsonProperty("id")
    public String id() {
        return this.id;
    }

    @JsonProperty("locale")
    public String locales() {
        return this.locales;
    }

    @JsonProperty("template_id")
    public int templateId() {
        return this.templateId;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QuicksilverAdminBannerMessage{id=");
        sb.append(this.id);
        sb.append(", active=");
        sb.append(this.active);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", locales=");
        sb.append(this.locales);
        sb.append(", templateId=");
        sb.append(this.templateId);
        sb.append("}");
        return sb.toString();
    }
}
