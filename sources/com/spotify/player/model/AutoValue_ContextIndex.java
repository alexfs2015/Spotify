package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_ContextIndex extends ContextIndex {
    private final long page;
    private final long track;

    AutoValue_ContextIndex(long j, long j2) {
        this.page = j;
        this.track = j2;
    }

    @JsonProperty("page")
    public final long page() {
        return this.page;
    }

    @JsonProperty("track")
    public final long track() {
        return this.track;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextIndex{page=");
        sb.append(this.page);
        sb.append(", track=");
        sb.append(this.track);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextIndex) {
            ContextIndex contextIndex = (ContextIndex) obj;
            return this.page == contextIndex.page() && this.track == contextIndex.track();
        }
    }

    public final int hashCode() {
        long j = this.page;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.track;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }
}
