package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.share.$AutoValue_ShareMessaging reason: invalid class name */
abstract class C$AutoValue_ShareMessaging extends ShareMessaging {
    private final String freeText;
    private final List<QueryParameter> queryParameters;
    private final String shareUri;

    C$AutoValue_ShareMessaging(String str, List<QueryParameter> list, String str2) {
        if (str != null) {
            this.shareUri = str;
            if (list != null) {
                this.queryParameters = list;
                if (str2 != null) {
                    this.freeText = str2;
                    return;
                }
                throw new NullPointerException("Null freeText");
            }
            throw new NullPointerException("Null queryParameters");
        }
        throw new NullPointerException("Null shareUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShareMessaging) {
            ShareMessaging shareMessaging = (ShareMessaging) obj;
            if (this.shareUri.equals(shareMessaging.shareUri()) && this.queryParameters.equals(shareMessaging.queryParameters()) && this.freeText.equals(shareMessaging.freeText())) {
                return true;
            }
        }
        return false;
    }

    @JsonProperty("free_text")
    public String freeText() {
        return this.freeText;
    }

    public int hashCode() {
        return ((((this.shareUri.hashCode() ^ 1000003) * 1000003) ^ this.queryParameters.hashCode()) * 1000003) ^ this.freeText.hashCode();
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
        String str = "r{ssraiMSehnsUgaegaiserh";
        StringBuilder sb = new StringBuilder("ShareMessaging{shareUri=");
        sb.append(this.shareUri);
        String str2 = "ea=mrytsea,e rrmPu";
        sb.append(", queryParameters=");
        sb.append(this.queryParameters);
        String str3 = "e=r oeTx,ft";
        sb.append(", freeText=");
        sb.append(this.freeText);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
