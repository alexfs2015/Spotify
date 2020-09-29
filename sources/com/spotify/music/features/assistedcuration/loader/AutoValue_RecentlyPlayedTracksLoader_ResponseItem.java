package com.spotify.music.features.assistedcuration.loader;

import com.spotify.music.features.assistedcuration.loader.RecentlyPlayedTracksLoader.ResponseItem;

final class AutoValue_RecentlyPlayedTracksLoader_ResponseItem extends ResponseItem {
    private final String name;
    private final String uri;

    AutoValue_RecentlyPlayedTracksLoader_ResponseItem(String str, String str2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ResponseItem) {
            ResponseItem responseItem = (ResponseItem) obj;
            return this.uri.equals(responseItem.getUri()) && this.name.equals(responseItem.getName());
        }
    }

    public final String getName() {
        return this.name;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseItem{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append("}");
        return sb.toString();
    }
}
