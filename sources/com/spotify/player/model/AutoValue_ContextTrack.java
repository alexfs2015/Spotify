package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

final class AutoValue_ContextTrack extends ContextTrack {
    private final ImmutableMap<String, String> metadata;
    private final String provider;
    private final String uid;
    private final String uri;

    static final class Builder extends com.spotify.player.model.ContextTrack.Builder {
        private ImmutableMap<String, String> metadata;
        private String provider;
        private String uid;
        private String uri;

        Builder() {
        }

        private Builder(ContextTrack contextTrack) {
            this.uri = contextTrack.uri();
            this.uid = contextTrack.uid();
            this.metadata = contextTrack.metadata();
            this.provider = contextTrack.provider();
        }

        public final com.spotify.player.model.ContextTrack.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final com.spotify.player.model.ContextTrack.Builder uid(String str) {
            if (str != null) {
                this.uid = str;
                return this;
            }
            throw new NullPointerException("Null uid");
        }

        public final com.spotify.player.model.ContextTrack.Builder metadata(Map<String, String> map) {
            this.metadata = ImmutableMap.a(map);
            return this;
        }

        public final com.spotify.player.model.ContextTrack.Builder provider(String str) {
            if (str != null) {
                this.provider = str;
                return this;
            }
            throw new NullPointerException("Null provider");
        }

        public final ContextTrack build() {
            String str = "";
            if (this.uri == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.uid == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uid");
                str = sb2.toString();
            }
            if (this.metadata == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" metadata");
                str = sb3.toString();
            }
            if (this.provider == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" provider");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                AutoValue_ContextTrack autoValue_ContextTrack = new AutoValue_ContextTrack(this.uri, this.uid, this.metadata, this.provider);
                return autoValue_ContextTrack;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private AutoValue_ContextTrack(String str, String str2, ImmutableMap<String, String> immutableMap, String str3) {
        this.uri = str;
        this.uid = str2;
        this.metadata = immutableMap;
        this.provider = str3;
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("uid")
    public final String uid() {
        return this.uid;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("metadata")
    public final ImmutableMap<String, String> metadata() {
        return this.metadata;
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("provider")
    public final String provider() {
        return this.provider;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextTrack{uri=");
        sb.append(this.uri);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextTrack) {
            ContextTrack contextTrack = (ContextTrack) obj;
            return this.uri.equals(contextTrack.uri()) && this.uid.equals(contextTrack.uid()) && this.metadata.equals(contextTrack.metadata()) && this.provider.equals(contextTrack.provider());
        }
    }

    public final int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.uid.hashCode()) * 1000003) ^ this.metadata.hashCode()) * 1000003) ^ this.provider.hashCode();
    }

    public final com.spotify.player.model.ContextTrack.Builder toBuilder() {
        return new Builder(this);
    }
}
