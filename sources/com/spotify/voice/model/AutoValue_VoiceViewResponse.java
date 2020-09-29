package com.spotify.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.model.VoiceViewResponse.Body;
import com.spotify.voice.model.VoiceViewResponse.Custom;
import java.util.List;

final class AutoValue_VoiceViewResponse extends VoiceViewResponse {
    private final List<Body> body;
    private final Custom custom;

    AutoValue_VoiceViewResponse(Custom custom2, List<Body> list) {
        this.custom = custom2;
        this.body = list;
    }

    @JsonProperty("custom")
    public final Custom custom() {
        return this.custom;
    }

    @JsonProperty("body")
    public final List<Body> body() {
        return this.body;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoiceViewResponse{custom=");
        sb.append(this.custom);
        sb.append(", body=");
        sb.append(this.body);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceViewResponse) {
            VoiceViewResponse voiceViewResponse = (VoiceViewResponse) obj;
            Custom custom2 = this.custom;
            if (custom2 != null ? custom2.equals(voiceViewResponse.custom()) : voiceViewResponse.custom() == null) {
                List<Body> list = this.body;
                return list != null ? list.equals(voiceViewResponse.body()) : voiceViewResponse.body() == null;
            }
        }
    }

    public final int hashCode() {
        Custom custom2 = this.custom;
        int i = 0;
        int hashCode = ((custom2 == null ? 0 : custom2.hashCode()) ^ 1000003) * 1000003;
        List<Body> list = this.body;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode ^ i;
    }
}
