package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextPlayerConfiguration implements JacksonModel {
    public static final String PREFS_KEY_PLAYBACK_SPEED = "audio.episode.speed";
    public static final String PREFS_KEY_VIDEO_SUBTITLES = "video.subtitles";
    public static final String PREFS_KEY_VIDEO_SUBTITLES_CC = "video.subtitles_cc";
    private final Boolean mIsClosedCaption;
    private final String mLocale;
    private final Float mPlaybackSpeed;

    @JsonCreator
    public ContextPlayerConfiguration(@JsonProperty(defaultValue = "", value = "video.subtitles") String str, @JsonProperty("video.subtitles_cc") Boolean bool, @JsonProperty("audio.episode.speed") Float f) {
        this.mLocale = str;
        this.mIsClosedCaption = bool;
        this.mPlaybackSpeed = f;
    }

    @JsonProperty(defaultValue = "", value = "video.subtitles")
    public String getLocale() {
        String str = this.mLocale;
        return str != null ? str : "";
    }

    @JsonProperty("video.subtitles_cc")
    public boolean isClosedCaption() {
        return this.mIsClosedCaption.booleanValue();
    }

    @JsonProperty("audio.episode.speed")
    public Optional<Float> getPlaybackSpeed() {
        return Optional.c(this.mPlaybackSpeed);
    }

    public boolean hasSubtitle() {
        return (this.mLocale == null || this.mIsClosedCaption == null) ? false : true;
    }

    public jyi getSubtitle() {
        return new jyi(this.mLocale, this.mIsClosedCaption.booleanValue());
    }

    public static ContextPlayerConfiguration fromSubtitle(jyi jyi) {
        return new ContextPlayerConfiguration(jyi.b, Boolean.valueOf(jyi.c), null);
    }
}
