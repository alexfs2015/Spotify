package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_VerifyTokenRequestBody extends VerifyTokenRequestBody {
    private final String oneTimeToken;

    AutoValue_VerifyTokenRequestBody(String str) {
        if (str != null) {
            this.oneTimeToken = str;
            return;
        }
        throw new NullPointerException("Null oneTimeToken");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyTokenRequestBody)) {
            return false;
        }
        return this.oneTimeToken.equals(((VerifyTokenRequestBody) obj).oneTimeToken());
    }

    public final int hashCode() {
        return this.oneTimeToken.hashCode() ^ 1000003;
    }

    @JsonGetter("oneTimeToken")
    public final String oneTimeToken() {
        return this.oneTimeToken;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyTokenRequestBody{oneTimeToken=");
        sb.append(this.oneTimeToken);
        sb.append("}");
        return sb.toString();
    }
}
