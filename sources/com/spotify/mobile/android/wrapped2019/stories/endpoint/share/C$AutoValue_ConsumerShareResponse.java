package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.share.$AutoValue_ConsumerShareResponse reason: invalid class name */
abstract class C$AutoValue_ConsumerShareResponse extends ConsumerShareResponse {
    private final ShareMessaging messaging;
    private final String previewImageUrl;
    private final ShareStories stories;

    C$AutoValue_ConsumerShareResponse(ShareStories shareStories, ShareMessaging shareMessaging, String str) {
        if (shareStories != null) {
            this.stories = shareStories;
            if (shareMessaging != null) {
                this.messaging = shareMessaging;
                if (str != null) {
                    this.previewImageUrl = str;
                    return;
                }
                throw new NullPointerException("Null previewImageUrl");
            }
            throw new NullPointerException("Null messaging");
        }
        throw new NullPointerException("Null stories");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsumerShareResponse) {
            ConsumerShareResponse consumerShareResponse = (ConsumerShareResponse) obj;
            if (this.stories.equals(consumerShareResponse.stories()) && this.messaging.equals(consumerShareResponse.messaging()) && this.previewImageUrl.equals(consumerShareResponse.previewImageUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.stories.hashCode() ^ 1000003) * 1000003) ^ this.messaging.hashCode()) * 1000003) ^ this.previewImageUrl.hashCode();
    }

    @JsonProperty("messaging")
    public ShareMessaging messaging() {
        return this.messaging;
    }

    @JsonProperty("preview_image_url")
    public String previewImageUrl() {
        return this.previewImageUrl;
    }

    @JsonProperty("stories")
    public ShareStories stories() {
        return this.stories;
    }

    public String toString() {
        String str = "{isaonroemresCsethonrpueSseRs=";
        StringBuilder sb = new StringBuilder("ConsumerShareResponse{stories=");
        sb.append(this.stories);
        sb.append(", messaging=");
        sb.append(this.messaging);
        sb.append(", previewImageUrl=");
        sb.append(this.previewImageUrl);
        String str2 = "}";
        sb.append("}");
        return sb.toString();
    }
}
