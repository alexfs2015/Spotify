package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConsumerResponse implements Parcelable, JacksonModel {
    @JsonProperty("order")
    public abstract List<String> order();

    @JsonProperty("topArtist")
    public abstract TopArtist topArtist();

    @JsonProperty("podcasts")
    public abstract TopPodcasts topPodcasts();

    @JsonCreator
    public static ConsumerResponse create(@JsonProperty("order") List<String> list, @JsonProperty("topArtist") TopArtist topArtist, @JsonProperty("podcasts") TopPodcasts topPodcasts) {
        return new AutoValue_ConsumerResponse(list, topArtist, topPodcasts);
    }
}
