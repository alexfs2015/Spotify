package com.spotify.mobile.android.spotlets.collection.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.ContainsRequest;
import java.util.List;

final class AutoValue_CollectionStateProvider_ContainsRequest extends ContainsRequest {
    private final String contextUri;
    private final List<String> items;
    private final String source;

    AutoValue_CollectionStateProvider_ContainsRequest(List<String> list, String str, String str2) {
        if (list != null) {
            this.items = list;
            if (str != null) {
                this.source = str;
                if (str2 != null) {
                    this.contextUri = str2;
                    return;
                }
                throw new NullPointerException("Null contextUri");
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null items");
    }

    @JsonProperty("items")
    public final List<String> getItems() {
        return this.items;
    }

    @JsonProperty("source")
    public final String getSource() {
        return this.source;
    }

    @JsonProperty("contextUri")
    public final String getContextUri() {
        return this.contextUri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContainsRequest{items=");
        sb.append(this.items);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", contextUri=");
        sb.append(this.contextUri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContainsRequest) {
            ContainsRequest containsRequest = (ContainsRequest) obj;
            return this.items.equals(containsRequest.getItems()) && this.source.equals(containsRequest.getSource()) && this.contextUri.equals(containsRequest.getContextUri());
        }
    }

    public final int hashCode() {
        return ((((this.items.hashCode() ^ 1000003) * 1000003) ^ this.source.hashCode()) * 1000003) ^ this.contextUri.hashCode();
    }
}
