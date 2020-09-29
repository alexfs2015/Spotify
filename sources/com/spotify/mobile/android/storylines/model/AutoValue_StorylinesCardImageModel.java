package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_StorylinesCardImageModel extends StorylinesCardImageModel {
    private final int height;
    private final String imageId;
    private final String type;
    private final String uri;
    private final int width;

    AutoValue_StorylinesCardImageModel(String str, String str2, int i, int i2, String str3) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.imageId = str2;
                this.width = i;
                this.height = i2;
                if (str3 != null) {
                    this.type = str3;
                    return;
                }
                throw new NullPointerException("Null type");
            }
            throw new NullPointerException("Null imageId");
        }
        throw new NullPointerException("Null uri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorylinesCardImageModel) {
            StorylinesCardImageModel storylinesCardImageModel = (StorylinesCardImageModel) obj;
            return this.uri.equals(storylinesCardImageModel.getUri()) && this.imageId.equals(storylinesCardImageModel.getImageId()) && this.width == storylinesCardImageModel.getWidth() && this.height == storylinesCardImageModel.getHeight() && this.type.equals(storylinesCardImageModel.getType());
        }
    }

    @JsonProperty("height")
    public final int getHeight() {
        return this.height;
    }

    @JsonProperty("imageId")
    public final String getImageId() {
        return this.imageId;
    }

    @JsonProperty("type")
    public final String getType() {
        return this.type;
    }

    @JsonProperty("uri")
    public final String getUri() {
        return this.uri;
    }

    @JsonProperty("width")
    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.imageId.hashCode()) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ this.type.hashCode();
    }

    public final String toString() {
        String str = "oesranmetMydsau{=orrSglCdeiil";
        StringBuilder sb = new StringBuilder("StorylinesCardImageModel{uri=");
        sb.append(this.uri);
        String str2 = "gamm,d=i I";
        sb.append(", imageId=");
        sb.append(this.imageId);
        String str3 = " d=wohti";
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", type=");
        sb.append(this.type);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}