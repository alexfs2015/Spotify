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
@Deprecated
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
    private jtz mClock;
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

    @JsonCreator
    public PlayerState(@JsonProperty("timestamp") long j, @JsonProperty("context_uri") String str, @JsonProperty("play_origin") PlayOrigin playOrigin, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("playback_id") String str2, @JsonProperty("index") PlayerContextIndex playerContextIndex, @JsonProperty("playback_speed") float f, @JsonProperty("position_as_of_timestamp") long j2, @JsonProperty("duration") long j3, @JsonProperty("is_playing") boolean z, @JsonProperty("is_paused") boolean z2, @JsonProperty("options") PlayerOptions playerOptions, @JsonProperty("restrictions") PlayerRestrictions playerRestrictions, @JsonProperty("suppressions") PlayerSuppressions playerSuppressions, @JsonProperty("future") PlayerTrack[] playerTrackArr, @JsonProperty("reverse") PlayerTrack[] playerTrackArr2, @JsonProperty("context_metadata") Map<String, String> map, @JsonProperty("page_metadata") Map<String, String> map2, @JsonProperty("audio_stream") AudioStream audioStream) {
        PlayerTrack[] playerTrackArr3 = playerTrackArr;
        PlayerTrack[] playerTrackArr4 = playerTrackArr2;
        Map<String, String> map3 = map;
        Map<String, String> map4 = map2;
        this.mTimestamp = j;
        this.mContextUri = str;
        this.mPlayOrigin = (PlayOrigin) fbp.a(playOrigin);
        this.mTrack = playerTrack;
        this.mPlaybackId = str2;
        this.mIndex = playerContextIndex;
        this.mPlaybackSpeed = f;
        this.mPositionAsOfTimestamp = j2;
        this.mDuration = j3;
        this.mIsPlaying = z;
        this.mIsPaused = z2;
        this.mOptions = (PlayerOptions) fbp.a(playerOptions);
        this.mRestrictions = (PlayerRestrictions) fbp.a(playerRestrictions);
        this.mSuppressions = (PlayerSuppressions) fbp.a(playerSuppressions);
        this.mFuture = playerTrackArr3 != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr3, playerTrackArr3.length) : new PlayerTrack[0];
        this.mReverse = playerTrackArr4 != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr4, playerTrackArr4.length) : new PlayerTrack[0];
        this.mClock = jtp.a;
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

    protected PlayerState(Parcel parcel) {
        this.mTimestamp = parcel.readLong();
        this.mContextUri = parcel.readString();
        this.mPlayOrigin = (PlayOrigin) PlayOrigin.CREATOR.createFromParcel(parcel);
        this.mTrack = (PlayerTrack) juo.b(parcel, PlayerTrack.CREATOR);
        this.mPlaybackId = parcel.readString();
        this.mIndex = (PlayerContextIndex) juo.b(parcel, PlayerContextIndex.CREATOR);
        this.mPlaybackSpeed = parcel.readFloat();
        this.mPositionAsOfTimestamp = parcel.readLong();
        this.mDuration = parcel.readLong();
        this.mIsPlaying = juo.a(parcel);
        this.mIsPaused = juo.a(parcel);
        this.mOptions = (PlayerOptions) AutoValue_PlayerOptions.CREATOR.createFromParcel(parcel);
        this.mRestrictions = (PlayerRestrictions) PlayerRestrictions.CREATOR.createFromParcel(parcel);
        this.mSuppressions = (PlayerSuppressions) PlayerSuppressions.CREATOR.createFromParcel(parcel);
        this.mFuture = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mReverse = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
        this.mContextMetadata = juo.a(parcel, jxu.c());
        this.mPageMetadata = juo.a(parcel, jxu.c());
        this.mAudioStream = (AudioStream) juo.a(parcel, AudioStream.class);
        this.mClock = jtp.a;
    }

    public AudioStream audioStream() {
        return this.mAudioStream;
    }

    public Map<String, String> contextMetadata() {
        return this.mContextMetadata;
    }

    public String contextUri() {
        String str = this.mContextUri;
        if (str == null) {
            String str2 = "";
            str = "";
        }
        return str;
    }

    public long currentPlaybackPosition() {
        return currentPlaybackPosition(this.mClock.a());
    }

    public long currentPlaybackPosition(long j) {
        long positionAsOfTimestamp = positionAsOfTimestamp();
        if (positionAsOfTimestamp == -1) {
            return -1;
        }
        return Math.min(positionAsOfTimestamp + ((long) (playbackSpeed() * ((float) (j - timestamp())))), duration());
    }

    public int describeContents() {
        return 0;
    }

    public long duration() {
        return this.mDuration;
    }

    public String entityUri() {
        return contextUri();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if (r9.mTrack != null) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 3
            r0 = 1
            r7 = 6
            if (r8 != r9) goto L_0x0007
            r7 = 1
            return r0
        L_0x0007:
            boolean r1 = r9 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayerState
            r2 = 0
            r7 = 5
            if (r1 != 0) goto L_0x000f
            r7 = 5
            return r2
        L_0x000f:
            com.spotify.mobile.android.cosmos.player.v2.PlayerState r9 = (com.spotify.mobile.android.cosmos.player.v2.PlayerState) r9
            r7 = 2
            long r3 = r8.mTimestamp
            r7 = 0
            long r5 = r9.mTimestamp
            r7 = 7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 7
            if (r1 == 0) goto L_0x001e
            return r2
        L_0x001e:
            float r1 = r9.mPlaybackSpeed
            r7 = 3
            float r3 = r8.mPlaybackSpeed
            r7 = 2
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            r7 = 6
            long r3 = r8.mPositionAsOfTimestamp
            r7 = 5
            long r5 = r9.mPositionAsOfTimestamp
            r7 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0038
            r7 = 6
            return r2
        L_0x0038:
            r7 = 4
            long r3 = r8.mDuration
            r7 = 7
            long r5 = r9.mDuration
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 0
            if (r1 == 0) goto L_0x0045
            r7 = 5
            return r2
        L_0x0045:
            r7 = 0
            boolean r1 = r8.mIsPlaying
            r7 = 5
            boolean r3 = r9.mIsPlaying
            r7 = 0
            if (r1 == r3) goto L_0x004f
            return r2
        L_0x004f:
            boolean r1 = r8.mIsPaused
            r7 = 2
            boolean r3 = r9.mIsPaused
            if (r1 == r3) goto L_0x0058
            r7 = 4
            return r2
        L_0x0058:
            r7 = 0
            java.lang.String r1 = r8.mContextUri
            r7 = 0
            if (r1 == 0) goto L_0x006a
            r7 = 7
            java.lang.String r3 = r9.mContextUri
            r7 = 6
            boolean r1 = r1.equals(r3)
            r7 = 7
            if (r1 != 0) goto L_0x006f
            goto L_0x006e
        L_0x006a:
            java.lang.String r1 = r9.mContextUri
            if (r1 == 0) goto L_0x006f
        L_0x006e:
            return r2
        L_0x006f:
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r1 = r8.mPlayOrigin
            r7 = 7
            com.spotify.mobile.android.cosmos.player.v2.PlayOrigin r3 = r9.mPlayOrigin
            r7 = 7
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x007d
            r7 = 5
            return r2
        L_0x007d:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r8.mTrack
            if (r1 == 0) goto L_0x008d
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r3 = r9.mTrack
            r7 = 6
            boolean r1 = r1.equals(r3)
            r7 = 5
            if (r1 != 0) goto L_0x0094
            r7 = 6
            goto L_0x0092
        L_0x008d:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r1 = r9.mTrack
            r7 = 5
            if (r1 == 0) goto L_0x0094
        L_0x0092:
            r7 = 1
            return r2
        L_0x0094:
            r7 = 0
            java.lang.String r1 = r8.mPlaybackId
            if (r1 == 0) goto L_0x00a5
            r7 = 4
            java.lang.String r3 = r9.mPlaybackId
            r7 = 1
            boolean r1 = r1.equals(r3)
            r7 = 3
            if (r1 != 0) goto L_0x00ac
            goto L_0x00aa
        L_0x00a5:
            r7 = 3
            java.lang.String r1 = r9.mPlaybackId
            if (r1 == 0) goto L_0x00ac
        L_0x00aa:
            r7 = 3
            return r2
        L_0x00ac:
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex r1 = r8.mIndex
            r7 = 0
            if (r1 == 0) goto L_0x00bc
            r7 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex r3 = r9.mIndex
            boolean r1 = r1.equals(r3)
            r7 = 2
            if (r1 != 0) goto L_0x00c3
            goto L_0x00c2
        L_0x00bc:
            r7 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex r1 = r9.mIndex
            r7 = 5
            if (r1 == 0) goto L_0x00c3
        L_0x00c2:
            return r2
        L_0x00c3:
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptions r1 = r8.mOptions
            r7 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptions r3 = r9.mOptions
            r7 = 3
            boolean r1 = r1.equals(r3)
            r7 = 6
            if (r1 != 0) goto L_0x00d2
            r7 = 6
            return r2
        L_0x00d2:
            r7 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r1 = r8.mRestrictions
            r7 = 3
            com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions r3 = r9.mRestrictions
            r7 = 2
            boolean r1 = r1.equals(r3)
            r7 = 4
            if (r1 != 0) goto L_0x00e2
            r7 = 0
            return r2
        L_0x00e2:
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r1 = r8.mSuppressions
            r7 = 3
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r3 = r9.mSuppressions
            r7 = 1
            boolean r1 = r1.equals(r3)
            r7 = 6
            if (r1 != 0) goto L_0x00f1
            r7 = 7
            return r2
        L_0x00f1:
            r7 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r8.mFuture
            r7 = 1
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r9.mFuture
            r7 = 2
            boolean r1 = java.util.Arrays.equals(r1, r3)
            r7 = 5
            if (r1 != 0) goto L_0x0101
            r7 = 0
            return r2
        L_0x0101:
            r7 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r8.mReverse
            r7 = 7
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r9.mReverse
            r7 = 6
            boolean r1 = java.util.Arrays.equals(r1, r3)
            r7 = 2
            if (r1 != 0) goto L_0x0111
            r7 = 7
            return r2
        L_0x0111:
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r1 = r8.mContextMetadata
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r3 = r9.mContextMetadata
            r7 = 5
            boolean r1 = com.spotify.mobile.android.cosmos.player.v2.MapUtils.areMapsEqual(r1, r3)
            r7 = 6
            if (r1 != 0) goto L_0x011e
            return r2
        L_0x011e:
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r1 = r8.mPageMetadata
            r7 = 5
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> r3 = r9.mPageMetadata
            r7 = 4
            boolean r1 = com.spotify.mobile.android.cosmos.player.v2.MapUtils.areMapsEqual(r1, r3)
            r7 = 4
            if (r1 != 0) goto L_0x012d
            r7 = 0
            return r2
        L_0x012d:
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r1 = r8.mAudioStream
            r7 = 6
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r9 = r9.mAudioStream
            r7 = 7
            if (r1 == 0) goto L_0x0139
            r7 = 3
            if (r1 == r9) goto L_0x013d
            goto L_0x013c
        L_0x0139:
            r7 = 2
            if (r9 == 0) goto L_0x013d
        L_0x013c:
            return r2
        L_0x013d:
            r7 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayerState.equals(java.lang.Object):boolean");
    }

    public PlayerTrack[] future() {
        return this.mFuture;
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

    public PlayerContextIndex index() {
        return this.mIndex;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public PlayerOptions options() {
        return this.mOptions;
    }

    public Map<String, String> pageMetadata() {
        return this.mPageMetadata;
    }

    public PlayOrigin playOrigin() {
        return this.mPlayOrigin;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public float playbackSpeed() {
        return this.mPlaybackSpeed;
    }

    public long positionAsOfTimestamp() {
        return this.mPositionAsOfTimestamp;
    }

    public PlayerRestrictions restrictions() {
        return this.mRestrictions;
    }

    public PlayerTrack[] reverse() {
        return this.mReverse;
    }

    public void setClock(jtz jtz) {
        this.mClock = jtz;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public long timestamp() {
        return this.mTimestamp;
    }

    public String toString() {
        String str = "r{snoeettra=yttUlSeciPa";
        StringBuilder sb = new StringBuilder("PlayerState{contextUri=");
        sb.append(contextUri());
        String str2 = "ngimil=y sP,";
        sb.append(", isPlaying=");
        sb.append(isPlaying());
        sb.append(", isPaused=");
        sb.append(isPaused());
        String str3 = " c,bokeaSedly=ap";
        sb.append(", playbackSpeed=");
        sb.append(playbackSpeed());
        String str4 = "mepstb,amt=i";
        sb.append(", timestamp=");
        sb.append(timestamp());
        String str5 = "uad=r,btnoi";
        sb.append(", duration=");
        sb.append(duration());
        sb.append(", track=");
        sb.append(track());
        String str6 = "a ,taoetttM=taxned";
        sb.append(", contextMetadata=");
        sb.append(contextMetadata());
        String str7 = "}";
        sb.append("}");
        return sb.toString();
    }

    public PlayerTrack track() {
        return this.mTrack;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeString(this.mContextUri);
        this.mPlayOrigin.writeToParcel(parcel, 0);
        juo.a(parcel, (Parcelable) this.mTrack, 0);
        parcel.writeString(this.mPlaybackId);
        juo.a(parcel, (Parcelable) this.mIndex, 0);
        parcel.writeFloat(this.mPlaybackSpeed);
        parcel.writeLong(this.mPositionAsOfTimestamp);
        parcel.writeLong(this.mDuration);
        juo.a(parcel, this.mIsPlaying);
        juo.a(parcel, this.mIsPaused);
        this.mOptions.writeToParcel(parcel, 0);
        this.mRestrictions.writeToParcel(parcel, 0);
        this.mSuppressions.writeToParcel(parcel, 0);
        parcel.writeTypedArray(this.mFuture, 0);
        parcel.writeTypedArray(this.mReverse, 0);
        juo.a(parcel, (Map<String, String>) this.mContextMetadata);
        juo.a(parcel, (Map<String, String>) this.mPageMetadata);
        juo.a(parcel, this.mAudioStream);
    }
}
