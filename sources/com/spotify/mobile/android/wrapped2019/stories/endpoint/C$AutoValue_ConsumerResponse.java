package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_ConsumerResponse reason: invalid class name */
abstract class C$AutoValue_ConsumerResponse extends ConsumerResponse {
    private final List<String> order;
    private final TopArtist topArtist;
    private final TopPodcasts topPodcasts;

    C$AutoValue_ConsumerResponse(List<String> list, TopArtist topArtist2, TopPodcasts topPodcasts2) {
        if (list != null) {
            this.order = list;
            this.topArtist = topArtist2;
            this.topPodcasts = topPodcasts2;
            return;
        }
        throw new NullPointerException("Null order");
    }

    @JsonProperty("order")
    public List<String> order() {
        return this.order;
    }

    @JsonProperty("topArtist")
    public TopArtist topArtist() {
        return this.topArtist;
    }

    @JsonProperty("podcasts")
    public TopPodcasts topPodcasts() {
        return this.topPodcasts;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConsumerResponse{order=");
        sb.append(this.order);
        sb.append(", topArtist=");
        sb.append(this.topArtist);
        sb.append(", topPodcasts=");
        sb.append(this.topPodcasts);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsumerResponse) {
            ConsumerResponse consumerResponse = (ConsumerResponse) obj;
            if (this.order.equals(consumerResponse.order())) {
                TopArtist topArtist2 = this.topArtist;
                if (topArtist2 != null ? topArtist2.equals(consumerResponse.topArtist()) : consumerResponse.topArtist() == null) {
                    TopPodcasts topPodcasts2 = this.topPodcasts;
                    return topPodcasts2 != null ? topPodcasts2.equals(consumerResponse.topPodcasts()) : consumerResponse.topPodcasts() == null;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.order.hashCode() ^ 1000003) * 1000003;
        TopArtist topArtist2 = this.topArtist;
        int i = 0;
        int hashCode2 = (hashCode ^ (topArtist2 == null ? 0 : topArtist2.hashCode())) * 1000003;
        TopPodcasts topPodcasts2 = this.topPodcasts;
        if (topPodcasts2 != null) {
            i = topPodcasts2.hashCode();
        }
        return hashCode2 ^ i;
    }
}
