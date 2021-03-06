package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Autobiography implements Parcelable, JacksonModel {
    @JsonProperty("body")
    public abstract String body();

    @JsonProperty("links")
    public abstract LinksModel links();

    @JsonProperty("urls")
    public abstract List<String> urls();

    @JsonCreator
    public static Autobiography create(@JsonProperty("body") String str, @JsonProperty("urls") List<String> list, @JsonProperty("links") LinksModel linksModel) {
        return new AutoValue_Autobiography(str, gbp.a(list), linksModel);
    }
}
