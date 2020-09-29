package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PreparePlayCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            String str = "";
            return PreparePlayCommand.builder(Context.builder(str).build(), PlayOrigin.create(str));
        }

        public abstract PreparePlayCommand build();

        @JsonProperty("context")
        public abstract Builder context(Context context);

        @JsonAlias({"prepare_play_options"})
        @JsonProperty("options")
        public abstract Builder options(PreparePlayOptions preparePlayOptions);

        @JsonProperty("play_origin")
        public abstract Builder playOrigin(PlayOrigin playOrigin);
    }

    public static Builder builder(Context context, PlayOrigin playOrigin) {
        return new Builder().context(context).playOrigin(playOrigin);
    }

    public static PreparePlayCommand create(Context context, PlayOrigin playOrigin) {
        return builder(context, playOrigin).build();
    }

    @JsonProperty("context")
    public abstract Context context();

    @JsonProperty("options")
    public abstract Optional<PreparePlayOptions> options();

    @JsonProperty("play_origin")
    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();
}
