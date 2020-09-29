package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PreparePlayCommand extends PreparePlayCommand {
    private final Context context;
    private final PreparePlayOptions options;
    private final PlayOrigin playOrigin;

    static final class Builder extends com.spotify.player.model.command.PreparePlayCommand.Builder {
        private Context context;
        private PreparePlayOptions options;
        private PlayOrigin playOrigin;

        Builder() {
        }

        private Builder(PreparePlayCommand preparePlayCommand) {
            this.context = preparePlayCommand.context();
            this.playOrigin = preparePlayCommand.playOrigin();
            this.options = preparePlayCommand.options();
        }

        public final com.spotify.player.model.command.PreparePlayCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }

        public final com.spotify.player.model.command.PreparePlayCommand.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        public final com.spotify.player.model.command.PreparePlayCommand.Builder options(PreparePlayOptions preparePlayOptions) {
            if (preparePlayOptions != null) {
                this.options = preparePlayOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final PreparePlayCommand build() {
            String str = "";
            if (this.context == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" context");
                str = sb.toString();
            }
            if (this.playOrigin == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playOrigin");
                str = sb2.toString();
            }
            if (this.options == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" options");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PreparePlayCommand(this.context, this.playOrigin, this.options);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_PreparePlayCommand(Context context2, PlayOrigin playOrigin2, PreparePlayOptions preparePlayOptions) {
        this.context = context2;
        this.playOrigin = playOrigin2;
        this.options = preparePlayOptions;
    }

    @JsonProperty("context")
    public final Context context() {
        return this.context;
    }

    @JsonProperty("play_origin")
    public final PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @JsonProperty("options")
    public final PreparePlayOptions options() {
        return this.options;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreparePlayCommand{context=");
        sb.append(this.context);
        sb.append(", playOrigin=");
        sb.append(this.playOrigin);
        sb.append(", options=");
        sb.append(this.options);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreparePlayCommand) {
            PreparePlayCommand preparePlayCommand = (PreparePlayCommand) obj;
            return this.context.equals(preparePlayCommand.context()) && this.playOrigin.equals(preparePlayCommand.playOrigin()) && this.options.equals(preparePlayCommand.options());
        }
    }

    public final int hashCode() {
        return ((((this.context.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    public final com.spotify.player.model.command.PreparePlayCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
