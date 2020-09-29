package com.spotify.music.features.quicksilver.triggers.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.regex.Pattern;

@JsonTypeName("PLAYBACK_STARTED")
public abstract class PlaybackStartedTrigger implements JacksonModel, prk {
    private Pattern mWildcardPattern;

    public interface a {
    }

    @JsonProperty("format")
    public abstract String getFormat();

    @JsonProperty("pattern")
    public abstract String getPattern();

    public String getType() {
        return "PLAYBACK_STARTED";
    }

    @JsonProperty("cache")
    public abstract boolean isCache();

    public abstract a toBuilder();

    @JsonCreator
    public static PlaybackStartedTrigger create(@JsonProperty("pattern") String str, @JsonProperty("cache") boolean z, @JsonProperty("format") String str2) {
        AutoValue_PlaybackStartedTrigger autoValue_PlaybackStartedTrigger = new AutoValue_PlaybackStartedTrigger(str, z, str2);
        StringBuilder sb = new StringBuilder("^");
        sb.append(str);
        sb.append('$');
        autoValue_PlaybackStartedTrigger.mWildcardPattern = Pattern.compile(sb.toString().replace("?", "([a-zA-Z0-9]*)"));
        return autoValue_PlaybackStartedTrigger;
    }

    public static a builder() {
        return new a();
    }

    @JsonIgnore
    public String getTriggerString() {
        return getPattern();
    }

    public boolean matches(String str) {
        return this.mWildcardPattern.matcher(str).matches();
    }
}
