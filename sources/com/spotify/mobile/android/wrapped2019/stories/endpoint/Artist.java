package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.wrapped2019.v1.proto.Entity;

public abstract class Artist implements Parcelable, JacksonModel {
    @JsonCreator
    public static Artist create(@JsonProperty("name") String str, @JsonProperty("imageUrl") String str2) {
        return new AutoValue_Artist(str, str2);
    }

    public static Artist fromProto(Entity entity) {
        return create(entity.d, entity.e);
    }

    @JsonProperty("imageUrl")
    public abstract String imageUrl();

    @JsonProperty("name")
    public abstract String name();
}
