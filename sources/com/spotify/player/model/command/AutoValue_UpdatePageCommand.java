package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextPage;

final class AutoValue_UpdatePageCommand extends UpdatePageCommand {
    private final ContextPage page;

    static final class Builder extends com.spotify.player.model.command.UpdatePageCommand.Builder {
        private ContextPage page;

        Builder() {
        }

        private Builder(UpdatePageCommand updatePageCommand) {
            this.page = updatePageCommand.page();
        }

        public final UpdatePageCommand build() {
            String str = "";
            if (this.page == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" page");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_UpdatePageCommand(this.page);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.command.UpdatePageCommand.Builder page(ContextPage contextPage) {
            if (contextPage != null) {
                this.page = contextPage;
                return this;
            }
            throw new NullPointerException("Null page");
        }
    }

    private AutoValue_UpdatePageCommand(ContextPage contextPage) {
        this.page = contextPage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdatePageCommand)) {
            return false;
        }
        return this.page.equals(((UpdatePageCommand) obj).page());
    }

    public final int hashCode() {
        return this.page.hashCode() ^ 1000003;
    }

    @JsonProperty("page")
    public final ContextPage page() {
        return this.page;
    }

    public final com.spotify.player.model.command.UpdatePageCommand.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePageCommand{page=");
        sb.append(this.page);
        sb.append("}");
        return sb.toString();
    }
}
