package com.spotify.music.features.speakercompanion.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class EntityFeedback implements Parcelable, JacksonModel {
    @JsonCreator
    public static EntityFeedback create(@JsonProperty("uid") String str, @JsonProperty("entityUri") String str2, @JsonProperty("title") String str3, @JsonProperty("imageUri") String str4, @JsonProperty("actionUri") String str5) {
        AutoValue_EntityFeedback autoValue_EntityFeedback = new AutoValue_EntityFeedback(str, str2, str3, str4, str5);
        return autoValue_EntityFeedback;
    }

    public abstract String actionUri();

    public abstract String entityUri();

    public abstract String imageUri();

    public abstract String title();

    public abstract String uid();
}
