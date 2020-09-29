package com.spotify.music.features.podcast.episode.datasource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_RxEpisodeDataLoader_EpisodeRequestModel extends EpisodeRequestModel {
    private final List<String> items;

    AutoValue_RxEpisodeDataLoader_EpisodeRequestModel(List<String> list) {
        if (list != null) {
            this.items = list;
            return;
        }
        throw new NullPointerException("Null items");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EpisodeRequestModel)) {
            return false;
        }
        return this.items.equals(((EpisodeRequestModel) obj).getItems());
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("items")
    public final List<String> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeRequestModel{items=");
        sb.append(this.items);
        sb.append("}");
        return sb.toString();
    }
}
