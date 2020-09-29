package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse.Body.Images.Image;

final class AutoValue_VoiceViewResponse_Body_Images_Image extends Image {
    private final String uri;

    AutoValue_VoiceViewResponse_Body_Images_Image(String str) {
        this.uri = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        String str = this.uri;
        String uri2 = image.uri();
        return str == null ? uri2 == null : str.equals(uri2);
    }

    public final int hashCode() {
        String str = this.uri;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image{uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }
}
