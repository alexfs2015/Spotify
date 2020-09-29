package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_ClusterUrisModel reason: invalid class name */
abstract class C$AutoValue_ClusterUrisModel extends ClusterUrisModel {
    private final List<String> clusterUris;

    C$AutoValue_ClusterUrisModel(List<String> list) {
        if (list != null) {
            this.clusterUris = list;
            return;
        }
        throw new NullPointerException("Null clusterUris");
    }

    @JsonProperty
    public List<String> clusterUris() {
        return this.clusterUris;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClusterUrisModel)) {
            return false;
        }
        return this.clusterUris.equals(((ClusterUrisModel) obj).clusterUris());
    }

    public int hashCode() {
        return this.clusterUris.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClusterUrisModel{clusterUris=");
        sb.append(this.clusterUris);
        sb.append("}");
        return sb.toString();
    }
}
