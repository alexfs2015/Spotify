package com.spotify.podcastonboarding.api;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_CompleteRequestBody extends CompleteRequestBody {
    private final vmw podcast;

    AutoValue_CompleteRequestBody(vmw vmw) {
        this.podcast = vmw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteRequestBody)) {
            return false;
        }
        CompleteRequestBody completeRequestBody = (CompleteRequestBody) obj;
        vmw vmw = this.podcast;
        vmw podcast2 = completeRequestBody.podcast();
        return vmw == null ? podcast2 == null : vmw.equals(podcast2);
    }

    public final int hashCode() {
        vmw vmw = this.podcast;
        return (vmw == null ? 0 : vmw.hashCode()) ^ 1000003;
    }

    @JsonProperty("podcast")
    public final vmw podcast() {
        return this.podcast;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteRequestBody{podcast=");
        sb.append(this.podcast);
        sb.append("}");
        return sb.toString();
    }
}
