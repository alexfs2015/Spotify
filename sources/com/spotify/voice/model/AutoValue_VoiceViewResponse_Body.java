package com.spotify.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.model.VoiceViewResponse.Body;
import com.spotify.voice.model.VoiceViewResponse.Body.Images;
import com.spotify.voice.model.VoiceViewResponse.Body.Target;
import com.spotify.voice.model.VoiceViewResponse.Body.Text;

final class AutoValue_VoiceViewResponse_Body extends Body {
    private final Images images;
    private final Target target;
    private final Text text;

    AutoValue_VoiceViewResponse_Body(Text text2, Target target2, Images images2) {
        this.text = text2;
        this.target = target2;
        this.images = images2;
    }

    @JsonProperty("text")
    public final Text text() {
        return this.text;
    }

    @JsonProperty("target")
    public final Target target() {
        return this.target;
    }

    @JsonProperty("images")
    public final Images images() {
        return this.images;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Body{text=");
        sb.append(this.text);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", images=");
        sb.append(this.images);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Body) {
            Body body = (Body) obj;
            Text text2 = this.text;
            if (text2 != null ? text2.equals(body.text()) : body.text() == null) {
                Target target2 = this.target;
                if (target2 != null ? target2.equals(body.target()) : body.target() == null) {
                    Images images2 = this.images;
                    return images2 != null ? images2.equals(body.images()) : body.images() == null;
                }
            }
        }
    }

    public final int hashCode() {
        Text text2 = this.text;
        int i = 0;
        int hashCode = ((text2 == null ? 0 : text2.hashCode()) ^ 1000003) * 1000003;
        Target target2 = this.target;
        int hashCode2 = (hashCode ^ (target2 == null ? 0 : target2.hashCode())) * 1000003;
        Images images2 = this.images;
        if (images2 != null) {
            i = images2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
