package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.google.common.base.Optional;

final class AutoValue_SkipToPrevTrackOptions extends SkipToPrevTrackOptions {
    private final Optional<Boolean> allowSeeking;
    private final CommandOptions commandOptions;

    static final class Builder extends com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder {
        private Optional<Boolean> allowSeeking;
        private CommandOptions commandOptions;

        Builder() {
            this.allowSeeking = Optional.e();
        }

        private Builder(SkipToPrevTrackOptions skipToPrevTrackOptions) {
            this.allowSeeking = Optional.e();
            this.allowSeeking = skipToPrevTrackOptions.allowSeeking();
            this.commandOptions = skipToPrevTrackOptions.commandOptions();
        }

        public final com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder allowSeeking(Boolean bool) {
            this.allowSeeking = Optional.b(bool);
            return this;
        }

        public final com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder commandOptions(CommandOptions commandOptions2) {
            if (commandOptions2 != null) {
                this.commandOptions = commandOptions2;
                return this;
            }
            throw new NullPointerException("Null commandOptions");
        }

        public final SkipToPrevTrackOptions build() {
            String str = "";
            if (this.commandOptions == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" commandOptions");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SkipToPrevTrackOptions(this.allowSeeking, this.commandOptions);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_SkipToPrevTrackOptions(Optional<Boolean> optional, CommandOptions commandOptions2) {
        this.allowSeeking = optional;
        this.commandOptions = commandOptions2;
    }

    @JsonProperty("allow_seeking")
    public final Optional<Boolean> allowSeeking() {
        return this.allowSeeking;
    }

    @JsonUnwrapped
    public final CommandOptions commandOptions() {
        return this.commandOptions;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipToPrevTrackOptions{allowSeeking=");
        sb.append(this.allowSeeking);
        sb.append(", commandOptions=");
        sb.append(this.commandOptions);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToPrevTrackOptions) {
            SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) obj;
            return this.allowSeeking.equals(skipToPrevTrackOptions.allowSeeking()) && this.commandOptions.equals(skipToPrevTrackOptions.commandOptions());
        }
    }

    public final int hashCode() {
        return ((this.allowSeeking.hashCode() ^ 1000003) * 1000003) ^ this.commandOptions.hashCode();
    }

    public final com.spotify.player.model.command.options.SkipToPrevTrackOptions.Builder toBuilder() {
        return new Builder(this);
    }
}
