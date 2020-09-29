package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

final class AutoValue_SkipToTrack extends SkipToTrack {
    private final Optional<Long> pageIndex;
    private final Optional<String> pageUrl;
    private final Optional<Long> trackIndex;
    private final Optional<String> trackUid;
    private final Optional<String> trackUri;

    static final class Builder extends com.spotify.player.model.command.options.SkipToTrack.Builder {
        private Optional<Long> pageIndex;
        private Optional<String> pageUrl;
        private Optional<Long> trackIndex;
        private Optional<String> trackUid;
        private Optional<String> trackUri;

        Builder() {
            this.pageUrl = Optional.e();
            this.pageIndex = Optional.e();
            this.trackUid = Optional.e();
            this.trackUri = Optional.e();
            this.trackIndex = Optional.e();
        }

        private Builder(SkipToTrack skipToTrack) {
            this.pageUrl = Optional.e();
            this.pageIndex = Optional.e();
            this.trackUid = Optional.e();
            this.trackUri = Optional.e();
            this.trackIndex = Optional.e();
            this.pageUrl = skipToTrack.pageUrl();
            this.pageIndex = skipToTrack.pageIndex();
            this.trackUid = skipToTrack.trackUid();
            this.trackUri = skipToTrack.trackUri();
            this.trackIndex = skipToTrack.trackIndex();
        }

        public final com.spotify.player.model.command.options.SkipToTrack.Builder pageUrl(String str) {
            this.pageUrl = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.SkipToTrack.Builder pageIndex(Long l) {
            this.pageIndex = Optional.b(l);
            return this;
        }

        public final com.spotify.player.model.command.options.SkipToTrack.Builder trackUid(String str) {
            this.trackUid = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.SkipToTrack.Builder trackUri(String str) {
            this.trackUri = Optional.b(str);
            return this;
        }

        public final com.spotify.player.model.command.options.SkipToTrack.Builder trackIndex(Long l) {
            this.trackIndex = Optional.b(l);
            return this;
        }

        public final SkipToTrack build() {
            AutoValue_SkipToTrack autoValue_SkipToTrack = new AutoValue_SkipToTrack(this.pageUrl, this.pageIndex, this.trackUid, this.trackUri, this.trackIndex);
            return autoValue_SkipToTrack;
        }
    }

    private AutoValue_SkipToTrack(Optional<String> optional, Optional<Long> optional2, Optional<String> optional3, Optional<String> optional4, Optional<Long> optional5) {
        this.pageUrl = optional;
        this.pageIndex = optional2;
        this.trackUid = optional3;
        this.trackUri = optional4;
        this.trackIndex = optional5;
    }

    @JsonProperty("page_url")
    public final Optional<String> pageUrl() {
        return this.pageUrl;
    }

    @JsonProperty("page_index")
    public final Optional<Long> pageIndex() {
        return this.pageIndex;
    }

    @JsonProperty("track_uid")
    public final Optional<String> trackUid() {
        return this.trackUid;
    }

    @JsonProperty("track_uri")
    public final Optional<String> trackUri() {
        return this.trackUri;
    }

    @JsonProperty("track_index")
    public final Optional<Long> trackIndex() {
        return this.trackIndex;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipToTrack{pageUrl=");
        sb.append(this.pageUrl);
        sb.append(", pageIndex=");
        sb.append(this.pageIndex);
        sb.append(", trackUid=");
        sb.append(this.trackUid);
        sb.append(", trackUri=");
        sb.append(this.trackUri);
        sb.append(", trackIndex=");
        sb.append(this.trackIndex);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SkipToTrack) {
            SkipToTrack skipToTrack = (SkipToTrack) obj;
            return this.pageUrl.equals(skipToTrack.pageUrl()) && this.pageIndex.equals(skipToTrack.pageIndex()) && this.trackUid.equals(skipToTrack.trackUid()) && this.trackUri.equals(skipToTrack.trackUri()) && this.trackIndex.equals(skipToTrack.trackIndex());
        }
    }

    public final int hashCode() {
        return ((((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.pageIndex.hashCode()) * 1000003) ^ this.trackUid.hashCode()) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.trackIndex.hashCode();
    }

    public final com.spotify.player.model.command.options.SkipToTrack.Builder toBuilder() {
        return new Builder(this);
    }
}
