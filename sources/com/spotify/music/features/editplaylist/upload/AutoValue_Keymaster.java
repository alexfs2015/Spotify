package com.spotify.music.features.editplaylist.upload;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_Keymaster extends Keymaster {
    private final int expiresIn;
    private final String token;

    AutoValue_Keymaster(String str, int i) {
        if (str != null) {
            this.token = str;
            this.expiresIn = i;
            return;
        }
        throw new NullPointerException("Null token");
    }

    @JsonProperty("accessToken")
    public final String token() {
        return this.token;
    }

    @JsonProperty("expiresIn")
    public final int expiresIn() {
        return this.expiresIn;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keymaster{token=");
        sb.append(this.token);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Keymaster) {
            Keymaster keymaster = (Keymaster) obj;
            return this.token.equals(keymaster.token()) && this.expiresIn == keymaster.expiresIn();
        }
    }

    public final int hashCode() {
        return ((this.token.hashCode() ^ 1000003) * 1000003) ^ this.expiresIn;
    }
}
