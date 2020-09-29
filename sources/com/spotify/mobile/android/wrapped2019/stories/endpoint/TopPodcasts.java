package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.wrapped2019.v1.proto.PodcastsStory;

public abstract class TopPodcasts implements Parcelable, JacksonModel {
    @JsonCreator
    public static TopPodcasts create(@JsonProperty("previewUrl") String str, @JsonProperty("caption") String str2, @JsonProperty("top") TopPodcastsTop topPodcastsTop, @JsonProperty("stats") TopPodcastsStats topPodcastsStats) {
        return new AutoValue_TopPodcasts(str, str2, topPodcastsTop, topPodcastsStats);
    }

    public static TopPodcasts fromProto(PodcastsStory podcastsStory) {
        return create(podcastsStory.d, podcastsStory.e, TopPodcastsTop.fromProto(podcastsStory.k()), TopPodcastsStats.fromProto(podcastsStory.l()));
    }

    @JsonProperty("caption")
    public abstract String caption();

    @JsonProperty("previewUrl")
    public abstract String previewUrl();

    @JsonProperty("stats")
    public abstract TopPodcastsStats stats();

    @JsonProperty("top")
    public abstract TopPodcastsTop top();
}
