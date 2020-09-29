package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_TrackAnnotationAuthor extends TrackAnnotationAuthor {
    private final String avatarUrl;
    private final String displayName;
    private final String spotifyId;
    private final boolean verified;

    AutoValue_TrackAnnotationAuthor(boolean z, String str, String str2, String str3) {
        this.verified = z;
        this.spotifyId = str;
        this.displayName = str2;
        this.avatarUrl = str3;
    }

    @JsonProperty("verified")
    public final boolean isVerified() {
        return this.verified;
    }

    @JsonProperty("spotifyId")
    public final String getSpotifyId() {
        return this.spotifyId;
    }

    @JsonProperty("displayName")
    public final String getDisplayName() {
        return this.displayName;
    }

    @JsonProperty("avatarURL")
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackAnnotationAuthor{verified=");
        sb.append(this.verified);
        sb.append(", spotifyId=");
        sb.append(this.spotifyId);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackAnnotationAuthor) {
            TrackAnnotationAuthor trackAnnotationAuthor = (TrackAnnotationAuthor) obj;
            if (this.verified == trackAnnotationAuthor.isVerified()) {
                String str = this.spotifyId;
                if (str != null ? str.equals(trackAnnotationAuthor.getSpotifyId()) : trackAnnotationAuthor.getSpotifyId() == null) {
                    String str2 = this.displayName;
                    if (str2 != null ? str2.equals(trackAnnotationAuthor.getDisplayName()) : trackAnnotationAuthor.getDisplayName() == null) {
                        String str3 = this.avatarUrl;
                        return str3 != null ? str3.equals(trackAnnotationAuthor.getAvatarUrl()) : trackAnnotationAuthor.getAvatarUrl() == null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int i = ((this.verified ? 1231 : 1237) ^ 1000003) * 1000003;
        String str = this.spotifyId;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.displayName;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.avatarUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 ^ i2;
    }
}
