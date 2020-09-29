package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class SocialEvent implements JacksonModel {
    private static final ImmutableMap<String, SocialError> ERROR_MAPPING;

    public static abstract class Builder implements JacksonModel {
        static Builder create() {
            return SocialEvent.builder();
        }

        public abstract SocialEvent build();

        public abstract Builder description(String str);

        public abstract Builder socialError(SocialError socialError);
    }

    static {
        String str = "unauthorized";
        String str2 = "userDataFail";
        String str3 = "failedToConnect";
        String str4 = "serviceConnectNotPermitted";
        ERROR_MAPPING = ImmutableMap.g().b("permissions", SocialError.PERMISSIONS).b(str, SocialError.UNAUTHORIZED).b(str2, SocialError.USER_DATA_FAIL).b(str3, SocialError.FAILED_TO_CONNECT).b(str4, SocialError.SERVICE_CONNECT_NOT_PERMITTED).b();
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonCreator
    public static SocialEvent create(@JsonProperty("errorType") String str, @JsonProperty("description") String str2) {
        return builder().socialError((SocialError) ERROR_MAPPING.getOrDefault(str, SocialError.NONE)).description(str2).build();
    }

    public abstract String description();

    public abstract SocialError socialError();

    public abstract Builder toBuilder();
}
