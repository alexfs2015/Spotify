package com.spotify.accountrecovery.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

final class AutoValue_MagicLinkRequestBody extends MagicLinkRequestBody {
    private final String emailOrUsername;
    private final String template;

    AutoValue_MagicLinkRequestBody(String str, String str2) {
        if (str != null) {
            this.emailOrUsername = str;
            if (str2 != null) {
                this.template = str2;
                return;
            }
            throw new NullPointerException("Null template");
        }
        throw new NullPointerException("Null emailOrUsername");
    }

    @JsonGetter("emailOrUsername")
    public final String emailOrUsername() {
        return this.emailOrUsername;
    }

    @JsonGetter("template")
    @JsonInclude(Include.NON_EMPTY)
    public final String template() {
        return this.template;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MagicLinkRequestBody{emailOrUsername=");
        sb.append(this.emailOrUsername);
        sb.append(", template=");
        sb.append(this.template);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MagicLinkRequestBody) {
            MagicLinkRequestBody magicLinkRequestBody = (MagicLinkRequestBody) obj;
            return this.emailOrUsername.equals(magicLinkRequestBody.emailOrUsername()) && this.template.equals(magicLinkRequestBody.template());
        }
    }

    public final int hashCode() {
        return ((this.emailOrUsername.hashCode() ^ 1000003) * 1000003) ^ this.template.hashCode();
    }
}
