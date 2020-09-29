package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_Artist reason: invalid class name */
abstract class C$AutoValue_Artist extends Artist {
    private final String imageUrl;
    private final String name;

    C$AutoValue_Artist(String str, String str2) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.imageUrl = str2;
                return;
            }
            throw new NullPointerException("Null imageUrl");
        }
        throw new NullPointerException("Null name");
    }

    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @JsonProperty("imageUrl")
    public String imageUrl() {
        return this.imageUrl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Artist{name=");
        sb.append(this.name);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Artist) {
            Artist artist = (Artist) obj;
            return this.name.equals(artist.name()) && this.imageUrl.equals(artist.imageUrl());
        }
    }

    public int hashCode() {
        return ((this.name.hashCode() ^ 1000003) * 1000003) ^ this.imageUrl.hashCode();
    }
}
