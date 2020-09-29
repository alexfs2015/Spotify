package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class PermissionsRequest implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        public abstract PermissionsRequest build();

        @JsonProperty("permissions")
        public abstract Builder permissions(List<String> list);

        static Builder create() {
            return PermissionsRequest.builder();
        }
    }

    @JsonProperty("permissions")
    public abstract List<String> permissions();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
