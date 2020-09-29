package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Artist reason: invalid class name */
abstract class C$AutoValue_Artist extends Artist {
    private final String getImageUri;
    private final Integer getMonthlyListener;
    private final String getName;
    private final String getUri;
    private final boolean hasAffinity;

    C$AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        if (str != null) {
            this.getUri = str;
            this.getName = str2;
            this.getImageUri = str3;
            this.hasAffinity = z;
            this.getMonthlyListener = num;
            return;
        }
        throw new NullPointerException("Null getUri");
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.getUri;
    }

    @JsonProperty("name")
    public String getName() {
        return this.getName;
    }

    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.getImageUri;
    }

    @JsonProperty("hasAffinity")
    public boolean hasAffinity() {
        return this.hasAffinity;
    }

    @JsonProperty("monthlyListeners")
    public Integer getMonthlyListener() {
        return this.getMonthlyListener;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Artist{getUri=");
        sb.append(this.getUri);
        sb.append(", getName=");
        sb.append(this.getName);
        sb.append(", getImageUri=");
        sb.append(this.getImageUri);
        sb.append(", hasAffinity=");
        sb.append(this.hasAffinity);
        sb.append(", getMonthlyListener=");
        sb.append(this.getMonthlyListener);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Artist) {
            Artist artist = (Artist) obj;
            if (this.getUri.equals(artist.getUri())) {
                String str = this.getName;
                if (str != null ? str.equals(artist.getName()) : artist.getName() == null) {
                    String str2 = this.getImageUri;
                    if (str2 != null ? str2.equals(artist.getImageUri()) : artist.getImageUri() == null) {
                        if (this.hasAffinity == artist.hasAffinity()) {
                            Integer num = this.getMonthlyListener;
                            return num != null ? num.equals(artist.getMonthlyListener()) : artist.getMonthlyListener() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.getUri.hashCode() ^ 1000003) * 1000003;
        String str = this.getName;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.getImageUri;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.hasAffinity ? 1231 : 1237)) * 1000003;
        Integer num = this.getMonthlyListener;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 ^ i;
    }
}
