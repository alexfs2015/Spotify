package com.spotify.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.model.VoiceViewResponse.Body.Target;

final class AutoValue_VoiceViewResponse_Body_Target extends Target {
    private final String uri;

    AutoValue_VoiceViewResponse_Body_Target(String str) {
        this.uri = str;
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Target{uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        String str = this.uri;
        String uri2 = target.uri();
        if (str == null) {
            return uri2 == null;
        }
        return str.equals(uri2);
    }

    public final int hashCode() {
        String str = this.uri;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }
}
