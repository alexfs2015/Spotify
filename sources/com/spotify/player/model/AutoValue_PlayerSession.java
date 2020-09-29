package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PlayerSession extends PlayerSession {
    private final String session;

    static final class Builder extends com.spotify.player.model.PlayerSession.Builder {
        private String session;

        Builder() {
        }

        private Builder(PlayerSession playerSession) {
            this.session = playerSession.session();
        }

        public final PlayerSession build() {
            String str = "";
            if (this.session == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" session");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerSession(this.session);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final com.spotify.player.model.PlayerSession.Builder session(String str) {
            if (str != null) {
                this.session = str;
                return this;
            }
            throw new NullPointerException("Null session");
        }
    }

    private AutoValue_PlayerSession(String str) {
        this.session = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerSession)) {
            return false;
        }
        return this.session.equals(((PlayerSession) obj).session());
    }

    public final int hashCode() {
        return this.session.hashCode() ^ 1000003;
    }

    @JsonProperty("session")
    public final String session() {
        return this.session;
    }

    public final com.spotify.player.model.PlayerSession.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerSession{session=");
        sb.append(this.session);
        sb.append("}");
        return sb.toString();
    }
}
