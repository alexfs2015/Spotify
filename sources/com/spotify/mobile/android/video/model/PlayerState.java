package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class PlayerState implements JacksonModel {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("duration")
    public Long durationInMs;
    @JsonProperty("is_buffering")
    public boolean isBuffering;
    @JsonProperty("is_paused")
    public boolean isPaused;
    @JsonProperty("playback_id")
    public String playbackId;
    @JsonProperty("playback_speed")
    public float playbackSpeed;
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("position_as_of_timestamp")
    public Long positionAsOfTimestampInMs;
    @JsonProperty("timestamp")
    public long timestamp;

    public PlayerState() {
    }

    public PlayerState(long j, String str, Long l, Long l2, boolean z, float f, boolean z2) {
        this.timestamp = j;
        this.playbackId = str;
        this.positionAsOfTimestampInMs = l;
        this.durationInMs = l2;
        this.isBuffering = z;
        this.playbackSpeed = f;
        this.isPaused = z2;
    }

    public static PlayerState fromPlaybackState(kcj kcj) {
        String str = "dvs_py_ldiabnieadock";
        PlayerState playerState = new PlayerState(kcj.b(), (String) kcj.a().e().get("endvideo_playback_id"), kcj.c(), kcj.d(), kcj.e(), kcj.g() ? 0.0f : kcj.f(), kcj.g());
        return playerState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerState{timestamp=");
        sb.append(this.timestamp);
        String str = "=bamck/,d pl/yI";
        sb.append(", playbackId='");
        sb.append(this.playbackId);
        sb.append('\'');
        sb.append(", positionAsOfTimestampInMs=");
        sb.append(this.positionAsOfTimestampInMs);
        String str2 = " ,=doasrtIiunon";
        sb.append(", durationInMs=");
        sb.append(this.durationInMs);
        String str3 = "nsefibB,gfrui=";
        sb.append(", isBuffering=");
        sb.append(this.isBuffering);
        String str4 = "dycb pblk=epS,ae";
        sb.append(", playbackSpeed=");
        sb.append(this.playbackSpeed);
        String str5 = "asu,si t=ed";
        sb.append(", isPaused=");
        sb.append(this.isPaused);
        sb.append('}');
        return sb.toString();
    }
}
