package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_ContentItem extends ContentItem {
    private final String contentUri;
    private final String imageUrl;
    private final String intentDataUriString;
    private final String metadata1;
    private final String metadata2;
    private final String title;

    static final class Builder extends com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder {
        private String contentUri;
        private String imageUrl;
        private String intentDataUriString;
        private String metadata1;
        private String metadata2;
        private String title;

        Builder() {
        }

        public final ContentItem build() {
            String str = "";
            String str2 = "";
            if (this.contentUri == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String str3 = " osrnietUct";
                sb.append(" contentUri");
                str2 = sb.toString();
            }
            if (this.title == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                String str4 = "l tmit";
                sb2.append(" title");
                str2 = sb2.toString();
            }
            if (this.metadata1 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                String str5 = "et1aomatad";
                sb3.append(" metadata1");
                str2 = sb3.toString();
            }
            if (this.imageUrl == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                String str6 = "m argbleU";
                sb4.append(" imageUrl");
                str2 = sb4.toString();
            }
            if (this.intentDataUriString == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(" intentDataUriString");
                str2 = sb5.toString();
            }
            if (str2.isEmpty()) {
                AutoValue_ContentItem autoValue_ContentItem = new AutoValue_ContentItem(this.contentUri, this.title, this.metadata1, this.metadata2, this.imageUrl, this.intentDataUriString);
                return autoValue_ContentItem;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str2);
            throw new IllegalStateException(sb6.toString());
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder contentUri(String str) {
            if (str != null) {
                this.contentUri = str;
                return this;
            }
            throw new NullPointerException("Null contentUri");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder imageUrl(String str) {
            if (str != null) {
                this.imageUrl = str;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder intentDataUriString(String str) {
            if (str != null) {
                this.intentDataUriString = str;
                return this;
            }
            throw new NullPointerException("Null intentDataUriString");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder metadata1(String str) {
            if (str != null) {
                this.metadata1 = str;
                return this;
            }
            String str2 = "1aataebNdl mul";
            throw new NullPointerException("Null metadata1");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder metadata2(String str) {
            this.metadata2 = str;
            return this;
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem.Builder title(String str) {
            if (str != null) {
                this.title = str;
                return this;
            }
            String str2 = "lt eitltul";
            throw new NullPointerException("Null title");
        }
    }

    private AutoValue_ContentItem(String str, String str2, String str3, String str4, String str5, String str6) {
        this.contentUri = str;
        this.title = str2;
        this.metadata1 = str3;
        this.metadata2 = str4;
        this.imageUrl = str5;
        this.intentDataUriString = str6;
    }

    @JsonProperty("content_uri")
    public final String contentUri() {
        return this.contentUri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContentItem) {
            ContentItem contentItem = (ContentItem) obj;
            if (this.contentUri.equals(contentItem.contentUri()) && this.title.equals(contentItem.title()) && this.metadata1.equals(contentItem.metadata1())) {
                String str = this.metadata2;
                if (str != null ? str.equals(contentItem.metadata2()) : contentItem.metadata2() == null) {
                    if (this.imageUrl.equals(contentItem.imageUrl()) && this.intentDataUriString.equals(contentItem.intentDataUriString())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.contentUri.hashCode() ^ 1000003) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.metadata1.hashCode()) * 1000003;
        String str = this.metadata2;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.intentDataUriString.hashCode();
    }

    @JsonProperty("image_url")
    public final String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("intent_uri")
    public final String intentDataUriString() {
        return this.intentDataUriString;
    }

    @JsonProperty("metadata1")
    public final String metadata1() {
        return this.metadata1;
    }

    @JsonProperty("metadata2")
    public final String metadata2() {
        return this.metadata2;
    }

    @JsonProperty("title")
    public final String title() {
        return this.title;
    }

    public final String toString() {
        String str = "U=sm{IectnittCtnonetone";
        StringBuilder sb = new StringBuilder("ContentItem{contentUri=");
        sb.append(this.contentUri);
        sb.append(", title=");
        sb.append(this.title);
        String str2 = "aatm, dtm1ea";
        sb.append(", metadata1=");
        sb.append(this.metadata1);
        String str3 = ",am=otde2taa";
        sb.append(", metadata2=");
        sb.append(this.metadata2);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", intentDataUriString=");
        sb.append(this.intentDataUriString);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}