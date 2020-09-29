package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_StorylinesCardContent extends StorylinesCardContent {
    private final String artistName;
    private final String artistUri;
    private final String avatarUri;
    private final String entityUri;
    private final List<StorylinesCardImageModel> images;
    private final String storylineGid;
    private final String targetUri;

    AutoValue_StorylinesCardContent(String str, String str2, String str3, String str4, String str5, String str6, List<StorylinesCardImageModel> list) {
        if (str != null) {
            this.storylineGid = str;
            if (str2 != null) {
                this.artistUri = str2;
                if (str3 != null) {
                    this.artistName = str3;
                    if (str4 != null) {
                        this.avatarUri = str4;
                        if (str5 != null) {
                            this.entityUri = str5;
                            if (str6 != null) {
                                this.targetUri = str6;
                                if (list != null) {
                                    this.images = list;
                                    return;
                                }
                                throw new NullPointerException("Null images");
                            }
                            throw new NullPointerException("Null targetUri");
                        }
                        throw new NullPointerException("Null entityUri");
                    }
                    throw new NullPointerException("Null avatarUri");
                }
                throw new NullPointerException("Null artistName");
            }
            throw new NullPointerException("Null artistUri");
        }
        throw new NullPointerException("Null storylineGid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorylinesCardContent) {
            StorylinesCardContent storylinesCardContent = (StorylinesCardContent) obj;
            if (this.storylineGid.equals(storylinesCardContent.getStorylineGid()) && this.artistUri.equals(storylinesCardContent.getArtistUri()) && this.artistName.equals(storylinesCardContent.getArtistName()) && this.avatarUri.equals(storylinesCardContent.getAvatarUri()) && this.entityUri.equals(storylinesCardContent.getEntityUri()) && this.targetUri.equals(storylinesCardContent.getTargetUri()) && this.images.equals(storylinesCardContent.getImages())) {
                return true;
            }
        }
        return false;
    }

    @JsonProperty("artistName")
    public final String getArtistName() {
        return this.artistName;
    }

    @JsonProperty("artistUri")
    public final String getArtistUri() {
        return this.artistUri;
    }

    @JsonProperty("avatarUri")
    public final String getAvatarUri() {
        return this.avatarUri;
    }

    @JsonProperty("entityUri")
    public final String getEntityUri() {
        return this.entityUri;
    }

    @JsonProperty("images")
    public final List<StorylinesCardImageModel> getImages() {
        return this.images;
    }

    @JsonProperty("storylineGid")
    public final String getStorylineGid() {
        return this.storylineGid;
    }

    @JsonProperty("targetUri")
    public final String getTargetUri() {
        return this.targetUri;
    }

    public final int hashCode() {
        return ((((((((((((this.storylineGid.hashCode() ^ 1000003) * 1000003) ^ this.artistUri.hashCode()) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.avatarUri.hashCode()) * 1000003) ^ this.entityUri.hashCode()) * 1000003) ^ this.targetUri.hashCode()) * 1000003) ^ this.images.hashCode();
    }

    public final String toString() {
        String str = "oCsriGSeytilneonett=droya{sslriCdnn";
        StringBuilder sb = new StringBuilder("StorylinesCardContent{storylineGid=");
        sb.append(this.storylineGid);
        String str2 = "= rmias,Urtt";
        sb.append(", artistUri=");
        sb.append(this.artistUri);
        String str3 = "t,eroasaNt=im";
        sb.append(", artistName=");
        sb.append(this.artistName);
        String str4 = "rtvarbaU ai=";
        sb.append(", avatarUri=");
        sb.append(this.avatarUri);
        sb.append(", entityUri=");
        sb.append(this.entityUri);
        String str5 = "=,ttaibUg er";
        sb.append(", targetUri=");
        sb.append(this.targetUri);
        String str6 = "mas g,=te";
        sb.append(", images=");
        sb.append(this.images);
        String str7 = "}";
        sb.append("}");
        return sb.toString();
    }
}
