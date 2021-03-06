package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class LinksModel implements Parcelable, JacksonModel {
    @JsonProperty("facebook")
    public abstract String getFacebookLink();

    @JsonProperty("instagram")
    public abstract String getInstagramLink();

    @JsonProperty("twitter")
    public abstract String getTwitterLink();

    @JsonProperty("wikipedia")
    public abstract String getWikipediaLink();

    @JsonCreator
    public static LinksModel create(@JsonProperty("twitter") String str, @JsonProperty("instagram") String str2, @JsonProperty("wikipedia") String str3, @JsonProperty("facebook") String str4) {
        return new AutoValue_LinksModel(str, str2, str3, str4);
    }
}
