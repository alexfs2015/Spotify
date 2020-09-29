package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse.Custom.Restriction;

final class AutoValue_VoiceViewResponse_Custom_Restriction extends Restriction {
    private final String detail;
    private final String heading;

    AutoValue_VoiceViewResponse_Custom_Restriction(String str, String str2) {
        if (str != null) {
            this.heading = str;
            if (str2 != null) {
                this.detail = str2;
                return;
            }
            throw new NullPointerException("Null detail");
        }
        throw new NullPointerException("Null heading");
    }

    @JsonProperty("detail")
    public final String detail() {
        return this.detail;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Restriction) {
            Restriction restriction = (Restriction) obj;
            return this.heading.equals(restriction.heading()) && this.detail.equals(restriction.detail());
        }
    }

    public final int hashCode() {
        return ((this.heading.hashCode() ^ 1000003) * 1000003) ^ this.detail.hashCode();
    }

    @JsonProperty("heading")
    public final String heading() {
        return this.heading;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Restriction{heading=");
        sb.append(this.heading);
        sb.append(", detail=");
        sb.append(this.detail);
        sb.append("}");
        return sb.toString();
    }
}
