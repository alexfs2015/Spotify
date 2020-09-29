package com.spotify.music.features.pushnotifications.inapppreference.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Category implements JacksonModel {
    @JsonCreator
    public static Category create(@JsonProperty("name") String str, @JsonProperty("prefs") List<NotificationV2> list) {
        return new AutoValue_Category(str, list);
    }

    public abstract String getName();

    public abstract List<NotificationV2> getPreferences();
}
