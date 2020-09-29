package com.spotify.podcastonboarding.api;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_CompleteRequestBody extends CompleteRequestBody {
    private final vai podcast;

    AutoValue_CompleteRequestBody(vai vai) {
        this.podcast = vai;
    }

    @JsonProperty("podcast")
    public final vai podcast() {
        return this.podcast;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteRequestBody{podcast=");
        sb.append(this.podcast);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteRequestBody)) {
            return false;
        }
        CompleteRequestBody completeRequestBody = (CompleteRequestBody) obj;
        vai vai = this.podcast;
        vai podcast2 = completeRequestBody.podcast();
        if (vai == null) {
            return podcast2 == null;
        }
        return vai.equals(podcast2);
    }

    public final int hashCode() {
        vai vai = this.podcast;
        return (vai == null ? 0 : vai.hashCode()) ^ 1000003;
    }
}
