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

        public final int getStreamType() {
            return this == ALARM ? 4 : 3;
        }

        public final int getUsage() {
            return this == ALARM ? 4 : 1;
        }

        @JsonCreator
        public static AudioStream fromString(String str) {
            if (str != null) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 92895825) {
                    if (hashCode == 1544803905 && str.equals("default")) {
                        c = 1;
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

        public final Builder skipTo(PlayOptionsSkipTo playOptionsSkipTo) {
            this.mSkipTo = playOptionsSkipTo;
            return this;
        }

        public final Builder skipTo(String str, int i, String str2, String str3, int i2) {
            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(str, i, str2, str3, i2);
            return skipTo(playOptionsSkipTo);
        }

        public final Builder skipToIndex(int i, int i2) {
            PlayOptionsSkipTo playOptionsSkipTo = new PlayOptionsSkipTo(null, i, null, null, i2);
            return skipTo(playOptionsSkipTo);
        }

        public final Builder alwaysPlaySomething(boolean z) {
            this.mAlwaysPlaySomething = z;
            return this;
        }

        public final Builder seekTo(Long l) {
            this.mSeekTo = l;
            return this;
        }

        public final Builder initiallyPaused(boolean z) {
            this.mInitiallyPaused = z;
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

        public final Builder allowSeeking(boolean z) {
            this.mAllowSeeking = z;
            return this;
        }

        public final Builder suppressions(PlayerSuppressions playerSuppressions) {
            this.mSuppressions = playerSuppressions;
            return this;
        }

        public final Builder suppressions(String... strArr) {
            this.mSuppressions = new PlayerSuppressions(Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr))));
            return this;
        }

        public final Builder operation(Operation operation) {
            this.mOperation = operation;
            return this;
        }

        public final Builder playbackId(String str) {
            this.mPlaybackId = str;
            return this;
        }

        public final Builder trigger(Trigger trigger) {
            this.mTrigger = trigger;
            return this;
        }

        public final Builder systemInitiated(boolean z) {
            this.mSystemInitiated = z;
            return this;
        }

        public final Builder configurationOverride(Map<String, JsonNode> map) {
            this.mConfigurationOverride = map;
            return this;
        }

        public final Builder audioStream(AudioStream audioStream) {
            this.mAudioStream = audioStream;
            return this;
        }

        public final Builder overrideRestrictions(boolean z) {
            this.mOverrideRestrictions = z;
            return this;
        }

        public final PlayOptions build() {
            PlayOptions playOptions = new PlayOptions(this.mSkipTo, this.mAlwaysPlaySomething, this.mSeekTo, this.mInitiallyPaused, this.mPlayerOptionsOverride, this.mSuppressions, this.mAllowSeeking, this.mOperation, this.mTrigger, this.mPlaybackId, this.mSystemInitiated, this.mAudioStream, this.mConfigurationOverride, this.mOverrideRestrictions);
            return playOptions;
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
                    if (hashCode != 3452698) {
                        if (hashCode == 1094496948 && str.equals("replace")) {
                            c = 2;
                        }
                    } else if (str.equals("push")) {
                        c = 0;
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
                        if (hashCode == 400349055 && str.equals("advanced_past_context")) {
                            c = 2;
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

    public PlayOptionsSkipTo skipTo() {
        return this.mSkipTo;
    }

    public boolean alwaysPlaySomething() {
        return this.mAlwaysPlaySomething;
    }

    public Long seekTo() {
        return this.mSeekTo;
    }

    public boolean initiallyPaused() {
        return this.mInitiallyPaused;
    }

    public PlayerOptionsOverrides playerOptionsOverride() {
        return this.mPlayerOptionsOverride;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public boolean allowSeeking() {
        return this.mAllowSeeking;
    }

    public Operation operation() {
        return this.mOperation;
    }

    public Trigger trigger() {
        return this.mTrigger;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public boolean systemInitiated() {
        return this.mSystemInitiated;
    }

    public AudioStream audioStream() {
        return this.mAudioStream;
    }

    public Map<String, JsonNode> configurationOverride() {
        return this.mConfigurationOverride;
    }

    public boolean overrideRestrictions() {
        return this.mOverrideRestrictions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayOptions)) {
            return false;
        }
        PlayOptions playOptions = (PlayOptions) obj;
        if (this.mInitiallyPaused != playOptions.mInitiallyPaused || this.mSystemInitiated != playOptions.mSystemInitiated || this.mAllowSeeking != playOptions.mAllowSeeking || this.mOverrideRestrictions != playOptions.mOverrideRestrictions) {
            return false;
        }
        PlayOptionsSkipTo playOptionsSkipTo = this.mSkipTo;
        if (playOptionsSkipTo == null ? playOptions.mSkipTo != null : !playOptionsSkipTo.equals(playOptions.mSkipTo)) {
            return false;
        }
        if (this.mAlwaysPlaySomething != playOptions.mAlwaysPlaySomething) {
            return false;
        }
        Long l = this.mSeekTo;
        if (l == null ? playOptions.mSeekTo != null : !l.equals(playOptions.mSeekTo)) {
            return false;
        }
        String str = this.mPlaybackId;
        if (str == null ? playOptions.mPlaybackId != null : !str.equals(playOptions.mPlaybackId)) {
            return false;
        }
        PlayerOptionsOverrides playerOptionsOverrides = this.mPlayerOptionsOverride;
        if (playerOptionsOverrides == null ? playOptions.mPlayerOptionsOverride != null : !playerOptionsOverrides.equals(playOptions.mPlayerOptionsOverride)) {
            return false;
        }
        PlayerSuppressions playerSuppressions = this.mSuppressions;
        if (playerSuppressions == null ? playOptions.mSuppressions != null : !playerSuppressions.equals(playOptions.mSuppressions)) {
            return false;
        }
        Map<String, JsonNode> map = this.mConfigurationOverride;
        if (map == null ? playOptions.mConfigurationOverride != null : !map.equals(playOptions.mConfigurationOverride)) {
            return false;
        }
        Operation operation = this.mOperation;
        if (operation == null ? playOptions.mOperation != null : operation != playOptions.mOperation) {
            return false;
        }
        AudioStream audioStream = this.mAudioStream;
        if (audioStream == null ? playOptions.mAudioStream != null : audioStream != playOptions.mAudioStream) {
            return false;
        }
        Trigger trigger = this.mTrigger;
        Trigger trigger2 = playOptions.mTrigger;
        return trigger != null ? trigger == trigger2 : trigger2 == null;
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
}
