package com.spotify.player.model.command;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.player.model.ContextTrack;

final class AutoValue_UpdateTrackCommand extends UpdateTrackCommand {
    private final ContextTrack track;

    static final class Builder extends com.spotify.player.model.command.UpdateTrackCommand.Builder {
        private ContextTrack track;

        Builder() {
        }

        private Builder(UpdateTrackCommand updateTrackCommand) {
            this.track = updateTrackCommand.track();
        }

        public final com.spotify.player.model.command.UpdateTrackCommand.Builder track(ContextTrack contextTrack) {
            if (contextTrack != null) {
                this.track = contextTrack;
                return this;
            }
            throw new NullPointerException("Null track");
        }

        public final UpdateTrackCommand build() {
            String str = "";
            if (this.track == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" track");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_UpdateTrackCommand(this.track);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_UpdateTrackCommand(ContextTrack contextTrack) {
        this.track = contextTrack;
    }

    @JsonProperty("track")
    public final ContextTrack track() {
        return this.track;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateTrackCommand{track=");
        sb.append(this.track);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateTrackCommand)) {
            return false;
        }
        return this.track.equals(((UpdateTrackCommand) obj).track());
    }

    public final int hashCode() {
        return this.track.hashCode() ^ 1000003;
    }

    public final com.spotify.player.model.command.UpdateTrackCommand.Builder toBuilder() {
        return new Builder(this);
    }
}
