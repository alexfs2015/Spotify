package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Arrays;

@JsonDeserialize(using = RadioStationTracksModel_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RadioStationTracksModel implements JacksonModel {
    @JsonProperty("next_page_url")
    public final String nextPageUrl;
    @JsonProperty
    public final PlayerTrack[] tracks;

    @JsonCreator
    public RadioStationTracksModel(@JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("next_page_url") String str) {
        this.tracks = playerTrackArr;
        this.nextPageUrl = str;
    }

    @JsonIgnore
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof RadioStationTracksModel)) {
            RadioStationTracksModel radioStationTracksModel = (RadioStationTracksModel) obj;
            if (Arrays.equals(this.tracks, radioStationTracksModel.tracks) && faw.a(this.nextPageUrl, radioStationTracksModel.nextPageUrl)) {
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.nextPageUrl, Integer.valueOf(Arrays.hashCode(this.tracks))});
    }
}
