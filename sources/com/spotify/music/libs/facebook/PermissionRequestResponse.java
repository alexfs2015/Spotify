package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(builder = Builder.class)
public abstract class PermissionRequestResponse implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonProperty("authSuccessUrl")
        public abstract Builder authSuccessUrl(String str);

        public abstract PermissionRequestResponse build();

        @JsonProperty("missingPermissions")
        public abstract Builder missingPermissions(String str);

        @JsonProperty("requestPermissionsUrl")
        public abstract Builder requestPermissionsUrl(String str);

        @JsonCreator
        static Builder create() {
            return PermissionRequestResponse.builder();
        }
    }

    public abstract String authSuccessUrl();

    public abstract String missingPermissions();

    public abstract String requestPermissionsUrl();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
