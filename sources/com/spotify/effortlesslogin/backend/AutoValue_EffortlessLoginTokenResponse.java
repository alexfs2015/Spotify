package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_EffortlessLoginTokenResponse extends EffortlessLoginTokenResponse {
    private final String token;

    AutoValue_EffortlessLoginTokenResponse(String str) {
        if (str != null) {
            this.token = str;
            return;
        }
        throw new NullPointerException("Null token");
    }

    @JsonGetter("token")
    public final String token() {
        return this.token;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EffortlessLoginTokenResponse{token=");
        sb.append(this.token);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EffortlessLoginTokenResponse)) {
            return false;
        }
        return this.token.equals(((EffortlessLoginTokenResponse) obj).token());
    }

    public final int hashCode() {
        return this.token.hashCode() ^ 1000003;
    }
}
