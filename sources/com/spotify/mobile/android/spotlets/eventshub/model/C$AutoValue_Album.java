package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Album reason: invalid class name */
abstract class C$AutoValue_Album extends Album {
    private final String artistName;
    private final String imageUri;
    private final String name;
    private final String uri;

    C$AutoValue_Album(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.uri = str;
            this.name = str2;
            this.imageUri = str3;
            this.artistName = str4;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.imageUri;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return this.artistName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Album{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        sb.append(", artistName=");
        sb.append(this.artistName);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Album) {
            Album album = (Album) obj;
            if (this.uri.equals(album.getUri())) {
                String str = this.name;
                if (str != null ? str.equals(album.getName()) : album.getName() == null) {
                    String str2 = this.imageUri;
                    if (str2 != null ? str2.equals(album.getImageUri()) : album.getImageUri() == null) {
                        String str3 = this.artistName;
                        return str3 != null ? str3.equals(album.getArtistName()) : album.getArtistName() == null;
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.uri.hashCode() ^ 1000003) * 1000003;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.imageUri;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.artistName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }
}
