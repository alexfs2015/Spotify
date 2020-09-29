package com.spotify.music.features.quicksilver.triggers.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.regex.Pattern;

@JsonTypeName("URI")
public abstract class UriTrigger implements JacksonModel, qag {
    private Pattern mWildcardPattern;

    public interface a {
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static UriTrigger create(@JsonProperty("pattern") String str, @JsonProperty("cache") boolean z, @JsonProperty("format") String str2) {
        AutoValue_UriTrigger autoValue_UriTrigger = new AutoValue_UriTrigger(str, z, str2);
        StringBuilder sb = new StringBuilder("^");
        sb.append(str);
        sb.append('$');
        autoValue_UriTrigger.mWildcardPattern = Pattern.compile(sb.toString().replace("?", "([a-zA-Z0-9~`!@#\\$%\\^&\\*\\(\\)_\\-\\+={\\[\\}\\]\\|\\;\"'<,>\\.\\?\\/  ]*)"));
        return autoValue_UriTrigger;
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
        return "URI";
    }

    @JsonProperty("cache")
    public abstract boolean isCache();

    public boolean matches(String str) {
        return this.mWildcardPattern.matcher(str).matches();
    }

    public abstract a toBuilder();
}
