package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_DecorationPolicy extends DecorationPolicy {
    private final EpisodeDecorationPolicy episodeDecorationPolicy;

    static final class a implements com.spotify.podcast.endpoints.policy.DecorationPolicy.a {
        private EpisodeDecorationPolicy a;

        a() {
        }

        private a(DecorationPolicy decorationPolicy) {
            this.a = decorationPolicy.episodeDecorationPolicy();
        }

        /* synthetic */ a(DecorationPolicy decorationPolicy, byte b) {
            this(decorationPolicy);
        }

        public final com.spotify.podcast.endpoints.policy.DecorationPolicy.a a(EpisodeDecorationPolicy episodeDecorationPolicy) {
            this.a = episodeDecorationPolicy;
            return this;
        }

        public final DecorationPolicy a() {
            return new AutoValue_DecorationPolicy(this.a);
        }
    }

    private AutoValue_DecorationPolicy(EpisodeDecorationPolicy episodeDecorationPolicy2) {
        this.episodeDecorationPolicy = episodeDecorationPolicy2;
    }

    @JsonProperty("episode")
    public final EpisodeDecorationPolicy episodeDecorationPolicy() {
        return this.episodeDecorationPolicy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationPolicy)) {
            return false;
        }
        DecorationPolicy decorationPolicy = (DecorationPolicy) obj;
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        EpisodeDecorationPolicy episodeDecorationPolicy3 = decorationPolicy.episodeDecorationPolicy();
        return episodeDecorationPolicy2 == null ? episodeDecorationPolicy3 == null : episodeDecorationPolicy2.equals(episodeDecorationPolicy3);
    }

    public final int hashCode() {
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        return (episodeDecorationPolicy2 == null ? 0 : episodeDecorationPolicy2.hashCode()) ^ 1000003;
    }

    public final com.spotify.podcast.endpoints.policy.DecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecorationPolicy{episodeDecorationPolicy=");
        sb.append(this.episodeDecorationPolicy);
        sb.append("}");
        return sb.toString();
    }
}
