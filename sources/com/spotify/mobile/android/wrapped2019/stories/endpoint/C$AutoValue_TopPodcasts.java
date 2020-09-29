package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_TopPodcasts reason: invalid class name */
abstract class C$AutoValue_TopPodcasts extends TopPodcasts {
    private final String caption;
    private final String previewUrl;
    private final TopPodcastsStats stats;
    private final TopPodcastsTop top;

    C$AutoValue_TopPodcasts(String str, String str2, TopPodcastsTop topPodcastsTop, TopPodcastsStats topPodcastsStats) {
        if (str != null) {
            this.previewUrl = str;
            if (str2 != null) {
                this.caption = str2;
                if (topPodcastsTop != null) {
                    this.top = topPodcastsTop;
                    if (topPodcastsStats != null) {
                        this.stats = topPodcastsStats;
                        return;
                    }
                    throw new NullPointerException("Null stats");
                }
                throw new NullPointerException("Null top");
            }
            throw new NullPointerException("Null caption");
        }
        throw new NullPointerException("Null previewUrl");
    }

    @JsonProperty("previewUrl")
    public String previewUrl() {
        return this.previewUrl;
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @JsonProperty("top")
    public TopPodcastsTop top() {
        return this.top;
    }

    @JsonProperty("stats")
    public TopPodcastsStats stats() {
        return this.stats;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopPodcasts{previewUrl=");
        sb.append(this.previewUrl);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", stats=");
        sb.append(this.stats);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopPodcasts) {
            TopPodcasts topPodcasts = (TopPodcasts) obj;
            return this.previewUrl.equals(topPodcasts.previewUrl()) && this.caption.equals(topPodcasts.caption()) && this.top.equals(topPodcasts.top()) && this.stats.equals(topPodcasts.stats());
        }
    }

    public int hashCode() {
        return ((((((this.previewUrl.hashCode() ^ 1000003) * 1000003) ^ this.caption.hashCode()) * 1000003) ^ this.top.hashCode()) * 1000003) ^ this.stats.hashCode();
    }
}
