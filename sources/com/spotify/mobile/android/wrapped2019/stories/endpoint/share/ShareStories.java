package com.spotify.mobile.android.wrapped2019.stories.endpoint.share;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class ShareStories implements Parcelable, JacksonModel {
    @JsonCreator
    public static ShareStories create(@JsonProperty("share_uri") String str, @JsonProperty("query_parameters") List<QueryParameter> list, @JsonProperty("image_url") String str2) {
        return new AutoValue_ShareStories(str, list, str2);
    }

    @JsonProperty("image_url")
    public abstract String imageUrl();

    @JsonProperty("query_parameters")
    public abstract List<QueryParameter> queryParameters();

    @JsonProperty("share_uri")
    public abstract String shareUri();
}
