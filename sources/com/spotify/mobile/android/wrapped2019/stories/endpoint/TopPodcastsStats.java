package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

public abstract class TopPodcastsStats implements Parcelable, JacksonModel {
    @JsonProperty("imageUrl")
    public abstract String imageUrl();

    @JsonProperty("paragraph1")
    public abstract StoryParagraph paragraph1();

    @JsonProperty("paragraph2")
    public abstract StoryParagraph paragraph2();

    @JsonCreator
    public static TopPodcastsStats create(@JsonProperty("imageUrl") String str, @JsonProperty("paragraph1") StoryParagraph storyParagraph, @JsonProperty("paragraph2") StoryParagraph storyParagraph2) {
        return new AutoValue_TopPodcastsStats(str, storyParagraph, storyParagraph2);
    }
}
