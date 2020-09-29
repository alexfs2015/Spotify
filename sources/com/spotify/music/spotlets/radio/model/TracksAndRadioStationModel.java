package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Arrays;

@JsonDeserialize(using = TracksAndRadioStationModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TracksAndRadioStationModel extends RadioStationTracksModel {
    @JsonProperty
    public final RadioStationModel station;

    @JsonCreator
    public TracksAndRadioStationModel(@JsonProperty("station") RadioStationModel radioStationModel, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("next_page_url") String str) {
        super(playerTrackArr, str);
        this.station = radioStationModel;
    }

    @JsonIgnore
    public boolean equals(Object obj) {
        if (obj instanceof TracksAndRadioStationModel) {
            TracksAndRadioStationModel tracksAndRadioStationModel = (TracksAndRadioStationModel) obj;
            if (super.equals(tracksAndRadioStationModel) && fbn.a(this.station, tracksAndRadioStationModel.station)) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.station});
    }
}
