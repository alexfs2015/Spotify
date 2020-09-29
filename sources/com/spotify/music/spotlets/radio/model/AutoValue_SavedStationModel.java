package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_SavedStationModel extends SavedStationModel {
    private final String seedUri;

    AutoValue_SavedStationModel(String str) {
        if (str != null) {
            this.seedUri = str;
            return;
        }
        throw new NullPointerException("Null seedUri");
    }

    @JsonProperty
    public final String seedUri() {
        return this.seedUri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedStationModel{seedUri=");
        sb.append(this.seedUri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavedStationModel)) {
            return false;
        }
        return this.seedUri.equals(((SavedStationModel) obj).seedUri());
    }

    public final int hashCode() {
        return this.seedUri.hashCode() ^ 1000003;
    }
}
