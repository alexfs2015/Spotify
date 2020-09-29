package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerError {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerError.builder(ErrorType.SUCCESS);
        }

        public abstract PlayerError build();

        @JsonProperty("error")
        public abstract Builder error(ErrorType errorType);

        @JsonProperty("reasons")
        public abstract Builder reasons(String str);

        @JsonProperty("track_uri")
        public abstract Builder trackUri(String str);
    }

    public static Builder builder(ErrorType errorType) {
        Builder error = new Builder().error(errorType);
        String str = "";
        return error.trackUri(str).reasons(str);
    }

    @JsonProperty("error")
    public abstract ErrorType error();

    @JsonProperty("reasons")
    public abstract String reasons();

    public abstract Builder toBuilder();

    @JsonProperty("track_uri")
    public abstract String trackUri();
}
