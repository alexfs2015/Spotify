package com.spotify.music.libs.search.history;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

final class AutoValue_SearchHistory extends SearchHistory {
    private static final long serialVersionUID = 6790688351676525479L;
    private final List<SearchHistoryItem> items;

    AutoValue_SearchHistory(List<SearchHistoryItem> list) {
        if (list != null) {
            this.items = list;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @JsonGetter("items")
    public final List<SearchHistoryItem> getItems() {
        return this.items;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchHistory{items=");
        sb.append(this.items);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchHistory)) {
            return false;
        }
        return this.items.equals(((SearchHistory) obj).getItems());
    }

    public final int hashCode() {
        return this.items.hashCode() ^ 1000003;
    }
}
