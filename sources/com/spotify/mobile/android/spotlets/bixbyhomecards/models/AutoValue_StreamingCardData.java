package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_StreamingCardData extends StreamingCardData {
    private final boolean isNextButtonDisabled;
    private final boolean isPaused;
    private final boolean isPlaying;
    private final boolean isPrevButtonDisabled;
    private final ContentItem listItem1;
    private final ContentItem listItem2;
    private final ContentItem mainContentItem;
    private final String trackUri;

    static final class Builder extends com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder {
        private Boolean isNextButtonDisabled;
        private Boolean isPaused;
        private Boolean isPlaying;
        private Boolean isPrevButtonDisabled;
        private ContentItem listItem1;
        private ContentItem listItem2;
        private ContentItem mainContentItem;
        private String trackUri;

        Builder() {
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder mainContentItem(ContentItem contentItem) {
            if (contentItem != null) {
                this.mainContentItem = contentItem;
                return this;
            }
            throw new NullPointerException("Null mainContentItem");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder listItem1(ContentItem contentItem) {
            if (contentItem != null) {
                this.listItem1 = contentItem;
                return this;
            }
            throw new NullPointerException("Null listItem1");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder listItem2(ContentItem contentItem) {
            if (contentItem != null) {
                this.listItem2 = contentItem;
                return this;
            }
            throw new NullPointerException("Null listItem2");
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder isPaused(boolean z) {
            this.isPaused = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder isPlaying(boolean z) {
            this.isPlaying = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder isPrevButtonDisabled(boolean z) {
            this.isPrevButtonDisabled = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder isNextButtonDisabled(boolean z) {
            this.isNextButtonDisabled = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData.Builder trackUri(String str) {
            this.trackUri = str;
            return this;
        }

        public final StreamingCardData build() {
            String str = "";
            if (this.mainContentItem == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" mainContentItem");
                str = sb.toString();
            }
            if (this.listItem1 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" listItem1");
                str = sb2.toString();
            }
            if (this.listItem2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" listItem2");
                str = sb3.toString();
            }
            if (this.isPaused == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isPaused");
                str = sb4.toString();
            }
            if (this.isPlaying == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isPlaying");
                str = sb5.toString();
            }
            if (this.isPrevButtonDisabled == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isPrevButtonDisabled");
                str = sb6.toString();
            }
            if (this.isNextButtonDisabled == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" isNextButtonDisabled");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                AutoValue_StreamingCardData autoValue_StreamingCardData = new AutoValue_StreamingCardData(this.mainContentItem, this.listItem1, this.listItem2, this.isPaused.booleanValue(), this.isPlaying.booleanValue(), this.isPrevButtonDisabled.booleanValue(), this.isNextButtonDisabled.booleanValue(), this.trackUri);
                return autoValue_StreamingCardData;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    private AutoValue_StreamingCardData(ContentItem contentItem, ContentItem contentItem2, ContentItem contentItem3, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.mainContentItem = contentItem;
        this.listItem1 = contentItem2;
        this.listItem2 = contentItem3;
        this.isPaused = z;
        this.isPlaying = z2;
        this.isPrevButtonDisabled = z3;
        this.isNextButtonDisabled = z4;
        this.trackUri = str;
    }

    @JsonProperty("main_content_item")
    public final ContentItem mainContentItem() {
        return this.mainContentItem;
    }

    @JsonProperty("list_item_1")
    public final ContentItem listItem1() {
        return this.listItem1;
    }

    @JsonProperty("list_item_2")
    public final ContentItem listItem2() {
        return this.listItem2;
    }

    @JsonProperty("paused")
    public final boolean isPaused() {
        return this.isPaused;
    }

    @JsonProperty("playing")
    public final boolean isPlaying() {
        return this.isPlaying;
    }

    @JsonProperty("prev_button_disabled")
    public final boolean isPrevButtonDisabled() {
        return this.isPrevButtonDisabled;
    }

    @JsonProperty("next_button_disabled")
    public final boolean isNextButtonDisabled() {
        return this.isNextButtonDisabled;
    }

    @JsonProperty("track_uri")
    public final String trackUri() {
        return this.trackUri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamingCardData{mainContentItem=");
        sb.append(this.mainContentItem);
        sb.append(", listItem1=");
        sb.append(this.listItem1);
        sb.append(", listItem2=");
        sb.append(this.listItem2);
        sb.append(", isPaused=");
        sb.append(this.isPaused);
        sb.append(", isPlaying=");
        sb.append(this.isPlaying);
        sb.append(", isPrevButtonDisabled=");
        sb.append(this.isPrevButtonDisabled);
        sb.append(", isNextButtonDisabled=");
        sb.append(this.isNextButtonDisabled);
        sb.append(", trackUri=");
        sb.append(this.trackUri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamingCardData) {
            StreamingCardData streamingCardData = (StreamingCardData) obj;
            if (this.mainContentItem.equals(streamingCardData.mainContentItem()) && this.listItem1.equals(streamingCardData.listItem1()) && this.listItem2.equals(streamingCardData.listItem2()) && this.isPaused == streamingCardData.isPaused() && this.isPlaying == streamingCardData.isPlaying() && this.isPrevButtonDisabled == streamingCardData.isPrevButtonDisabled() && this.isNextButtonDisabled == streamingCardData.isNextButtonDisabled()) {
                String str = this.trackUri;
                return str != null ? str.equals(streamingCardData.trackUri()) : streamingCardData.trackUri() == null;
            }
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.mainContentItem.hashCode() ^ 1000003) * 1000003) ^ this.listItem1.hashCode()) * 1000003) ^ this.listItem2.hashCode()) * 1000003) ^ (this.isPaused ? 1231 : 1237)) * 1000003) ^ (this.isPlaying ? 1231 : 1237)) * 1000003) ^ (this.isPrevButtonDisabled ? 1231 : 1237)) * 1000003;
        if (!this.isNextButtonDisabled) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.trackUri;
        return i2 ^ (str == null ? 0 : str.hashCode());
    }
}
