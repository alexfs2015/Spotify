package com.spotify.podcastonboarding.api;

import com.spotify.podcastonboarding.api.TopicsApiResponse.a;
import java.util.List;

final class AutoValue_TopicsApiResponse extends TopicsApiResponse {
    private final List<a> sections;

    AutoValue_TopicsApiResponse(List<a> list) {
        if (list != null) {
            this.sections = list;
            return;
        }
        throw new NullPointerException("Null sections");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicsApiResponse)) {
            return false;
        }
        return this.sections.equals(((TopicsApiResponse) obj).sections());
    }

    public final int hashCode() {
        return this.sections.hashCode() ^ 1000003;
    }

    public final List<a> sections() {
        return this.sections;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicsApiResponse{sections=");
        sb.append(this.sections);
        sb.append("}");
        return sb.toString();
    }
}
