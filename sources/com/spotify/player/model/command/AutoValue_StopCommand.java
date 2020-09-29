package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.StopOptions;

final class AutoValue_StopCommand extends StopCommand {
    private final LoggingParams loggingParams;
    private final StopOptions options;

    static final class Builder extends com.spotify.player.model.command.StopCommand.Builder {
        private LoggingParams loggingParams;
        private StopOptions options;

        Builder() {
        }

        private Builder(StopCommand stopCommand) {
            this.options = stopCommand.options();
            this.loggingParams = stopCommand.loggingParams();
        }

        public final com.spotify.player.model.command.StopCommand.Builder options(StopOptions stopOptions) {
            if (stopOptions != null) {
                this.options = stopOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final com.spotify.player.model.command.StopCommand.Builder loggingParams(LoggingParams loggingParams2) {
            if (loggingParams2 != null) {
                this.loggingParams = loggingParams2;
                return this;
            }
            throw new NullPointerException("Null loggingParams");
        }

        public final StopCommand build() {
            String str = "";
            if (this.options == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" options");
                str = sb.toString();
            }
            if (this.loggingParams == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loggingParams");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_StopCommand(this.options, this.loggingParams);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_StopCommand(StopOptions stopOptions, LoggingParams loggingParams2) {
        this.options = stopOptions;
        this.loggingParams = loggingParams2;
    }

    @JsonProperty("options")
    public final StopOptions options() {
        return this.options;
    }

    @JsonProperty("logging_params")
    public final LoggingParams loggingParams() {
        return this.loggingParams;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopCommand{options=");
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
        if (obj instanceof StopCommand) {
            StopCommand stopCommand = (StopCommand) obj;
            return this.options.equals(stopCommand.options()) && this.loggingParams.equals(stopCommand.loggingParams());
        }
    }

    public final int hashCode() {
        return ((this.options.hashCode() ^ 1000003) * 1000003) ^ this.loggingParams.hashCode();
    }

    public final com.spotify.player.model.command.StopCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
