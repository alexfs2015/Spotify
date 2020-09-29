package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayOptions implements JacksonModel {
    @JsonProperty("allow_seeking")
    private final boolean mAllowSeeking;
    @JsonProperty("always_play_something")
    private final boolean mAlwaysPlaySomething;
    @JsonProperty("audio_stream")
    private final AudioStream mAudioStream;
    @JsonProperty("configuration_override")
    private final Map<String, JsonNode> mConfigurationOverride;
    @JsonProperty("initially_paused")
    private final boolean mInitiallyPaused;
    @JsonProperty("operation")
    private final Operation mOperation;
    @JsonProperty("override_restrictions")
    private final boolean mOverrideRestrictions;
    @JsonProperty("playback_id")
    private final String mPlaybackId;
    @JsonProperty("player_options_override")
    private final PlayerOptionsOverrides mPlayerOptionsOverride;
    @JsonProperty("seek_to")
    private final Long mSeekTo;
    @JsonProperty("skip_to")
    private final PlayOptionsSkipTo mSkipTo;
    @JsonProperty("suppressions")
    private final PlayerSuppressions mSuppressions;
    @JsonProperty("system_initiated")
    private final boolean mSystemInitiated;
    @JsonProperty("trigger")
    private final Trigger mTrigger;

    public enum AudioStream {
        DEFAULT,
        ALARM;

        @JsonCreator
        public static AudioStream fromString(String str) {
            if (str != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 92895825) {
                    if (hashCode == 1544803905) {
                        String str2 = "lfstaeu";
                        if (str.equals("default")) {
                            c = 1;
                        }
                    }
                } else if (str.equals("alarm")) {
                    c = 0;
                }
                if (c == 0) {
                    return ALARM;
                }
                if (c == 1) {
                    return DEFAULT;
                }
            }
            return DEFAULT;
        }

        public final int getStreamType() {
            return this == ALARM ? 4 : 3;
        }

        public final int getUsage() {
            return this == ALARM ? 4 : 1;
        }
    }

    public static final class Builder {
        private boolean mAllowSeeking;
        private boolean mAlwaysPlaySomething;
        private AudioStream mAudioStream;
        private Map<String, JsonNode> mConfigurationOverride;
        private boolean mInitiallyPaused;
        private Operation mOperation;
        private boolean mOverrideRestrictions;
        private String mPlaybackId;
        private PlayerOptionsOverrides mPlayerOptionsOverride;
        private Long mSeekTo;
        private PlayOptionsSkipTo mSkipTo;
        private PlayerSuppressions mSuppressions;
        private boolean mSystemInitiated;
        private Trigger mTrigger;

        public final Builder allowSeeking(boolean z) {
            this.mAllowSeeking = z;
            return this;
        }

        public final Builder alwaysPlaySomething(boolean z) {
            this.mAlwaysPlaySomething = z;
            return this;
        }

        public final Builder audioStream(AudioStream audioStream) {
            this.mAudioStream = audioStream;
            return this;
        }

        public final PlayOptions build() {
            PlayOptions playOptions = r1;
            PlayOptions playOptions2 = new PlayOptions(this.mSkipTo, this.mAlwaysPlaySomething, this.mSeekTo, this.mInitiallyPaused, this.mPlayerOptionsOverride, this.mSuppressions, this.mAllowSeeking, this.mOperation, this.mTrigger, this.mPlaybackId, this.mSystemInitiated, this.mAudioStream, this.mConfigurationOverride, this.mOverrideRestrictions);
            return playOptions2;
        }

        public final Builder configurationOverride(Map<String, JsonNode> map) {
            this.mConfigurationOverride = map;
            return this;
        }

        public final Builder initiallyPaused(boolean z) {
            this.mInitiallyPaused = z;
            return this;
        }

        public final Builder operation(Operation operation) {
            this.mOperation = operation;
            return this;
        }

        public final Builder overrideRestrictions(boolean z) {
            this.mOverrideRestrictions = z;
            return this;
        }

        public final Builder playbackId(String str) {
            this.mPlaybackId = str;
            return this;
        }

        public final Builder playerOptionsOverride(PlayerOptionsOverrides playerOptionsOverrides) {
            this.mPlayerOptionsOverride = playerOptionsOverrides;
            return this;
        }

        public final Builder playerOptionsOverride(Boolean bool, Boolean bool2, Boolean bool3) {
            this.mPlayerOptionsOverride = PlayerOptionsOverrides.create(bool, bool2, bool3);
            return this;
        }

        public final Builder seekTo(Long l) {
            this.mSeekTo = l;
            return this;
        }

        public final Builder skipTo(PlayOptionsSkipTo playOptionsSkipTo) {
            this.mSkipTo = playOptionsSkipTo;
            return this;
        }

        public final Builder skipTo(String str, int i, String str2, String str3, int i2) {
            PlayOptionsSkipTo playOptionsSkipTo = r0;
            String str4 = str;
            int i3 = i;
            String str5 = str2;
            String str6 = str3;
            int i4 = i2;
            PlayOptionsSkipTo playOptionsSkipTo2 = new PlayOptionsSkipTo(str, i, str2, str3, i2);
            return skipTo(playOptionsSkipTo2);
        }

        public final Builder skipToIndex(int i, int i2) {
            PlayOptionsSkipTo playOptionsSkipTo = r0;
            int i3 = i;
            int i4 = i2;
            PlayOptionsSkipTo playOptionsSkipTo2 = new PlayOptionsSkipTo(null, i, null, null, i2);
            return skipTo(playOptionsSkipTo2);
        }

        public final Builder suppressions(PlayerSuppressions playerSuppressions) {
            this.mSuppressions = playerSuppressions;
            return this;
        }

        public final Builder suppressions(String... strArr) {
            this.mSuppressions = new PlayerSuppressions(Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr))));
            return this;
        }

        public final Builder systemInitiated(boolean z) {
            this.mSystemInitiated = z;
            return this;
        }

        public final Builder trigger(Trigger trigger) {
            this.mTrigger = trigger;
            return this;
        }
    }

    public enum Operation {
        REPLACE,
        ENQUEUE,
        PUSH;

        @JsonCreator
        public static Operation fromString(String str) {
            if (str != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1594257912) {
                    if (hashCode == 3452698) {
                        String str2 = "upsh";
                        if (str.equals("push")) {
                            c = 0;
                        }
                    } else if (hashCode == 1094496948) {
                        if (str.equals("replace")) {
                            c = 2;
                        }
                    }
                } else if (str.equals("enqueue")) {
                    c = 1;
                }
                if (c == 0) {
                    return PUSH;
                }
                if (c == 1) {
                    return ENQUEUE;
                }
                if (c == 2) {
                    return REPLACE;
                }
            }
            return REPLACE;
        }
    }

    public enum Trigger {
        IMMEDIATELY,
        ADVANCE_PAST_TRACK,
        ADVANCE_PAST_CONTEXT;

        @JsonCreator
        public static Trigger fromString(String str) {
            if (str != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1800037122) {
                    if (hashCode != 123455259) {
                        if (hashCode == 400349055) {
                            if (str.equals("advanced_past_context")) {
                                c = 2;
                            }
                        }
                    } else if (str.equals("advanced_past_track")) {
                        c = 1;
                    }
                } else if (str.equals("immediately")) {
                    c = 0;
                }
                if (c == 0) {
                    return IMMEDIATELY;
                }
                if (c == 1) {
                    return ADVANCE_PAST_TRACK;
                }
                if (c == 2) {
                    return ADVANCE_PAST_CONTEXT;
                }
            }
            return IMMEDIATELY;
        }
    }

    @JsonCreator
    private PlayOptions(@JsonProperty("skip_to") PlayOptionsSkipTo playOptionsSkipTo, @JsonProperty("always_play_something") boolean z, @JsonProperty("seek_to") Long l, @JsonProperty("initially_paused") boolean z2, @JsonProperty("player_options_override") PlayerOptionsOverrides playerOptionsOverrides, @JsonProperty("suppressions") PlayerSuppressions playerSuppressions, @JsonProperty("allow_seeking") boolean z3, @JsonProperty("operation") Operation operation, @JsonProperty("trigger") Trigger trigger, @JsonProperty("playback_id") String str, @JsonProperty("system_initiated") boolean z4, @JsonProperty("audio_stream") AudioStream audioStream, @JsonProperty("configuration_override") Map<String, JsonNode> map, @JsonProperty("override_restrictions") boolean z5) {
        this.mSkipTo = playOptionsSkipTo;
        this.mAlwaysPlaySomething = z;
        this.mSeekTo = l;
        this.mInitiallyPaused = z2;
        this.mPlayerOptionsOverride = playerOptionsOverrides;
        this.mSuppressions = playerSuppressions;
        this.mAllowSeeking = z3;
        this.mOperation = operation;
        this.mTrigger = trigger;
        this.mPlaybackId = str;
        this.mSystemInitiated = z4;
        this.mAudioStream = audioStream;
        this.mConfigurationOverride = map;
        this.mOverrideRestrictions = z5;
    }

    public boolean allowSeeking() {
        return this.mAllowSeeking;
    }

    public boolean alwaysPlaySomething() {
        return this.mAlwaysPlaySomething;
    }

    public AudioStream audioStream() {
        return this.mAudioStream;
    }

    public Map<String, JsonNode> configurationOverride() {
        return this.mConfigurationOverride;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        if (r6.mSeekTo != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008b, code lost:
        if (r6.mPlaybackId != null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a4, code lost:
        if (r6.mPlayerOptionsOverride != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bc, code lost:
        if (r6.mSuppressions != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ea, code lost:
        if (r6.mOperation != null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00fd, code lost:
        if (r6.mAudioStream != null) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r0 = 1
            r4 = 6
            if (r5 != r6) goto L_0x0007
            r4 = 4
            return r0
        L_0x0007:
            r4 = 0
            boolean r1 = r6 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayOptions
            r4 = 3
            r2 = 0
            if (r1 != 0) goto L_0x0010
            r4 = 6
            return r2
        L_0x0010:
            r4 = 7
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r6 = (com.spotify.mobile.android.cosmos.player.v2.PlayOptions) r6
            r4 = 0
            boolean r1 = r5.mInitiallyPaused
            r4 = 5
            boolean r3 = r6.mInitiallyPaused
            r4 = 4
            if (r1 == r3) goto L_0x001e
            r4 = 7
            return r2
        L_0x001e:
            r4 = 4
            boolean r1 = r5.mSystemInitiated
            r4 = 5
            boolean r3 = r6.mSystemInitiated
            r4 = 6
            if (r1 == r3) goto L_0x0029
            r4 = 6
            return r2
        L_0x0029:
            boolean r1 = r5.mAllowSeeking
            r4 = 7
            boolean r3 = r6.mAllowSeeking
            r4 = 5
            if (r1 == r3) goto L_0x0033
            r4 = 1
            return r2
        L_0x0033:
            r4 = 3
            boolean r1 = r5.mOverrideRestrictions
            r4 = 6
            boolean r3 = r6.mOverrideRestrictions
            if (r1 == r3) goto L_0x003d
            r4 = 4
            return r2
        L_0x003d:
            r4 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r1 = r5.mSkipTo
            r4 = 4
            if (r1 == 0) goto L_0x004e
            r4 = 0
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r3 = r6.mSkipTo
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 != 0) goto L_0x0055
            goto L_0x0053
        L_0x004e:
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r1 = r6.mSkipTo
            r4 = 6
            if (r1 == 0) goto L_0x0055
        L_0x0053:
            r4 = 4
            return r2
        L_0x0055:
            boolean r1 = r5.mAlwaysPlaySomething
            r4 = 6
            boolean r3 = r6.mAlwaysPlaySomething
            r4 = 5
            if (r1 == r3) goto L_0x005f
            r4 = 0
            return r2
        L_0x005f:
            java.lang.Long r1 = r5.mSeekTo
            r4 = 4
            if (r1 == 0) goto L_0x006f
            java.lang.Long r3 = r6.mSeekTo
            r4 = 5
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0076
            r4 = 4
            goto L_0x0074
        L_0x006f:
            r4 = 2
            java.lang.Long r1 = r6.mSeekTo
            if (r1 == 0) goto L_0x0076
        L_0x0074:
            r4 = 6
            return r2
        L_0x0076:
            r4 = 6
            java.lang.String r1 = r5.mPlaybackId
            r4 = 0
            if (r1 == 0) goto L_0x0088
            java.lang.String r3 = r6.mPlaybackId
            r4 = 2
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 != 0) goto L_0x008f
            r4 = 7
            goto L_0x008d
        L_0x0088:
            java.lang.String r1 = r6.mPlaybackId
            r4 = 1
            if (r1 == 0) goto L_0x008f
        L_0x008d:
            r4 = 5
            return r2
        L_0x008f:
            r4 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r1 = r5.mPlayerOptionsOverride
            r4 = 1
            if (r1 == 0) goto L_0x00a1
            r4 = 3
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r3 = r6.mPlayerOptionsOverride
            r4 = 3
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a8
            r4 = 7
            goto L_0x00a6
        L_0x00a1:
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r1 = r6.mPlayerOptionsOverride
            r4 = 5
            if (r1 == 0) goto L_0x00a8
        L_0x00a6:
            r4 = 7
            return r2
        L_0x00a8:
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r1 = r5.mSuppressions
            if (r1 == 0) goto L_0x00b8
            r4 = 6
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r3 = r6.mSuppressions
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 != 0) goto L_0x00c0
            r4 = 6
            goto L_0x00be
        L_0x00b8:
            r4 = 1
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r1 = r6.mSuppressions
            r4 = 2
            if (r1 == 0) goto L_0x00c0
        L_0x00be:
            r4 = 7
            return r2
        L_0x00c0:
            r4 = 7
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> r1 = r5.mConfigurationOverride
            r4 = 3
            if (r1 == 0) goto L_0x00d2
            r4 = 0
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> r3 = r6.mConfigurationOverride
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 != 0) goto L_0x00da
            goto L_0x00d8
        L_0x00d2:
            r4 = 6
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> r1 = r6.mConfigurationOverride
            r4 = 7
            if (r1 == 0) goto L_0x00da
        L_0x00d8:
            r4 = 7
            return r2
        L_0x00da:
            r4 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Operation r1 = r5.mOperation
            r4 = 5
            if (r1 == 0) goto L_0x00e6
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Operation r3 = r6.mOperation
            if (r1 == r3) goto L_0x00ee
            r4 = 7
            goto L_0x00ec
        L_0x00e6:
            r4 = 5
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Operation r1 = r6.mOperation
            r4 = 4
            if (r1 == 0) goto L_0x00ee
        L_0x00ec:
            r4 = 4
            return r2
        L_0x00ee:
            r4 = 0
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r1 = r5.mAudioStream
            if (r1 == 0) goto L_0x00fa
            r4 = 4
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r3 = r6.mAudioStream
            if (r1 == r3) goto L_0x0101
            r4 = 3
            goto L_0x00ff
        L_0x00fa:
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r1 = r6.mAudioStream
            r4 = 6
            if (r1 == 0) goto L_0x0101
        L_0x00ff:
            r4 = 7
            return r2
        L_0x0101:
            r4 = 5
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Trigger r1 = r5.mTrigger
            r4 = 2
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Trigger r6 = r6.mTrigger
            r4 = 0
            if (r1 == 0) goto L_0x0111
            r4 = 1
            if (r1 != r6) goto L_0x010f
            r4 = 5
            return r0
        L_0x010f:
            r4 = 3
            return r2
        L_0x0111:
            if (r6 != 0) goto L_0x0115
            r4 = 0
            return r0
        L_0x0115:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.PlayOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        PlayOptionsSkipTo playOptionsSkipTo = this.mSkipTo;
        int i = 0;
        int hashCode = (((playOptionsSkipTo != null ? playOptionsSkipTo.hashCode() : 0) * 31) + (this.mAlwaysPlaySomething ? 1 : 0)) * 31;
        Long l = this.mSeekTo;
        int hashCode2 = (((hashCode + (l != null ? l.hashCode() : 0)) * 31) + (this.mInitiallyPaused ? 1 : 0)) * 31;
        PlayerOptionsOverrides playerOptionsOverrides = this.mPlayerOptionsOverride;
        int hashCode3 = (hashCode2 + (playerOptionsOverrides != null ? playerOptionsOverrides.hashCode() : 0)) * 31;
        PlayerSuppressions playerSuppressions = this.mSuppressions;
        int hashCode4 = (((hashCode3 + (playerSuppressions != null ? playerSuppressions.hashCode() : 0)) * 31) + (this.mAllowSeeking ? 1 : 0)) * 31;
        Operation operation = this.mOperation;
        int hashCode5 = (hashCode4 + (operation != null ? operation.hashCode() : 0)) * 31;
        Trigger trigger = this.mTrigger;
        int hashCode6 = (hashCode5 + (trigger != null ? trigger.hashCode() : 0)) * 31;
        String str = this.mPlaybackId;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        AudioStream audioStream = this.mAudioStream;
        int hashCode8 = (((hashCode7 + (audioStream != null ? audioStream.hashCode() : 0)) * 31) + (this.mSystemInitiated ? 1 : 0)) * 31;
        Map<String, JsonNode> map = this.mConfigurationOverride;
        if (map != null) {
            i = map.hashCode();
        }
        return ((hashCode8 + i) * 31) + (this.mOverrideRestrictions ? 1 : 0);
    }

    public boolean initiallyPaused() {
        return this.mInitiallyPaused;
    }

    public Operation operation() {
        return this.mOperation;
    }

    public boolean overrideRestrictions() {
        return this.mOverrideRestrictions;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public PlayerOptionsOverrides playerOptionsOverride() {
        return this.mPlayerOptionsOverride;
    }

    public Long seekTo() {
        return this.mSeekTo;
    }

    public PlayOptionsSkipTo skipTo() {
        return this.mSkipTo;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public boolean systemInitiated() {
        return this.mSystemInitiated;
    }

    public Trigger trigger() {
        return this.mTrigger;
    }
}
