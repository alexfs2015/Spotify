package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.Context;

final class AutoValue_UpdateContextCommand extends UpdateContextCommand {
    private final Context context;

    static final class Builder extends com.spotify.player.model.command.UpdateContextCommand.Builder {
        private Context context;

        Builder() {
        }

        private Builder(UpdateContextCommand updateContextCommand) {
            this.context = updateContextCommand.context();
        }

        public final UpdateContextCommand build() {
            String str = "";
            if (this.context == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" context");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_UpdateContextCommand(this.context);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.UpdateContextCommand.Builder context(Context context2) {
            if (context2 != null) {
                this.context = context2;
                return this;
            }
            throw new NullPointerException("Null context");
        }
    }

    private AutoValue_UpdateContextCommand(Context context2) {
        this.context = context2;
    }

    @JsonProperty("context")
    public final Context context() {
        return this.context;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateContextCommand)) {
            return false;
        }
        return this.context.equals(((UpdateContextCommand) obj).context());
    }

    public final int hashCode() {
        return this.context.hashCode() ^ 1000003;
    }

    public final com.spotify.player.model.command.UpdateContextCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateContextCommand{context=");
        sb.append(this.context);
        sb.append("}");
        return sb.toString();
    }
}
