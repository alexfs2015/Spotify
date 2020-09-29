package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class TopPodcastsTop implements Parcelable, JacksonModel {
    @JsonProperty("caption")
    public abstract String caption();

    @JsonProperty("podcasts")
    public abstract List<Podcast> podcasts();

    @JsonCreator
    public static TopPodcastsTop create(@JsonProperty("caption") String str, @JsonProperty("podcasts") List<Podcast> list) {
        return new AutoValue_TopPodcastsTop(str, list);
    }
}
