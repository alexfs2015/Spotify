package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse.Body.Text;

final class AutoValue_VoiceViewResponse_Body_Text extends Text {
    private final String subtitle;
    private final String title;

    AutoValue_VoiceViewResponse_Body_Text(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Text) {
            Text text = (Text) obj;
            String str = this.title;
            if (str != null ? str.equals(text.title()) : text.title() == null) {
                String str2 = this.subtitle;
                return str2 != null ? str2.equals(text.subtitle()) : text.subtitle() == null;
            }
        }
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.subtitle;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    @JsonProperty("subtitle")
    public final String subtitle() {
        return this.subtitle;
    }

    @JsonProperty("title")
    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text{title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append("}");
        return sb.toString();
    }
}
