package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

final class AutoValue_PlayOptions extends PlayOptions {
    private final CommandOptions commandOptions;
    private final PlayOperation operation;
    private final PlayTrigger trigger;

    static final class Builder extends com.spotify.player.model.command.options.PlayOptions.Builder {
        private CommandOptions commandOptions;
        private PlayOperation operation;
        private PlayTrigger trigger;

        Builder() {
        }

        private Builder(PlayOptions playOptions) {
            this.operation = playOptions.operation();
            this.trigger = playOptions.trigger();
            this.commandOptions = playOptions.commandOptions();
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder operation(PlayOperation playOperation) {
            if (playOperation != null) {
                this.operation = playOperation;
                return this;
            }
            throw new NullPointerException("Null operation");
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder trigger(PlayTrigger playTrigger) {
            if (playTrigger != null) {
                this.trigger = playTrigger;
                return this;
            }
            throw new NullPointerException("Null trigger");
        }

        public final com.spotify.player.model.command.options.PlayOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        public final PlayOptions build() {
            String str = "";
            if (this.operation == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" operation");
                str = sb.toString();
            }
            if (this.trigger == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trigger");
                str = sb2.toString();
            }
            if (this.commandOptions == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" commandOptions");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayOptions(this.operation, this.trigger, this.commandOptions);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_PlayOptions(PlayOperation playOperation, PlayTrigger playTrigger, CommandOptions commandOptions2) {
        this.operation = playOperation;
        this.trigger = playTrigger;
        this.commandOptions = commandOptions2;
    }

    @JsonProperty("operation")
    public final PlayOperation operation() {
        return this.operation;
    }

    @JsonProperty("trigger")
    public final PlayTrigger trigger() {
        return this.trigger;
    }

    @JsonUnwrapped
    public final CommandOptions commandOptions() {
        return this.commandOptions;
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

    public final com.spotify.player.model.command.options.PlayOptions.Builder toBuilder() {
        return new Builder(this);
    }
}
