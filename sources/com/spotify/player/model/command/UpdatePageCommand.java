package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextPage;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class UpdatePageCommand implements Command {
    public static final UpdatePageCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract UpdatePageCommand build();

        @JsonProperty("page")
        public abstract Builder page(ContextPage contextPage);

        @JsonCreator
        public static Builder builder() {
            return UpdatePageCommand.builder();
        }
    }

    @JsonProperty("page")
    public abstract ContextPage page();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().page(ContextPage.EMPTY);
    }
}
