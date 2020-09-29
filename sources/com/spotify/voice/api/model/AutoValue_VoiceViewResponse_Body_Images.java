package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceViewResponse.Body.Images;
import com.spotify.voice.api.model.VoiceViewResponse.Body.Images.Image;

final class AutoValue_VoiceViewResponse_Body_Images extends Images {
    private final Image main;

    AutoValue_VoiceViewResponse_Body_Images(Image image) {
        this.main = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Images)) {
            return false;
        }
        Images images = (Images) obj;
        Image image = this.main;
        Image main2 = images.main();
        return image == null ? main2 == null : image.equals(main2);
    }

    public final int hashCode() {
        Image image = this.main;
        return (image == null ? 0 : image.hashCode()) ^ 1000003;
    }

    @JsonProperty("main")
    public final Image main() {
        return this.main;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Images{main=");
        sb.append(this.main);
        sb.append("}");
        return sb.toString();
    }
}
