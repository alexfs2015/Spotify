package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdateContextCommand implements Command {
    public static final UpdateContextCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract UpdateContextCommand build();

        @JsonProperty("context")
        public abstract Builder context(Context context);

        @JsonCreator
        public static Builder builder() {
            return UpdateContextCommand.builder();
        }
    }

    @JsonProperty("context")
    public abstract Context context();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().context(Context.EMPTY);
    }
}
