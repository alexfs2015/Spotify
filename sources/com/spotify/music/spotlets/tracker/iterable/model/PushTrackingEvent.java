package com.spotify.music.spotlets.tracker.iterable.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PushTrackingEvent implements JacksonModel {
    public static final String PUSH_OPEN_EVENT = "pushOpen";

    public abstract String getEnvironment();

    public abstract Map<String, ?> getEventData();

    public abstract String getEventName();

    public abstract String getPlatform();

    @JsonCreator
    public static PushTrackingEvent create(@JsonProperty("eventName") String str, @JsonProperty("platform") String str2, @JsonProperty("environment") String str3, @JsonProperty("eventData") Map<String, ?> map) {
        return new AutoValue_PushTrackingEvent(str, str2, str3, map);
    }
}
