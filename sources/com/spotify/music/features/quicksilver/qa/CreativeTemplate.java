package com.spotify.music.features.quicksilver.qa;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class CreativeTemplate implements Parcelable, JacksonModel {
    @JsonProperty("id")
    public abstract int getId();

    @JsonProperty("name")
    public abstract String getName();

    @JsonProperty("template")
    public abstract String getTemplate();

    @JsonProperty("type")
    public abstract String getType();

    @JsonProperty("version")
    public abstract String getVersion();

    @JsonCreator
    public static CreativeTemplate create(@JsonProperty("id") int i, @JsonProperty("template") String str, @JsonProperty("type") String str2, @JsonProperty("version") String str3, @JsonProperty("name") String str4) {
        AutoValue_CreativeTemplate autoValue_CreativeTemplate = new AutoValue_CreativeTemplate(i, str, str2, str3, str4);
        return autoValue_CreativeTemplate;
    }
}
