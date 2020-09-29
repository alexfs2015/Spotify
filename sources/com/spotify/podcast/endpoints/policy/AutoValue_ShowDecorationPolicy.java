package com.spotify.podcast.endpoints.policy;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_ShowDecorationPolicy extends ShowDecorationPolicy {
    private final KeyValuePolicy auxiliarySectionsPolicy;
    private final EpisodeDecorationPolicy episodeDecorationPolicy;
    private final KeyValuePolicy headerPolicy;

    static final class a implements com.spotify.podcast.endpoints.policy.ShowDecorationPolicy.a {
        private EpisodeDecorationPolicy a;
        private KeyValuePolicy b;
        private KeyValuePolicy c;

        a() {
        }

        private a(ShowDecorationPolicy showDecorationPolicy) {
            this.a = showDecorationPolicy.episodeDecorationPolicy();
            this.b = showDecorationPolicy.headerPolicy();
            this.c = showDecorationPolicy.auxiliarySectionsPolicy();
        }

        /* synthetic */ a(ShowDecorationPolicy showDecorationPolicy, byte b2) {
            this(showDecorationPolicy);
        }
    }

    private AutoValue_ShowDecorationPolicy(EpisodeDecorationPolicy episodeDecorationPolicy2, KeyValuePolicy keyValuePolicy, KeyValuePolicy keyValuePolicy2) {
        this.episodeDecorationPolicy = episodeDecorationPolicy2;
        this.headerPolicy = keyValuePolicy;
        this.auxiliarySectionsPolicy = keyValuePolicy2;
    }

    @JsonProperty("sections")
    public final KeyValuePolicy auxiliarySectionsPolicy() {
        return this.auxiliarySectionsPolicy;
    }

    @JsonProperty("list")
    public final EpisodeDecorationPolicy episodeDecorationPolicy() {
        return this.episodeDecorationPolicy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShowDecorationPolicy) {
            ShowDecorationPolicy showDecorationPolicy = (ShowDecorationPolicy) obj;
            EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
            if (episodeDecorationPolicy2 != null ? episodeDecorationPolicy2.equals(showDecorationPolicy.episodeDecorationPolicy()) : showDecorationPolicy.episodeDecorationPolicy() == null) {
                KeyValuePolicy keyValuePolicy = this.headerPolicy;
                if (keyValuePolicy != null ? keyValuePolicy.equals(showDecorationPolicy.headerPolicy()) : showDecorationPolicy.headerPolicy() == null) {
                    KeyValuePolicy keyValuePolicy2 = this.auxiliarySectionsPolicy;
                    return keyValuePolicy2 != null ? keyValuePolicy2.equals(showDecorationPolicy.auxiliarySectionsPolicy()) : showDecorationPolicy.auxiliarySectionsPolicy() == null;
                }
            }
        }
    }

    public final int hashCode() {
        EpisodeDecorationPolicy episodeDecorationPolicy2 = this.episodeDecorationPolicy;
        int i = 0;
        int hashCode = ((episodeDecorationPolicy2 == null ? 0 : episodeDecorationPolicy2.hashCode()) ^ 1000003) * 1000003;
        KeyValuePolicy keyValuePolicy = this.headerPolicy;
        int hashCode2 = (hashCode ^ (keyValuePolicy == null ? 0 : keyValuePolicy.hashCode())) * 1000003;
        KeyValuePolicy keyValuePolicy2 = this.auxiliarySectionsPolicy;
        if (keyValuePolicy2 != null) {
            i = keyValuePolicy2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("header")
    public final KeyValuePolicy headerPolicy() {
        return this.headerPolicy;
    }

    public final com.spotify.podcast.endpoints.policy.ShowDecorationPolicy.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDecorationPolicy{episodeDecorationPolicy=");
        sb.append(this.episodeDecorationPolicy);
        sb.append(", headerPolicy=");
        sb.append(this.headerPolicy);
        sb.append(", auxiliarySectionsPolicy=");
        sb.append(this.auxiliarySectionsPolicy);
        sb.append("}");
        return sb.toString();
    }
}
