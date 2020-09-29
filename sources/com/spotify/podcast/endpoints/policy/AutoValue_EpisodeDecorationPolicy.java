package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;

final class AutoValue_EpisodeDecorationPolicy extends EpisodeDecorationPolicy {
    private final ImmutableMap<String, Boolean> episodeAttributes;
    private final KeyValuePolicy showDecorationPolicy;

    static final class a implements com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a {
        private KeyValuePolicy a;
        private ImmutableMap<String, Boolean> b;

        a() {
        }

        private a(EpisodeDecorationPolicy episodeDecorationPolicy) {
            this.a = episodeDecorationPolicy.showDecorationPolicy();
            this.b = episodeDecorationPolicy.episodeAttributes();
        }

        /* synthetic */ a(EpisodeDecorationPolicy episodeDecorationPolicy, byte b2) {
            this(episodeDecorationPolicy);
        }

        public final com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a a(ImmutableMap<String, Boolean> immutableMap) {
            this.b = immutableMap;
            return this;
        }

        public final com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a a(KeyValuePolicy keyValuePolicy) {
            this.a = keyValuePolicy;
            return this;
        }

        public final EpisodeDecorationPolicy a() {
            return new AutoValue_EpisodeDecorationPolicy(this.a, this.b);
        }
    }

    private AutoValue_EpisodeDecorationPolicy(KeyValuePolicy keyValuePolicy, ImmutableMap<String, Boolean> immutableMap) {
        this.showDecorationPolicy = keyValuePolicy;
        this.episodeAttributes = immutableMap;
    }

    @JsonAnyGetter
    public final ImmutableMap<String, Boolean> episodeAttributes() {
        return this.episodeAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EpisodeDecorationPolicy) {
            EpisodeDecorationPolicy episodeDecorationPolicy = (EpisodeDecorationPolicy) obj;
            KeyValuePolicy keyValuePolicy = this.showDecorationPolicy;
            if (keyValuePolicy != null ? keyValuePolicy.equals(episodeDecorationPolicy.showDecorationPolicy()) : episodeDecorationPolicy.showDecorationPolicy() == null) {
                ImmutableMap<String, Boolean> immutableMap = this.episodeAttributes;
                return immutableMap != null ? immutableMap.equals(episodeDecorationPolicy.episodeAttributes()) : episodeDecorationPolicy.episodeAttributes() == null;
            }
        }
    }

    public final int hashCode() {
        KeyValuePolicy keyValuePolicy = this.showDecorationPolicy;
        int i = 0;
        int hashCode = ((keyValuePolicy == null ? 0 : keyValuePolicy.hashCode()) ^ 1000003) * 1000003;
        ImmutableMap<String, Boolean> immutableMap = this.episodeAttributes;
        if (immutableMap != null) {
            i = immutableMap.hashCode();
        }
        return hashCode ^ i;
    }

    @JsonProperty("show")
    public final KeyValuePolicy showDecorationPolicy() {
        return this.showDecorationPolicy;
    }

    public final com.spotify.podcast.endpoints.policy.EpisodeDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeDecorationPolicy{showDecorationPolicy=");
        sb.append(this.showDecorationPolicy);
        sb.append(", episodeAttributes=");
        sb.append(this.episodeAttributes);
        sb.append("}");
        return sb.toString();
    }
}
