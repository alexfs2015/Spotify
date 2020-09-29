package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_Image reason: invalid class name */
abstract class C$AutoValue_Image extends Image {
    private final String url;

    C$AutoValue_Image(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        String str = this.url;
        String url2 = image.getUrl();
        return str == null ? url2 == null : str.equals(url2);
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        String str = "ers{aIgu=l";
        StringBuilder sb = new StringBuilder("Image{url=");
        sb.append(this.url);
        sb.append("}");
        return sb.toString();
    }
}
