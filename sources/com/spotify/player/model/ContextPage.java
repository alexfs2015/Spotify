package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@JsonInclude(Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class ContextPage {
    public static final ContextPage EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return ContextPage.builder();
        }

        public abstract ContextPage build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        @JsonProperty("next_page_url")
        public abstract Builder nextPageUrl(String str);

        @JsonProperty("page_url")
        public abstract Builder pageUrl(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder tracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("tracks")
        public Builder tracks(List<ContextTrack> list) {
            return tracks(ImmutableList.a((Collection<? extends E>) list));
        }
    }

    public static Builder builder() {
        String str = "";
        return new Builder().pageUrl(str).nextPageUrl(str).metadata(Collections.emptyMap());
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty("next_page_url")
    public abstract String nextPageUrl();

    @JsonProperty("page_url")
    public abstract String pageUrl();

    public abstract Builder toBuilder();

    @JsonProperty("tracks")
    public abstract Optional<ImmutableList<ContextTrack>> tracks();
}
