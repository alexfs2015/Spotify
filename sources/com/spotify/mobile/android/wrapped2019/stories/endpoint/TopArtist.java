package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.wrapped2019.v1.proto.TopArtistStory;

public abstract class TopArtist implements Parcelable, JacksonModel {
    @JsonCreator
    public static TopArtist create(@JsonProperty("previewUrl") String str, @JsonProperty("caption") String str2, @JsonProperty("amountStreamed") StoryParagraph storyParagraph, @JsonProperty("favoriteSong") StoryParagraph storyParagraph2, @JsonProperty("artist") Artist artist) {
        String str3 = str;
        StoryParagraph storyParagraph3 = storyParagraph;
        StoryParagraph storyParagraph4 = storyParagraph2;
        Artist artist2 = artist;
        AutoValue_TopArtist autoValue_TopArtist = new AutoValue_TopArtist(str, str2, storyParagraph, storyParagraph2, artist);
        return autoValue_TopArtist;
    }

    public static TopArtist fromProto(TopArtistStory topArtistStory) {
        return create(topArtistStory.d, topArtistStory.e, StoryParagraph.fromProto(topArtistStory.k()), StoryParagraph.fromProto(topArtistStory.l()), Artist.fromProto(topArtistStory.m()));
    }

    @JsonProperty("amountStreamed")
    public abstract StoryParagraph amountStreamed();

    @JsonProperty("artist")
    public abstract Artist artist();

    @JsonProperty("caption")
    public abstract String caption();

    @JsonProperty("favoriteSong")
    public abstract StoryParagraph favoriteSong();

    @JsonProperty("previewUrl")
    public abstract String previewUrl();
}
