package com.spotify.effortlesslogin.backend;

import com.fasterxml.jackson.annotation.JsonGetter;

final class AutoValue_EffortlessLoginNameResponse extends EffortlessLoginNameResponse {
    private final String fullName;

    AutoValue_EffortlessLoginNameResponse(String str) {
        if (str != null) {
            this.fullName = str;
            return;
        }
        throw new NullPointerException("Null fullName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EffortlessLoginNameResponse)) {
            return false;
        }
        return this.fullName.equals(((EffortlessLoginNameResponse) obj).fullName());
    }

    @JsonGetter("full_name")
    public final String fullName() {
        return this.fullName;
    }

    public final int hashCode() {
        return this.fullName.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EffortlessLoginNameResponse{fullName=");
        sb.append(this.fullName);
        sb.append("}");
        return sb.toString();
    }
}
