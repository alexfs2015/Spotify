package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_CreateRadioStationModel extends CreateRadioStationModel {
    private final String imageUri;
    private final List<String> seeds;
    private final String title;

    AutoValue_CreateRadioStationModel(List<String> list, String str, String str2) {
        if (list != null) {
            this.seeds = list;
            this.title = str;
            this.imageUri = str2;
            return;
        }
        throw new NullPointerException("Null seeds");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateRadioStationModel) {
            CreateRadioStationModel createRadioStationModel = (CreateRadioStationModel) obj;
            if (this.seeds.equals(createRadioStationModel.seeds())) {
                String str = this.title;
                if (str != null ? str.equals(createRadioStationModel.title()) : createRadioStationModel.title() == null) {
                    String str2 = this.imageUri;
                    return str2 != null ? str2.equals(createRadioStationModel.imageUri()) : createRadioStationModel.imageUri() == null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.seeds.hashCode() ^ 1000003) * 1000003;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.imageUri;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("imageUri")
    public final String imageUri() {
        return this.imageUri;
    }

    @JsonProperty
    public final List<String> seeds() {
        return this.seeds;
    }

    @JsonProperty("title")
    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateRadioStationModel{seeds=");
        sb.append(this.seeds);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        sb.append("}");
        return sb.toString();
    }
}
