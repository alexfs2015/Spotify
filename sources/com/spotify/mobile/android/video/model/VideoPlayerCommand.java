package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import java.util.Arrays;

@JsonDeserialize(using = VideoPlayerCommand_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoPlayerCommand implements JacksonModel {
    private static final gce<Type> TYPE_PARSER = gce.a(Type.class);
    public ContextPlayerConfiguration configuration;
    public TrackWithPlayOrigin[] futureTrackWithPlayOrigins;
    public boolean initiallyPaused;
    public LoggingParameters loggingParameters;
    public float playbackSpeed;
    public PlayerTrack[] prefetchTracks;
    public long seekToInMs;
    public String startReason;
    public boolean systemInitiated;
    public TrackWithPlayOrigin trackWithPlayOrigin;
    public Type type;

    public enum Type {
        SUBSCRIBED,
        START,
        STOP,
        PAUSE,
        RESUME,
        SEEK_TO,
        PREFETCH_TRACKS,
        CONFIG,
        UNKNOWN
    }

    VideoPlayerCommand(Type type2, long j, TrackWithPlayOrigin trackWithPlayOrigin2, TrackWithPlayOrigin[] trackWithPlayOriginArr, boolean z, boolean z2, String str, LoggingParameters loggingParameters2, PlayerTrack[] playerTrackArr, ContextPlayerConfiguration contextPlayerConfiguration) {
        this.type = type2;
        this.seekToInMs = j;
        this.trackWithPlayOrigin = trackWithPlayOrigin2;
        this.futureTrackWithPlayOrigins = trackWithPlayOriginArr;
        this.initiallyPaused = z;
        this.systemInitiated = z2;
        if (str == null) {
            str = "unknown";
        }
        this.startReason = str;
        this.loggingParameters = loggingParameters2;
        this.prefetchTracks = playerTrackArr;
        this.configuration = contextPlayerConfiguration;
    }

    @JsonCreator
    public VideoPlayerCommand(@JsonProperty("type") String str, @JsonProperty("seek_to") long j, @JsonProperty("track") TrackWithPlayOrigin trackWithPlayOrigin2, @JsonProperty("future") TrackWithPlayOrigin[] trackWithPlayOriginArr, @JsonProperty("initially_paused") boolean z, @JsonProperty("system_initiated") boolean z2, @JsonProperty("start_reason") String str2, @JsonProperty("logging_params") LoggingParameters loggingParameters2, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("position") Long l, @JsonProperty("config") ContextPlayerConfiguration contextPlayerConfiguration) {
        String str3 = str;
        this((Type) TYPE_PARSER.b(str).a(Type.UNKNOWN), l == null ? j : l.longValue(), trackWithPlayOrigin2, trackWithPlayOriginArr, z, z2, str2, loggingParameters2, playerTrackArr, contextPlayerConfiguration);
    }

    public static VideoPlayerCommand createEmptyCommand(Type type2) {
        VideoPlayerCommand videoPlayerCommand = r0;
        VideoPlayerCommand videoPlayerCommand2 = new VideoPlayerCommand(type2, 0, null, null, false, false, null, null, null, null);
        return videoPlayerCommand2;
    }

    public static VideoPlayerCommand createSeekCommand(long j) {
        VideoPlayerCommand videoPlayerCommand = r0;
        VideoPlayerCommand videoPlayerCommand2 = new VideoPlayerCommand(Type.SEEK_TO, j, null, null, false, false, null, null, null, null);
        return videoPlayerCommand2;
    }

    public static VideoPlayerCommand createStartCommand(long j, TrackWithPlayOrigin trackWithPlayOrigin2, TrackWithPlayOrigin[] trackWithPlayOriginArr, boolean z, boolean z2, String str, LoggingParameters loggingParameters2) {
        TrackWithPlayOrigin trackWithPlayOrigin3 = trackWithPlayOrigin2;
        TrackWithPlayOrigin[] trackWithPlayOriginArr2 = trackWithPlayOriginArr;
        boolean z3 = z;
        String str2 = str;
        LoggingParameters loggingParameters3 = loggingParameters2;
        VideoPlayerCommand videoPlayerCommand = new VideoPlayerCommand(Type.START, j, trackWithPlayOrigin2, trackWithPlayOriginArr, z, z2, str, loggingParameters2, null, null);
        return videoPlayerCommand;
    }

    public boolean testIsEqualTo(VideoPlayerCommand videoPlayerCommand) {
        return Arrays.equals(JacksonSerializer.toBytes(this), JacksonSerializer.toBytes(videoPlayerCommand));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayerCommand{type=");
        sb.append(this.type);
        sb.append('}');
        return sb.toString();
    }
}
