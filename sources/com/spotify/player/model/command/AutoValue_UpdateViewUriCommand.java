package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_UpdateViewUriCommand extends UpdateViewUriCommand {
    private final String viewUri;

    static final class Builder extends com.spotify.player.model.command.UpdateViewUriCommand.Builder {
        private String viewUri;

        Builder() {
        }

        private Builder(UpdateViewUriCommand updateViewUriCommand) {
            this.viewUri = updateViewUriCommand.viewUri();
        }

        public final UpdateViewUriCommand build() {
            String str = "";
            if (this.viewUri == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" viewUri");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_UpdateViewUriCommand(this.viewUri);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.UpdateViewUriCommand.Builder viewUri(String str) {
            if (str != null) {
                this.viewUri = str;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }
    }

    private AutoValue_UpdateViewUriCommand(String str) {
        this.viewUri = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateViewUriCommand)) {
            return false;
        }
        return this.viewUri.equals(((UpdateViewUriCommand) obj).viewUri());
    }

    public final int hashCode() {
        return this.viewUri.hashCode() ^ 1000003;
    }

    public final com.spotify.player.model.command.UpdateViewUriCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateViewUriCommand{viewUri=");
        sb.append(this.viewUri);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("view_uri")
    public final String viewUri() {
        return this.viewUri;
    }
}
