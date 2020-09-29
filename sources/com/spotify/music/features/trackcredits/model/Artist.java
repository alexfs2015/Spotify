package com.spotify.music.features.trackcredits.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Artist implements JacksonModel {
    public abstract String name();

    public abstract List<String> subroles();

    public abstract String uri();

    public abstract double weight();

    @JsonCreator
    public static Artist create(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("subroles") List<String> list, @JsonProperty("weight") double d) {
        AutoValue_Artist autoValue_Artist = new AutoValue_Artist(str, str2, list, d);
        return autoValue_Artist;
    }
}
