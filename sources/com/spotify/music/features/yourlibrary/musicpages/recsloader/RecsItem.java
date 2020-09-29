package com.spotify.music.features.yourlibrary.musicpages.recsloader;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsItem implements JacksonModel {
    @JsonCreator
    public static RecsItem create(@JsonProperty("id") String str, @JsonProperty("name") String str2, @JsonProperty("image_url") String str3, @JsonProperty("large_image_url") String str4) {
        return new AutoValue_RecsItem(str, str2, str3, str4);
    }

    @JsonProperty("id")
    public abstract String id();

    @JsonProperty("image_url")
    public abstract String imageUrl();

    @JsonProperty("large_image_url")
    public abstract String largeImageUrl();

    @JsonProperty("name")
    public abstract String name();
}
