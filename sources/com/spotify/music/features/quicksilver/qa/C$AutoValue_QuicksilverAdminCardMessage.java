package com.spotify.music.features.quicksilver.qa;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverCardMessage;

/* renamed from: com.spotify.music.features.quicksilver.qa.$AutoValue_QuicksilverAdminCardMessage reason: invalid class name */
abstract class C$AutoValue_QuicksilverAdminCardMessage extends QuicksilverAdminCardMessage {
    private final boolean active;
    private final QuicksilverCardMessage content;
    private final int groupId;
    private final String id;
    private final String locales;
    private final int templateId;

    C$AutoValue_QuicksilverAdminCardMessage(String str, boolean z, QuicksilverCardMessage quicksilverCardMessage, int i, String str2, int i2) {
        if (str != null) {
            this.id = str;
            this.active = z;
            if (quicksilverCardMessage != null) {
                this.content = quicksilverCardMessage;
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
    public QuicksilverCardMessage content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuicksilverAdminCardMessage) {
            QuicksilverAdminCardMessage quicksilverAdminCardMessage = (QuicksilverAdminCardMessage) obj;
            return this.id.equals(quicksilverAdminCardMessage.id()) && this.active == quicksilverAdminCardMessage.active() && this.content.equals(quicksilverAdminCardMessage.content()) && this.groupId == quicksilverAdminCardMessage.groupId() && this.locales.equals(quicksilverAdminCardMessage.locales()) && this.templateId == quicksilverAdminCardMessage.templateId();
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
        StringBuilder sb = new StringBuilder("QuicksilverAdminCardMessage{id=");
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
