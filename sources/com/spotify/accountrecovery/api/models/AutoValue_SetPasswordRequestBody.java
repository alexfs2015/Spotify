package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_SetPasswordRequestBody extends SetPasswordRequestBody {
    private final String oneTimeToken;
    private final String password;

    AutoValue_SetPasswordRequestBody(String str, String str2) {
        if (str != null) {
            this.password = str;
            if (str2 != null) {
                this.oneTimeToken = str2;
                return;
            }
            throw new NullPointerException("Null oneTimeToken");
        }
        throw new NullPointerException("Null password");
    }

    @JsonGetter("password")
    public final String password() {
        return this.password;
    }

    @JsonGetter("oneTimeToken")
    public final String oneTimeToken() {
        return this.oneTimeToken;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPasswordRequestBody{password=");
        sb.append(this.password);
        sb.append(", oneTimeToken=");
        sb.append(this.oneTimeToken);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetPasswordRequestBody) {
            SetPasswordRequestBody setPasswordRequestBody = (SetPasswordRequestBody) obj;
            return this.password.equals(setPasswordRequestBody.password()) && this.oneTimeToken.equals(setPasswordRequestBody.oneTimeToken());
        }
    }

    public final int hashCode() {
        return ((this.password.hashCode() ^ 1000003) * 1000003) ^ this.oneTimeToken.hashCode();
    }
}
