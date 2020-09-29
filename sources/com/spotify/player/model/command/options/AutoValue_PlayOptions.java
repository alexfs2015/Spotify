package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.google.common.base.Optional;

final class AutoValue_PlayOptions extends PlayOptions {
    private final CommandOptions commandOptions;
    private final Optional<PlayOperation> operation;
    private final Optional<PlayTrigger> trigger;

    static final class Builder extends com.spotify.player.model.command.options.PlayOptions.Builder {
        private CommandOptions commandOptions;
        private Optional<PlayOperation> operation;
        private Optional<PlayTrigger> trigger;

        Builder() {
            this.operation = Optional.e();
            this.trigger = Optional.e();
        }

        private Builder(PlayOptions playOptions) {
            this.operation = Optional.e();
            this.trigger = Optional.e();
            this.operation = playOptions.operation();
            this.trigger = playOptions.trigger();
            this.commandOptions = playOptions.commandOptions();
        }

        public final PlayOptions build() {
            String str = "";
            if (this.commandOptions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" commandOptions");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayOptions(this.operation, this.trigger, this.commandOptions);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder operation(PlayOperation playOperation) {
            this.operation = Optional.b(playOperation);
            return this;
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder trigger(PlayTrigger playTrigger) {
            this.trigger = Optional.b(playTrigger);
            return this;
        }
    }

    private AutoValue_PlayOptions(Optional<PlayOperation> optional, Optional<PlayTrigger> optional2, CommandOptions commandOptions2) {
        this.operation = optional;
        this.trigger = optional2;
        this.commandOptions = commandOptions2;
    }

    @JsonUnwrapped
    public final CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayOptions) {
            PlayOptions playOptions = (PlayOptions) obj;
            return this.operation.equals(playOptions.operation()) && this.trigger.equals(playOptions.trigger()) && this.commandOptions.equals(playOptions.commandOptions());
        }
    }

    public final int hashCode() {
        return ((((this.operation.hashCode() ^ 1000003) * 1000003) ^ this.trigger.hashCode()) * 1000003) ^ this.commandOptions.hashCode();
    }

    @JsonProperty("operation")
    public final Optional<PlayOperation> operation() {
        return this.operation;
    }

    public final com.spotify.player.model.command.options.PlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayOptions{operation=");
        sb.append(this.operation);
        sb.append(", trigger=");
        sb.append(this.trigger);
        sb.append(", commandOptions=");
        sb.append(this.commandOptions);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("trigger")
    public final Optional<PlayTrigger> trigger() {
        return this.trigger;
    }
}
