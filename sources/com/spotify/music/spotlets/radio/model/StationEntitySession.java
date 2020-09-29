package com.spotify.music.spotlets.radio.model;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

@JsonDeserialize(using = StationEntitySession_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StationEntitySession implements JacksonModel {
    private int mIndex;
    private long mLastUpdateTime;
    private RadioStationModel mRadioStationModel;

    @JsonCreator
    public StationEntitySession(@JsonProperty("radioStationModel") RadioStationModel radioStationModel, @JsonProperty("index") int i, @JsonProperty("lastUpdateTime") long j) {
        this.mRadioStationModel = (RadioStationModel) fay.a(radioStationModel);
        this.mIndex = i;
        this.mLastUpdateTime = j;
    }

    @JsonProperty("radioStationModel")
    public RadioStationModel getRadioStationModel() {
        return this.mRadioStationModel;
    }

    @JsonProperty("index")
    public int getIndex() {
        return this.mIndex;
    }

    @JsonProperty("lastUpdateTime")
    public long getLastUpdateTime() {
        return this.mLastUpdateTime;
    }

    @JsonIgnore
    public PlayerTrack getCurrentTrack() {
        int i = this.mIndex;
        if (i < 0 || i >= this.mRadioStationModel.tracks.length) {
            return null;
        }
        return this.mRadioStationModel.tracks[this.mIndex];
    }

    public void updateStationModel(RadioStationModel radioStationModel) {
        this.mRadioStationModel = radioStationModel;
        this.mLastUpdateTime = jrf.a.a();
    }

    public void updateTracks(PlayerState playerState) {
        if (TextUtils.equals(this.mRadioStationModel.getPlayerContextUri(), playerState.entityUri())) {
            PlayerTrack currentTrack = getCurrentTrack();
            PlayerTrack track = playerState.track();
            if (track == null) {
                return;
            }
            if (currentTrack == null || !TextUtils.equals(currentTrack.uid(), track.uid())) {
                PlayerTrack[] reverse = playerState.reverse();
                PlayerTrack[] future = playerState.future();
                PlayerTrack[] playerTrackArr = new PlayerTrack[(playerState.reverse().length + playerState.future().length + 1)];
                System.arraycopy(reverse, 0, playerTrackArr, 0, reverse.length);
                playerTrackArr[reverse.length] = track;
                System.arraycopy(future, 0, playerTrackArr, reverse.length + 1, future.length);
                RadioStationModel radioStationModel = new RadioStationModel(this.mRadioStationModel.uri, this.mRadioStationModel.title, this.mRadioStationModel.titleUri, this.mRadioStationModel.imageUri, this.mRadioStationModel.playlistUri, this.mRadioStationModel.subtitle, this.mRadioStationModel.subtitleUri, this.mRadioStationModel.seeds, this.mRadioStationModel.relatedArtists, playerTrackArr, uhq.a(this.mRadioStationModel.nextPageUrl, playerTrackArr), this.mRadioStationModel.explicitSave);
                this.mRadioStationModel = radioStationModel;
                this.mIndex = reverse.length;
                this.mLastUpdateTime = jrf.a.a();
            }
        }
    }

    public void updateFollowing(boolean z) {
        this.mRadioStationModel = uhq.a(this.mRadioStationModel, z);
    }
}
