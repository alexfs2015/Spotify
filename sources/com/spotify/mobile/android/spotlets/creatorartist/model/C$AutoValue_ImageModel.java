package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_ImageModel reason: invalid class name */
abstract class C$AutoValue_ImageModel extends ImageModel {
    private final int height;
    private final String moderationUri;
    private final String uri;
    private final int width;

    C$AutoValue_ImageModel(String str, int i, int i2, String str2) {
        if (str != null) {
            this.uri = str;
            this.width = i;
            this.height = i2;
            this.moderationUri = str2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @JsonProperty("moderationUri")
    public String getModerationUri() {
        return this.moderationUri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageModel{uri=");
        sb.append(this.uri);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", moderationUri=");
        sb.append(this.moderationUri);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageModel) {
            ImageModel imageModel = (ImageModel) obj;
            if (this.uri.equals(imageModel.getUri()) && this.width == imageModel.getWidth() && this.height == imageModel.getHeight()) {
                String str = this.moderationUri;
                return str != null ? str.equals(imageModel.getModerationUri()) : imageModel.getModerationUri() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003;
        String str = this.moderationUri;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
