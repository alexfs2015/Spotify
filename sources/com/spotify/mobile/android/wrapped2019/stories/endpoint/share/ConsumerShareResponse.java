package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class ConsumerShareResponse implements Parcelable, JacksonModel {
    @JsonCreator
    public static ConsumerShareResponse create(@JsonProperty("stories") ShareStories shareStories, @JsonProperty("messaging") ShareMessaging shareMessaging, @JsonProperty("preview_image_url") String str) {
        return new AutoValue_ConsumerShareResponse(shareStories, shareMessaging, str);
    }

    @JsonProperty("messaging")
    public abstract ShareMessaging messaging();

    @JsonProperty("preview_image_url")
    public abstract String previewImageUrl();

    @JsonProperty("stories")
    public abstract ShareStories stories();
}
