package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerError {
    public static final PlayerError EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PlayerError build();

        @JsonProperty("error")
        public abstract Builder error(ErrorType errorType);

        @JsonProperty("reasons")
        public abstract Builder reasons(String str);

        @JsonProperty("track_uri")
        public abstract Builder trackUri(String str);

        @JsonCreator
        public static Builder builder() {
            return PlayerError.builder();
        }
    }

    @JsonProperty("error")
    public abstract ErrorType error();

    @JsonProperty("reasons")
    public abstract String reasons();

    public abstract Builder toBuilder();

    @JsonProperty("track_uri")
    public abstract String trackUri();

    public static Builder builder() {
        String str = "";
        return new Builder().error(ErrorType.SUCCESS).trackUri(str).reasons(str);
    }
}
