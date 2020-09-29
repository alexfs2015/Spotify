package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateViewUriCommand implements Command {
    public static final UpdateViewUriCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract UpdateViewUriCommand build();

        @JsonProperty("view_uri")
        public abstract Builder viewUri(String str);

        @JsonCreator
        public static Builder builder() {
            return UpdateViewUriCommand.builder();
        }
    }

    public abstract Builder toBuilder();

    @JsonProperty("view_uri")
    public abstract String viewUri();

    public static Builder builder() {
        return new Builder().viewUri("");
    }
}
