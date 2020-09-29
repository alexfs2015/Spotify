package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.share.$AutoValue_ShareStories reason: invalid class name */
abstract class C$AutoValue_ShareStories extends ShareStories {
    private final String imageUrl;
    private final List<QueryParameter> queryParameters;
    private final String shareUri;

    C$AutoValue_ShareStories(String str, List<QueryParameter> list, String str2) {
        if (str != null) {
            this.shareUri = str;
            if (list != null) {
                this.queryParameters = list;
                if (str2 != null) {
                    this.imageUrl = str2;
                    return;
                }
                throw new NullPointerException("Null imageUrl");
            }
            throw new NullPointerException("Null queryParameters");
        }
        throw new NullPointerException("Null shareUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShareStories) {
            ShareStories shareStories = (ShareStories) obj;
            if (this.shareUri.equals(shareStories.shareUri()) && this.queryParameters.equals(shareStories.queryParameters()) && this.imageUrl.equals(shareStories.imageUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.shareUri.hashCode() ^ 1000003) * 1000003) ^ this.queryParameters.hashCode()) * 1000003) ^ this.imageUrl.hashCode();
    }

    @JsonProperty("image_url")
    public String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("query_parameters")
    public List<QueryParameter> queryParameters() {
        return this.queryParameters;
    }

    @JsonProperty("share_uri")
    public String shareUri() {
        return this.shareUri;
    }

    public String toString() {
        String str = "assSritra{reeU=Siohshr";
        StringBuilder sb = new StringBuilder("ShareStories{shareUri=");
        sb.append(this.shareUri);
        String str2 = "ueymre,q Patmresa=";
        sb.append(", queryParameters=");
        sb.append(this.queryParameters);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append("}");
        return sb.toString();
    }
}
