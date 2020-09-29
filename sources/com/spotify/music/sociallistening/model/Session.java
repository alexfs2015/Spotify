package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Session.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Session implements JacksonModel {
    public static final Session EMPTY;

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return Session.EMPTY.toBuilder();
        }

        public abstract Session build();

        @JsonProperty("is_session_owner")
        public abstract Builder isSessionOwner(boolean z);

        @JsonProperty("join_session_token")
        public abstract Builder joinSessionToken(String str);

        @JsonProperty("join_session_uri")
        public abstract Builder joinSessionUri(String str);

        @JsonProperty("participants")
        public abstract Builder participants(List<Participant> list);

        @JsonProperty("session_id")
        public abstract Builder sessionId(String str);

        @JsonProperty("timestamp")
        public abstract Builder timestamp(long j);
    }

    static {
        String str = "";
        EMPTY = builder().timestamp(0).sessionId(str).joinSessionUri(str).isSessionOwner(false).joinSessionToken(str).participants(ImmutableList.d()).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("is_session_owner")
    public abstract boolean isSessionOwner();

    @JsonProperty("join_session_token")
    public abstract String joinSessionToken();

    @JsonProperty("join_session_uri")
    public abstract String joinSessionUri();

    @JsonProperty("participants")
    public abstract List<Participant> participants();

    @JsonProperty("session_id")
    public abstract String sessionId();

    @JsonProperty("timestamp")
    public abstract long timestamp();

    public abstract Builder toBuilder();
}
