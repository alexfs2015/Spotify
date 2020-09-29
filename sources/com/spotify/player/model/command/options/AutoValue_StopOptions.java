package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

final class AutoValue_StopOptions extends StopOptions {
    private final CommandOptions commandOptions;
    private final StopReason reason;

    static final class Builder extends com.spotify.player.model.command.options.StopOptions.Builder {
        private CommandOptions commandOptions;
        private StopReason reason;

        Builder() {
        }

        private Builder(StopOptions stopOptions) {
            this.reason = stopOptions.reason();
            this.commandOptions = stopOptions.commandOptions();
        }

        public final com.spotify.player.model.command.options.StopOptions.Builder reason(StopReason stopReason) {
            if (stopReason != null) {
                this.reason = stopReason;
                return this;
            }
            throw new NullPointerException("Null reason");
        }

        public final com.spotify.player.model.command.options.StopOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        public final StopOptions build() {
            String str = "";
            if (this.reason == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" reason");
                str = sb.toString();
            }
            if (this.commandOptions == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" commandOptions");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_StopOptions(this.reason, this.commandOptions);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_StopOptions(StopReason stopReason, CommandOptions commandOptions2) {
        this.reason = stopReason;
        this.commandOptions = commandOptions2;
    }

    @JsonProperty("reason")
    public final StopReason reason() {
        return this.reason;
    }

    @JsonUnwrapped
    public final CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopOptions{reason=");
        sb.append(this.reason);
        sb.append(", commandOptions=");
        sb.append(this.commandOptions);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopOptions) {
            StopOptions stopOptions = (StopOptions) obj;
            return this.reason.equals(stopOptions.reason()) && this.commandOptions.equals(stopOptions.commandOptions());
        }
    }

    public final int hashCode() {
        return ((this.reason.hashCode() ^ 1000003) * 1000003) ^ this.commandOptions.hashCode();
    }

    public final com.spotify.player.model.command.options.StopOptions.Builder toBuilder() {
        return new Builder(this);
    }
}
