package com.spotify.music.spotlets.radio.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.List;

@JsonDeserialize(using = RadioStationsModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RadioStationsModel implements Parcelable, JacksonModel {

    static class a extends upw<RadioStationModel> {
        protected a() {
            super(RadioStationModel.CREATOR);
        }
    }

    private static RadioStationModel[] safeArray(RadioStationModel[] radioStationModelArr) {
        return radioStationModelArr == null ? new RadioStationModel[0] : radioStationModelArr;
    }

    @JsonProperty("cluster_stations")
    public abstract List<ClusterRadioStationModel> clusterStations();

    @JsonProperty("genre_stations")
    public abstract List<RadioStationModel> genreStations();

    @JsonProperty("recommended_stations")
    public abstract List<RadioStationModel> recommendedStations();

    @JsonProperty("saved_stations")
    public abstract List<RadioStationModel> savedStations();

    @JsonProperty("user_stations")
    public abstract List<RadioStationModel> userStations();

    @JsonCreator
    public static RadioStationsModel create(@JsonProperty("user_stations") RadioStationModel[] radioStationModelArr, @JsonProperty("recommended_stations") RadioStationModel[] radioStationModelArr2, @JsonProperty("genre_stations") RadioStationModel[] radioStationModelArr3, @JsonProperty("saved_stations") RadioStationModel[] radioStationModelArr4, @JsonProperty("cluster_stations") ClusterRadioStationModel[] clusterRadioStationModelArr) {
        List asList = Arrays.asList(safeArray(radioStationModelArr));
        List asList2 = Arrays.asList(safeArray(radioStationModelArr2));
        List asList3 = Arrays.asList(safeArray(radioStationModelArr3));
        List asList4 = Arrays.asList(safeArray(radioStationModelArr4));
        if (clusterRadioStationModelArr == null) {
            clusterRadioStationModelArr = new ClusterRadioStationModel[0];
        }
        return create(asList, asList2, asList3, asList4, Arrays.asList(clusterRadioStationModelArr));
    }

    public static RadioStationsModel create(List<RadioStationModel> list, List<RadioStationModel> list2, List<RadioStationModel> list3, List<RadioStationModel> list4, List<ClusterRadioStationModel> list5) {
        AutoValue_RadioStationsModel autoValue_RadioStationsModel = new AutoValue_RadioStationsModel(list, list2, list3, list4, list5);
        return autoValue_RadioStationsModel;
    }
}
