package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

final class AutoValue_ContextPage extends ContextPage {
    private final ImmutableMap<String, String> metadata;
    private final String nextPageUrl;
    private final String pageUrl;
    private final Optional<ImmutableList<ContextTrack>> tracks;

    static final class Builder extends com.spotify.player.model.ContextPage.Builder {
        private ImmutableMap<String, String> metadata;
        private String nextPageUrl;
        private String pageUrl;
        private Optional<ImmutableList<ContextTrack>> tracks;

        Builder() {
            this.tracks = Optional.e();
        }

        private Builder(ContextPage contextPage) {
            this.tracks = Optional.e();
            this.pageUrl = contextPage.pageUrl();
            this.nextPageUrl = contextPage.nextPageUrl();
            this.tracks = contextPage.tracks();
            this.metadata = contextPage.metadata();
        }

        public final com.spotify.player.model.ContextPage.Builder pageUrl(String str) {
            if (str != null) {
                this.pageUrl = str;
                return this;
            }
            throw new NullPointerException("Null pageUrl");
        }

        public final com.spotify.player.model.ContextPage.Builder nextPageUrl(String str) {
            if (str != null) {
                this.nextPageUrl = str;
                return this;
            }
            throw new NullPointerException("Null nextPageUrl");
        }

        /* access modifiers changed from: 0000 */
        public final com.spotify.player.model.ContextPage.Builder tracks(ImmutableList<ContextTrack> immutableList) {
            this.tracks = Optional.b(immutableList);
            return this;
        }

        public final com.spotify.player.model.ContextPage.Builder metadata(Map<String, String> map) {
            this.metadata = ImmutableMap.a(map);
            return this;
        }

        public final ContextPage build() {
            String str = "";
            if (this.pageUrl == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" pageUrl");
                str = sb.toString();
            }
            if (this.nextPageUrl == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" nextPageUrl");
                str = sb2.toString();
            }
            if (this.metadata == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" metadata");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_ContextPage autoValue_ContextPage = new AutoValue_ContextPage(this.pageUrl, this.nextPageUrl, this.tracks, this.metadata);
                return autoValue_ContextPage;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_ContextPage(String str, String str2, Optional<ImmutableList<ContextTrack>> optional, ImmutableMap<String, String> immutableMap) {
        this.pageUrl = str;
        this.nextPageUrl = str2;
        this.tracks = optional;
        this.metadata = immutableMap;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("page_url")
    public final String pageUrl() {
        return this.pageUrl;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("next_page_url")
    public final String nextPageUrl() {
        return this.nextPageUrl;
    }

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracks")
    public final Optional<ImmutableList<ContextTrack>> tracks() {
        return this.tracks;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("metadata")
    public final ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextPage{pageUrl=");
        sb.append(this.pageUrl);
        sb.append(", nextPageUrl=");
        sb.append(this.nextPageUrl);
        sb.append(", tracks=");
        sb.append(this.tracks);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextPage) {
            ContextPage contextPage = (ContextPage) obj;
            return this.pageUrl.equals(contextPage.pageUrl()) && this.nextPageUrl.equals(contextPage.nextPageUrl()) && this.tracks.equals(contextPage.tracks()) && this.metadata.equals(contextPage.metadata());
        }
    }

    public final int hashCode() {
        return ((((((this.pageUrl.hashCode() ^ 1000003) * 1000003) ^ this.nextPageUrl.hashCode()) * 1000003) ^ this.tracks.hashCode()) * 1000003) ^ this.metadata.hashCode();
    }

    public final com.spotify.player.model.ContextPage.Builder toBuilder() {
        return new Builder(this);
    }
}
