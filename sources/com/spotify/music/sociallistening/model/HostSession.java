package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = HostSession.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HostSession implements JacksonModel {
    public static final HostSession EMPTY;

    public static abstract class Builder implements JacksonModel {
        @JsonProperty("access_token")
        public abstract Builder accessToken(String str);

        public abstract HostSession build();

        @JsonProperty("join_session_uri")
        public abstract Builder joinSessionUri(String str);

        @JsonProperty("session")
        public abstract Builder session(Session session);

        @JsonProperty("session_id")
        public abstract Builder sessionId(String str);

        @JsonCreator
        public static Builder create() {
            return HostSession.builder();
        }
    }

    @JsonProperty("access_token")
    public abstract String accessToken();

    @JsonProperty("join_session_uri")
    public abstract String joinSessionUri();

    @JsonProperty("session")
    public abstract Session session();

    @JsonProperty("session_id")
    public abstract String sessionId();

    static {
        String str = "";
        EMPTY = builder().sessionId(str).accessToken(str).joinSessionUri(str).session(Session.EMPTY).build();
    }

    public static Builder builder() {
        return new Builder();
    }
}
