package com.spotify.music.genie.omakasse;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.genie.omakasse.$AutoValue_OmakaseRequest reason: invalid class name */
abstract class C$AutoValue_OmakaseRequest extends OmakaseRequest {
    private final boolean doNotAllowPullRequest;
    private final int numberOfResults;

    C$AutoValue_OmakaseRequest(boolean z, int i) {
        this.doNotAllowPullRequest = z;
        this.numberOfResults = i;
    }

    @JsonProperty("doNotAllowPullContext")
    public boolean isDoNotAllowPullRequest() {
        return this.doNotAllowPullRequest;
    }

    @JsonProperty("numberOfResults")
    public int getNumberOfResults() {
        return this.numberOfResults;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmakaseRequest{doNotAllowPullRequest=");
        sb.append(this.doNotAllowPullRequest);
        sb.append(", numberOfResults=");
        sb.append(this.numberOfResults);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OmakaseRequest) {
            OmakaseRequest omakaseRequest = (OmakaseRequest) obj;
            return this.doNotAllowPullRequest == omakaseRequest.isDoNotAllowPullRequest() && this.numberOfResults == omakaseRequest.getNumberOfResults();
        }
    }

    public int hashCode() {
        return (((this.doNotAllowPullRequest ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.numberOfResults;
    }
}
