package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

final class AutoValue_Context extends Context {
    private final ImmutableMap<String, String> metadata;
    private final Optional<ImmutableList<ContextPage>> pages;
    private final Restrictions restrictions;
    private final String uri;
    private final String url;

    static final class Builder extends com.spotify.player.model.Context.Builder {
        private ImmutableMap<String, String> metadata;
        private Optional<ImmutableList<ContextPage>> pages;
        private Restrictions restrictions;
        private String uri;
        private String url;

        Builder() {
            this.pages = Optional.e();
        }

        private Builder(Context context) {
            this.pages = Optional.e();
            this.uri = context.uri();
            this.url = context.url();
            this.metadata = context.metadata();
            this.pages = context.pages();
            this.restrictions = context.restrictions();
        }

        public final com.spotify.player.model.Context.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final com.spotify.player.model.Context.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            throw new NullPointerException("Null url");
        }

        public final com.spotify.player.model.Context.Builder metadata(Map<String, String> map) {
            this.metadata = ImmutableMap.a(map);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final com.spotify.player.model.Context.Builder pages(ImmutableList<ContextPage> immutableList) {
            this.pages = Optional.b(immutableList);
            return this;
        }

        public final com.spotify.player.model.Context.Builder restrictions(Restrictions restrictions2) {
            if (restrictions2 != null) {
                this.restrictions = restrictions2;
                return this;
            }
            throw new NullPointerException("Null restrictions");
        }

        public final Context build() {
            String str = "";
            if (this.uri == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.url == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" url");
                str = sb2.toString();
            }
            if (this.metadata == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" metadata");
                str = sb3.toString();
            }
            if (this.restrictions == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" restrictions");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_Context autoValue_Context = new AutoValue_Context(this.uri, this.url, this.metadata, this.pages, this.restrictions);
                return autoValue_Context;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private AutoValue_Context(String str, String str2, ImmutableMap<String, String> immutableMap, Optional<ImmutableList<ContextPage>> optional, Restrictions restrictions2) {
        this.uri = str;
        this.url = str2;
        this.metadata = immutableMap;
        this.pages = optional;
        this.restrictions = restrictions2;
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    @JsonProperty("url")
    public final String url() {
        return this.url;
    }

    @JsonProperty("metadata")
    public final ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    @JsonProperty("pages")
    public final Optional<ImmutableList<ContextPage>> pages() {
        return this.pages;
    }

    @JsonProperty("restrictions")
    public final Restrictions restrictions() {
        return this.restrictions;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Context{uri=");
        sb.append(this.uri);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", pages=");
        sb.append(this.pages);
        sb.append(", restrictions=");
        sb.append(this.restrictions);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Context) {
            Context context = (Context) obj;
            return this.uri.equals(context.uri()) && this.url.equals(context.url()) && this.metadata.equals(context.metadata()) && this.pages.equals(context.pages()) && this.restrictions.equals(context.restrictions());
        }
    }

    public final int hashCode() {
        return ((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.pages.hashCode()) * 1000003) ^ this.restrictions.hashCode();
    }

    public final com.spotify.player.model.Context.Builder toBuilder() {
        return new Builder(this);
    }
}
