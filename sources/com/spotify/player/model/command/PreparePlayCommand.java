package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class PreparePlayCommand implements Command {
    public static final PreparePlayCommand EMPTY = builder().build();

    public static abstract class Builder {
        public abstract PreparePlayCommand build();

        @JsonProperty("context")
        public abstract Builder context(Context context);

        @JsonAlias({"prepare_play_options"})
        @JsonProperty("options")
        public abstract Builder options(PreparePlayOptions preparePlayOptions);

        @JsonProperty("play_origin")
        public abstract Builder playOrigin(PlayOrigin playOrigin);

        @JsonCreator
        public static Builder builder() {
            return PreparePlayCommand.builder();
        }
    }

    @JsonProperty("context")
    public abstract Context context();

    @JsonProperty("options")
    public abstract PreparePlayOptions options();

    @JsonProperty("play_origin")
    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().context(Context.EMPTY).playOrigin(PlayOrigin.EMPTY).options(PreparePlayOptions.EMPTY);
    }

    public PreparePlayCommand withPlayOrigin(PlayOrigin playOrigin) {
        return toBuilder().playOrigin(playOrigin).build();
    }
}
