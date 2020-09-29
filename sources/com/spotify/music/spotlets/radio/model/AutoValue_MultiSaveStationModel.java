package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_MultiSaveStationModel extends MultiSaveStationModel {
    private final List<String> seedUris;

    AutoValue_MultiSaveStationModel(List<String> list) {
        if (list != null) {
            this.seedUris = list;
            return;
        }
        throw new NullPointerException("Null seedUris");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiSaveStationModel)) {
            return false;
        }
        return this.seedUris.equals(((MultiSaveStationModel) obj).seedUris());
    }

    public final int hashCode() {
        return this.seedUris.hashCode() ^ 1000003;
    }

    @JsonProperty
    public final List<String> seedUris() {
        return this.seedUris;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSaveStationModel{seedUris=");
        sb.append(this.seedUris);
        sb.append("}");
        return sb.toString();
    }
}
