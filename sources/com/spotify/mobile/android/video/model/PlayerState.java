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

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerState{timestamp=");
        sb.append(this.timestamp);
        sb.append(", playbackId='");
        sb.append(this.playbackId);
        sb.append('\'');
        sb.append(", positionAsOfTimestampInMs=");
        sb.append(this.positionAsOfTimestampInMs);
        sb.append(", durationInMs=");
        sb.append(this.durationInMs);
        sb.append(", isBuffering=");
        sb.append(this.isBuffering);
        sb.append(", playbackSpeed=");
        sb.append(this.playbackSpeed);
        sb.append(", isPaused=");
        sb.append(this.isPaused);
        sb.append('}');
        return sb.toString();
    }

    public static PlayerState fromPlaybackState(kaj kaj) {
        PlayerState playerState = new PlayerState(kaj.b(), (String) kaj.a().e().get("endvideo_playback_id"), kaj.c(), kaj.d(), kaj.e(), kaj.g() ? 0.0f : kaj.f(), kaj.g());
        return playerState;
    }
}
