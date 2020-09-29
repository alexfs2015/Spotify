package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.user.$AutoValue_TopArtistModel reason: invalid class name */
abstract class C$AutoValue_TopArtistModel extends TopArtistModel {
    private final int followersCount;
    private final String imageUrl;
    private final String name;
    private final String uri;

    C$AutoValue_TopArtistModel(String str, String str2, String str3, int i) {
        if (str != null) {
            this.name = str;
            this.imageUrl = str2;
            if (str3 != null) {
                this.uri = str3;
                this.followersCount = i;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null name");
    }

    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @JsonProperty("image_url")
    public String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    @JsonProperty("followers_count")
    public int followersCount() {
        return this.followersCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopArtistModel{name=");
        sb.append(this.name);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", followersCount=");
        sb.append(this.followersCount);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopArtistModel) {
            TopArtistModel topArtistModel = (TopArtistModel) obj;
            if (this.name.equals(topArtistModel.name())) {
                String str = this.imageUrl;
                if (str != null ? str.equals(topArtistModel.imageUrl()) : topArtistModel.imageUrl() == null) {
                    return this.uri.equals(topArtistModel.uri()) && this.followersCount == topArtistModel.followersCount();
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() ^ 1000003) * 1000003;
        String str = this.imageUrl;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.followersCount;
    }
}
