package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_PlayerError extends PlayerError {
    private final ErrorType error;
    private final String reasons;
    private final String trackUri;

    static final class Builder extends com.spotify.player.model.PlayerError.Builder {
        private ErrorType error;
        private String reasons;
        private String trackUri;

        Builder() {
        }

        private Builder(PlayerError playerError) {
            this.error = playerError.error();
            this.trackUri = playerError.trackUri();
            this.reasons = playerError.reasons();
        }

        public final PlayerError build() {
            String str = "";
            if (this.error == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" error");
                str = sb.toString();
            }
            if (this.trackUri == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trackUri");
                str = sb2.toString();
            }
            if (this.reasons == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" reasons");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerError(this.error, this.trackUri, this.reasons);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final com.spotify.player.model.PlayerError.Builder error(ErrorType errorType) {
            if (errorType != null) {
                this.error = errorType;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        public final com.spotify.player.model.PlayerError.Builder reasons(String str) {
            if (str != null) {
                this.reasons = str;
                return this;
            }
            throw new NullPointerException("Null reasons");
        }

        public final com.spotify.player.model.PlayerError.Builder trackUri(String str) {
            if (str != null) {
                this.trackUri = str;
                return this;
            }
            throw new NullPointerException("Null trackUri");
        }
    }

    private AutoValue_PlayerError(ErrorType errorType, String str, String str2) {
        this.error = errorType;
        this.trackUri = str;
        this.reasons = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerError) {
            PlayerError playerError = (PlayerError) obj;
            return this.error.equals(playerError.error()) && this.trackUri.equals(playerError.trackUri()) && this.reasons.equals(playerError.reasons());
        }
    }

    @JsonProperty("error")
    public final ErrorType error() {
        return this.error;
    }

    public final int hashCode() {
        return ((((this.error.hashCode() ^ 1000003) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.reasons.hashCode();
    }

    @JsonProperty("reasons")
    public final String reasons() {
        return this.reasons;
    }

    public final com.spotify.player.model.PlayerError.Builder toBuilder() {
        return new Builder(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerError{error=");
        sb.append(this.error);
        sb.append(", trackUri=");
        sb.append(this.trackUri);
        sb.append(", reasons=");
        sb.append(this.reasons);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("track_uri")
    public final String trackUri() {
        return this.trackUri;
    }
}
