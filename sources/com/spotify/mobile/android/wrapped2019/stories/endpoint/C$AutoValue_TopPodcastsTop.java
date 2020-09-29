package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_TopPodcastsTop reason: invalid class name */
abstract class C$AutoValue_TopPodcastsTop extends TopPodcastsTop {
    private final String caption;
    private final List<Podcast> podcasts;

    C$AutoValue_TopPodcastsTop(String str, List<Podcast> list) {
        if (str != null) {
            this.caption = str;
            if (list != null) {
                this.podcasts = list;
                return;
            }
            throw new NullPointerException("Null podcasts");
        }
        throw new NullPointerException("Null caption");
    }

    @JsonProperty("caption")
    public String caption() {
        return this.caption;
    }

    @JsonProperty("podcasts")
    public List<Podcast> podcasts() {
        return this.podcasts;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopPodcastsTop{caption=");
        sb.append(this.caption);
        sb.append(", podcasts=");
        sb.append(this.podcasts);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TopPodcastsTop) {
            TopPodcastsTop topPodcastsTop = (TopPodcastsTop) obj;
            return this.caption.equals(topPodcastsTop.caption()) && this.podcasts.equals(topPodcastsTop.podcasts());
        }
    }

    public int hashCode() {
        return ((this.caption.hashCode() ^ 1000003) * 1000003) ^ this.podcasts.hashCode();
    }
}
