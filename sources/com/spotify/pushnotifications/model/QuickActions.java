package com.spotify.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuickActions implements JacksonModel {
    public abstract List<QuickAction> actions();

    public abstract String category();

    @JsonCreator
    public static QuickActions create(@JsonProperty("category") String str, @JsonProperty("actions") List<QuickAction> list) {
        return new AutoValue_QuickActions(str, list);
    }
}
