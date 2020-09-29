package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonDeserialize(builder = Builder.class)
public abstract class SocialState implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonProperty("accessToken")
        public abstract Builder accessToken(String str);

        public abstract SocialState build();

        @JsonProperty("enabled")
        public abstract Builder enabled(boolean z);

        @JsonProperty("missingPermissions")
        public abstract Builder missingPermissions(List<String> list);

        @JsonCreator
        static Builder create() {
            return SocialState.builder();
        }
    }

    public abstract String accessToken();

    public abstract boolean enabled();

    public abstract List<String> missingPermissions();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
