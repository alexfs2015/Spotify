package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ActionParameters<T> implements JacksonModel {
    @JsonProperty("logging_params")
    public final LoggingParameters loggingParams = LoggingParameters.createWithCurrentTimestamp();
    @JsonProperty("value")
    public T value;
}
