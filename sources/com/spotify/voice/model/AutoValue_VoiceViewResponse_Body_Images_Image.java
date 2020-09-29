package com.spotify.voice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.model.VoiceViewResponse.Body.Images.Image;

final class AutoValue_VoiceViewResponse_Body_Images_Image extends Image {
    private final String uri;

    AutoValue_VoiceViewResponse_Body_Images_Image(String str) {
        this.uri = str;
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image{uri=");
        sb.append(this.uri);
        sb.append("}");
        return sb.toString();
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
