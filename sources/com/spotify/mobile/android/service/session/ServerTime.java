package com.spotify.mobile.android.service.session;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class ServerTime implements Parcelable, JacksonModel {
    public abstract long currentServerTime();

    public abstract long currentTimeMillis();

    @JsonCreator
    public static ServerTime create(@JsonProperty("current_time_millis") long j, @JsonProperty("current_server_time") long j2) {
        return new AutoValue_ServerTime(j, j2);
    }
}
