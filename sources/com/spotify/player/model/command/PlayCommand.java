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
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayCommand implements Command {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            String str = "";
            return PlayCommand.builder(Context.builder(str).build(), PlayOrigin.create(str));
        }

        public abstract PlayCommand build();

        @JsonProperty("context")
        public abstract Builder context(Context context);

        @JsonProperty("logging_params")
        public abstract Builder loggingParams(LoggingParams loggingParams);

        @JsonAlias({"prepare_play_options"})
        @JsonProperty("options")
        public abstract Builder options(PreparePlayOptions preparePlayOptions);

        @JsonProperty("play_options")
        public abstract Builder playOptions(PlayOptions playOptions);

        @JsonProperty("play_origin")
        public abstract Builder playOrigin(PlayOrigin playOrigin);
    }

    public static Builder builder(Context context, PlayOrigin playOrigin) {
        return new Builder().context(context).playOrigin(playOrigin);
    }

    public static PlayCommand create(Context context, PlayOrigin playOrigin) {
        return builder(context, playOrigin).build();
    }

    @JsonProperty("context")
    public abstract Context context();

    @JsonProperty("logging_params")
    public abstract Optional<LoggingParams> loggingParams();

    @JsonProperty("options")
    public abstract Optional<PreparePlayOptions> options();

    @JsonProperty("play_options")
    public abstract Optional<PlayOptions> playOptions();

    @JsonProperty("play_origin")
    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();
}
