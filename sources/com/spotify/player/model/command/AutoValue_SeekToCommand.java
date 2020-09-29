package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SeekToCommand extends SeekToCommand {
    private final Optional<LoggingParams> loggingParams;
    private final Optional<CommandOptions> options;
    private final long value;

    static final class Builder extends com.spotify.player.model.command.SeekToCommand.Builder {
        private Optional<LoggingParams> loggingParams;
        private Optional<CommandOptions> options;
        private Long value;

        Builder() {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
        }

        private Builder(SeekToCommand seekToCommand) {
            this.options = Optional.e();
            this.loggingParams = Optional.e();
            this.value = Long.valueOf(seekToCommand.value());
            this.options = seekToCommand.options();
            this.loggingParams = seekToCommand.loggingParams();
        }

        public final SeekToCommand build() {
            String str = "";
            if (this.value == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" value");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SeekToCommand autoValue_SeekToCommand = new AutoValue_SeekToCommand(this.value.longValue(), this.options, this.loggingParams);
                return autoValue_SeekToCommand;
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder loggingParams(LoggingParams loggingParams2) {
            this.loggingParams = Optional.b(loggingParams2);
            return this;
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder options(CommandOptions commandOptions) {
            this.options = Optional.b(commandOptions);
            return this;
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder value(long j) {
            this.value = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_SeekToCommand(long j, Optional<CommandOptions> optional, Optional<LoggingParams> optional2) {
        this.value = j;
        this.options = optional;
        this.loggingParams = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekToCommand) {
            SeekToCommand seekToCommand = (SeekToCommand) obj;
            return this.value == seekToCommand.value() && this.options.equals(seekToCommand.options()) && this.loggingParams.equals(seekToCommand.loggingParams());
        }
    }

    public final int hashCode() {
        long j = this.value;
        return this.loggingParams.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.options.hashCode()) * 1000003);
    }

    @JsonProperty("logging_params")
    public final Optional<LoggingParams> loggingParams() {
        return this.loggingParams;
    }

    @JsonProperty("options")
    public final Optional<CommandOptions> options() {
        return this.options;
    }

    public final com.spotify.player.model.command.SeekToCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeekToCommand{value=");
        sb.append(this.value);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", loggingParams=");
        sb.append(this.loggingParams);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("value")
    public final long value() {
        return this.value;
    }
}
