package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerSession {

    public static abstract class Builder {
        public abstract PlayerSession build();

        @JsonProperty("session")
        public abstract Builder session(String str);

        @JsonCreator
        public static Builder builder() {
            return PlayerSession.builder();
        }
    }

    @JsonProperty("session")
    public abstract String session();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().session("");
    }
}
