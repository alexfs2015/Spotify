package com.spotify.music.features.quicksilver.triggers.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonTypeName("CLIENT_EVENT")
public abstract class ClientEventTrigger implements JacksonModel, qag {

    public interface a {
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static ClientEventTrigger create(@JsonProperty("pattern") String str, @JsonProperty("cache") boolean z, @JsonProperty("format") String str2) {
        return new AutoValue_ClientEventTrigger(str, z, str2);
    }

    @JsonProperty("format")
    public abstract String getFormat();

    @JsonProperty("pattern")
    public abstract String getPattern();

    @JsonIgnore
    public String getTriggerString() {
        return getPattern();
    }

    public String getType() {
        return "CLIENT_EVENT";
    }

    @JsonProperty("cache")
    public abstract boolean isCache();

    public boolean matches(String str) {
        return getPattern().equals(str);
    }

    public abstract a toBuilder();
}
