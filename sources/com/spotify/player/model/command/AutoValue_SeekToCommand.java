package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_SeekToCommand extends SeekToCommand {
    private final LoggingParams loggingParams;
    private final CommandOptions options;
    private final long value;

    static final class Builder extends com.spotify.player.model.command.SeekToCommand.Builder {
        private LoggingParams loggingParams;
        private CommandOptions options;
        private Long value;

        Builder() {
        }

        private Builder(SeekToCommand seekToCommand) {
            this.value = Long.valueOf(seekToCommand.value());
            this.options = seekToCommand.options();
            this.loggingParams = seekToCommand.loggingParams();
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder value(long j) {
            this.value = Long.valueOf(j);
            return this;
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder options(CommandOptions commandOptions) {
            if (commandOptions != null) {
                this.options = commandOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.SeekToCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final SeekToCommand build() {
            String str = "";
            if (this.value == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" value");
                str = sb.toString();
            }
            if (this.options == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" options");
                str = sb2.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" loggingParams");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_SeekToCommand autoValue_SeekToCommand = new AutoValue_SeekToCommand(this.value.longValue(), this.options, this.loggingParams);
                return autoValue_SeekToCommand;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_SeekToCommand(long j, CommandOptions commandOptions, LoggingParams loggingParams2) {
        this.value = j;
        this.options = commandOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("value")
    public final long value() {
        return this.value;
    }

    @JsonProperty("options")
    public final CommandOptions options() {
        return this.options;
    }

    @JsonProperty("logging_params")
    public final LoggingParams loggingParams() {
        return this.loggingParams;
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

    public final com.spotify.player.model.command.SeekToCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
