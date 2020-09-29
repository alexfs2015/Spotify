package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_RadioStationsModel reason: invalid class name */
abstract class C$AutoValue_RadioStationsModel extends RadioStationsModel {
    private final List<ClusterRadioStationModel> clusterStations;
    private final List<RadioStationModel> genreStations;
    private final List<RadioStationModel> recommendedStations;
    private final List<RadioStationModel> savedStations;
    private final List<RadioStationModel> userStations;

    C$AutoValue_RadioStationsModel(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4, List<ClusterRadioStationModel> list5) {
        if (list != null) {
            this.userStations = list;
            if (list2 != null) {
                this.recommendedStations = list2;
                if (list3 != null) {
                    this.genreStations = list3;
                    if (list4 != null) {
                        this.savedStations = list4;
                        if (list5 != null) {
                            this.clusterStations = list5;
                            return;
                        }
                        throw new NullPointerException("Null clusterStations");
                    }
                    throw new NullPointerException("Null savedStations");
                }
                throw new NullPointerException("Null genreStations");
            }
            throw new NullPointerException("Null recommendedStations");
        }
        throw new NullPointerException("Null userStations");
    }

    @JsonProperty("user_stations")
    public List<RadioStationModel> userStations() {
        return this.userStations;
    }

    @JsonProperty("recommended_stations")
    public List<RadioStationModel> recommendedStations() {
        return this.recommendedStations;
    }

    @JsonProperty("genre_stations")
    public List<RadioStationModel> genreStations() {
        return this.genreStations;
    }

    @JsonProperty("saved_stations")
    public List<RadioStationModel> savedStations() {
        return this.savedStations;
    }

    @JsonProperty("cluster_stations")
    public List<ClusterRadioStationModel> clusterStations() {
        return this.clusterStations;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadioStationsModel{userStations=");
        sb.append(this.userStations);
        sb.append(", recommendedStations=");
        sb.append(this.recommendedStations);
        sb.append(", genreStations=");
        sb.append(this.genreStations);
        sb.append(", savedStations=");
        sb.append(this.savedStations);
        sb.append(", clusterStations=");
        sb.append(this.clusterStations);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RadioStationsModel) {
            RadioStationsModel radioStationsModel = (RadioStationsModel) obj;
            return this.userStations.equals(radioStationsModel.userStations()) && this.recommendedStations.equals(radioStationsModel.recommendedStations()) && this.genreStations.equals(radioStationsModel.genreStations()) && this.savedStations.equals(radioStationsModel.savedStations()) && this.clusterStations.equals(radioStationsModel.clusterStations());
        }
    }

    public int hashCode() {
        return ((((((((this.userStations.hashCode() ^ 1000003) * 1000003) ^ this.recommendedStations.hashCode()) * 1000003) ^ this.genreStations.hashCode()) * 1000003) ^ this.savedStations.hashCode()) * 1000003) ^ this.clusterStations.hashCode();
    }
}
