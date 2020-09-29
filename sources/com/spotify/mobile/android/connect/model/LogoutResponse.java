package com.spotify.mobile.android.connect.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class LogoutResponse implements JacksonModel {
    @JsonProperty("deviceID")
    public String deviceId;
}
