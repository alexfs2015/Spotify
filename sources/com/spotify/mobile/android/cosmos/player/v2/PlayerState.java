package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import java.util.Arrays;
import java.util.Map;

@JsonDeserialize(using = PlayerState_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerState implements Parcelable, JacksonModel {
    public static final Creator<PlayerState> CREATOR = new Creator<PlayerState>() {
        public final PlayerState createFromParcel(Parcel parcel) {
            return new PlayerState(parcel);
        }

        public final PlayerState[] newArray(int i) {
            return new PlayerState[i];
        }
    };
    public static final long NO_TIME = -1;
    @JsonProperty("audio_stream")
    private final AudioStream mAudioStream;
    private jrp mClock;
    @JsonProperty("context_metadata")
    private final ImmutableMap<String, String> mContextMetadata;
    @JsonProperty("context_uri")
    private final String mContextUri;
    @JsonProperty("duration")
    private final long mDuration;
    @JsonProperty("future")
    private final PlayerTrack[] mFuture;
    @JsonProperty("index")
    private final PlayerContextIndex mIndex;
    @JsonProperty("is_paused")
    private final boolean mIsPaused;
    @JsonProperty("is_playing")
    private final boolean mIsPlaying;
    @JsonProperty("options")
    private final PlayerOptions mOptions;
    @JsonProperty("page_metadata")
    private final ImmutableMap<String, String> mPageMetadata;
    @JsonProperty("play_origin")
    private final PlayOrigin mPlayOrigin;
    @JsonProperty("playback_id")
    private final String mPlaybackId;
    @JsonProperty("playback_speed")
    private final float mPlaybackSpeed;
    @JsonProperty("position_as_of_timestamp")
    private final long mPositionAsOfTimestamp;
    @JsonProperty("restrictions")
    private final PlayerRestrictions mRestrictions;
    @JsonProperty("reverse")
    private final PlayerTrack[] mReverse;
    @JsonProperty("suppressions")
    private final PlayerSuppressions mSuppressions;
    @JsonProperty("timestamp")
    private final long mTimestamp;
    @JsonProperty("track")
    private final PlayerTrack mTrack;

    public int describeContents() {
        return 0;
    }

    public void setClock(jrp jrp) {
        this.mClock = jrp;
    }

    @JsonCreator
    public PlayerState(@JsonProperty("timestamp") long j, @JsonProperty("context_uri") String str, @JsonProperty("play_origin") PlayOrigin playOrigin, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("playback_id") String str2, @JsonProperty("index") PlayerContextIndex playerContextIndex, @JsonProperty("playback_speed") float f, @JsonProperty("position_as_of_timestamp") long j2, @JsonProperty("duration") long j3, @JsonProperty("is_playing") boolean z, @JsonProperty("is_paused") boolean z2, @JsonProperty("options") PlayerOptions playerOptions, @JsonProperty("restrictions") PlayerRestrictions playerRestrictions, @JsonProperty("suppressions") PlayerSuppressions playerSuppressions, @JsonProperty("future") PlayerTrack[] playerTrackArr, @JsonProperty("reverse") PlayerTrack[] playerTrackArr2, @JsonProperty("context_metadata") Map<String, String> map, @JsonProperty("page_metadata") Map<String, String> map2, @JsonProperty("audio_stream") AudioStream audioStream) {
        PlayerTrack[] playerTrackArr3 = playerTrackArr;
        PlayerTrack[] playerTrackArr4 = playerTrackArr2;
        Map<String, String> map3 = map;
        Map<String, String> map4 = map2;
        this.mTimestamp = j;
        this.mContextUri = str;
        this.mPlayOrigin = (PlayOrigin) fay.a(playOrigin);
        this.mTrack = playerTrack;
        this.mPlaybackId = str2;
        this.mIndex = playerContextIndex;
        this.mPlaybackSpeed = f;
        this.mPositionAsOfTimestamp = j2;
        this.mDuration = j3;
        this.mIsPlaying = z;
        this.mIsPaused = z2;
        this.mOptions = (PlayerOptions) fay.a(playerOptions);
        this.mRestrictions = (PlayerRestrictions) fay.a(playerRestrictions);
        this.mSuppressions = (PlayerSuppressions) fay.a(playerSuppressions);
        this.mFuture = playerTrackArr3 != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr3, playerTrackArr3.length) : new PlayerTrack[0];
        this.mReverse = playerTrackArr4 != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr4, playerTrackArr4.length) : new PlayerTrack[0];
        this.mClock = jrf.a;
        a g = ImmutableMap.g();
        if (map3 != null && !map.isEmpty()) {
            g.a(map3);
        }
        this.mContextMetadata = g.b();
        a g2 = ImmutableMap.g();
        if (map4 != null && !map2.isEmpty()) {
            g2.a(map4);
        }
        this.mPageMetadata = g2.b();
        this.mAudioStream = audioStream == null ? AudioStream.DEFAULT : audioStream;
    }

    public long timestamp() {
        return this.mTimestamp;
    }

    public String contextUri() {
        String str = this.mContextUri;
        return str == null ? "" : str;
    }

    public String entityUri() {
        return contextUri();
    }

    public PlayOrigin playOrigin() {
        return this.mPlayOrigin;
    }

    public PlayerTrack track() {
        return this.mTrack;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public PlayerContextIndex index() {
        return this.mIndex;
    }

    public float playbackSpeed() {
        return this.mPlaybackSpeed;
    }

    public long positionAsOfTimestamp() {
        return this.mPositionAsOfTimestamp;
    }

    public long duration() {
        return this.mDuration;
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public PlayerOptions options() {
        return this.mOptions;
    }

    public PlayerRestrictions restrictions() {
        return this.mRestrictions;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public PlayerTrack[] future() {
        return this.mFuture;
    }

    public PlayerTrack[] reverse() {
        return this.mReverse;
    }

    public Map<String, String> contextMetadata() {
        return this.mContextMetadata;
    }

    public Map<String, String> pageMetadata() {
        return this.mPageMetadata;
    }

    public AudioStream audioStream() {
        return this.mAudioStream;
    }

    public long currentPlaybackPosition(long j) {
        long positionAsOfTimestamp = positionAsOfTimestamp();
        if (positionAsOfTimestamp == -1) {
            return -1;
        }
        return Math.min(positionAsOfTimestamp + ((long) (playbackSpeed() * ((float) (j - timestamp())))), duration());
    }

    public long currentPlaybackPosition() {
        return currentPlaybackPosition(this.mClock.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) obj;
        if (this.mTimestamp != playerState.mTimestamp || Float.compare(playerState.mPlaybackSpeed, this.mPlaybackSpeed) != 0 || this.mPositionAsOfTimestamp != playerState.mPositionAsOfTimestamp || this.mDuration != playerState.mDuration || this.mIsPlaying != playerState.mIsPlaying || this.mIsPaused != playerState.mIsPaused) {
            return false;
        }
        String str = this.mContextUri;
        if (str == null ? playerState.mContextUri != null : !str.equals(playerState.mContextUri)) {
            return false;
        }
        if (!this.mPlayOrigin.equals(playerState.mPlayOrigin)) {
            return false;
        }
        PlayerTrack playerTrack = this.mTrack;
        if (playerTrack == null ? playerState.mTrack != null : !playerTrack.equals(playerState.mTrack)) {
            return false;
        }
        String str2 = this.mPlaybackId;
        if (str2 == null ? playerState.mPlaybackId != null : !str2.equals(playerState.mPlaybackId)) {
            return false;
        }
        PlayerContextIndex playerContextIndex = this.mIndex;
        if (playerContextIndex == null ? playerState.mIndex != null : !playerContextIndex.equals(playerState.mIndex)) {
            return false;
        }
        if (!this.mOptions.equals(playerState.mOptions) || !this.mRestrictions.equals(playerState.mRestrictions) || !this.mSuppressions.equals(playerState.mSuppressions) || !Arrays.equals(this.mFuture, playerState.mFuture) || !Arrays.equals(this.mReverse, playerState.mReverse) || !MapUtils.areMapsEqual(this.mContextMetadata, playerState.mContextMetadata) || !MapUtils.areMapsEqual(this.mPageMetadata, playerState.mPageMetadata)) {
            return false;
        }
        AudioStream audioStream = this.mAudioStream;
        AudioStream audioStream2 = playerState.mAudioStream;
        return audioStream == null ? audioStream2 == null : audioStream == audioStream2;
    }

    public int hashCode() {
        long j = this.mTimestamp;
        int i = 0;
        int hashCode = ((((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(new Object[]{this.mContextUri, this.mPlayOrigin, this.mTrack, this.mPlaybackId, this.mIndex, this.mOptions, this.mRestrictions, this.mSuppressions})) * 31;
        float f = this.mPlaybackSpeed;
        int floatToIntBits = (hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        long j2 = this.mPositionAsOfTimestamp;
        int i2 = (floatToIntBits + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.mDuration;
        int hashCode2 = (((((((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.mIsPlaying ? 1 : 0)) * 31) + (this.mIsPaused ? 1 : 0)) * 31) + Arrays.hashCode(this.mFuture)) * 31) + Arrays.hashCode(this.mReverse)) * 31) + MapUtils.hashOfMap(this.mContextMetadata)) * 31) + MapUtils.hashOfMap(this.mPageMetadata)) * 31;
        AudioStream audioStream = this.mAudioStream;
        if (audioStream != null) {
            i = audioStream.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerState{contextUri=");
        sb.append(contextUri());
        sb.append(", isPlaying=");
        sb.append(isPlaying());
        sb.append(", isPaused=");
        sb.append(isPaused());
        sb.append(", playbackSpeed=");
        sb.append(playbackSpeed());
        sb.append(", timestamp=");
        sb.append(timestamp());
        sb.append(", duration=");
        sb.append(duration());
        sb.append(", track=");
        sb.append(track());
        sb.append(", contextMetadata=");
        sb.append(contextMetadata());
        sb.append("}");
        return sb.toString();
    }

    protected PlayerState(Parcel parcel) {
        this.mTimestamp = parcel.readLong();
        this.mContextUri = parcel.readString();
        this.mPlayOrigin = (PlayOrigin) PlayOrigin.CREATOR.createFromParcel(parcel);
        this.mTrack = (PlayerTrack) jse.b(parcel, PlayerTrack.CREATOR);
        this.mPlaybackId = parcel.readString();
        this.mIndex = (PlayerContextIndex) jse.b(parcel, PlayerContextIndex.CREATOR);
        this.mPlaybackSpeed = parcel.readFloat();
        this.mPositionAsOfTimestamp = parcel.readLong();
        this.mDuration = parcel.readLong();
        this.mIsPlaying = jse.a(parcel);
        this.mIsPaused = jse.a(parcel);
        this.mOptions = (PlayerOptions) AutoValue_PlayerOptions.CREATOR.createFromParcel(parcel);
        this.mRestrictions = (PlayerRestrictions) PlayerRestrictions.CREATOR.createFromParcel(parcel);
        this.mSuppressions = (PlayerSuppressions) PlayerSuppressions.CREATOR.createFromParcel(parcel);
        this.mFuture = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mReverse = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mContextMetadata = jse.a(parcel, jvm.c());
        this.mPageMetadata = jse.a(parcel, jvm.c());
        this.mAudioStream = (AudioStream) jse.a(parcel, AudioStream.class);
        this.mClock = jrf.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeString(this.mContextUri);
        this.mPlayOrigin.writeToParcel(parcel, 0);
        jse.a(parcel, (Parcelable) this.mTrack, 0);
        parcel.writeString(this.mPlaybackId);
        jse.a(parcel, (Parcelable) this.mIndex, 0);
        parcel.writeFloat(this.mPlaybackSpeed);
        parcel.writeLong(this.mPositionAsOfTimestamp);
        parcel.writeLong(this.mDuration);
        jse.a(parcel, this.mIsPlaying);
        jse.a(parcel, this.mIsPaused);
        this.mOptions.writeToParcel(parcel, 0);
        this.mRestrictions.writeToParcel(parcel, 0);
        this.mSuppressions.writeToParcel(parcel, 0);
        parcel.writeTypedArray(this.mFuture, 0);
        parcel.writeTypedArray(this.mReverse, 0);
        jse.a(parcel, (Map<String, String>) this.mContextMetadata);
        jse.a(parcel, (Map<String, String>) this.mPageMetadata);
        jse.a(parcel, this.mAudioStream);
    }
}
