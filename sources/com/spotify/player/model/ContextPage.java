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

@JsonDeserialize(builder = Builder.class)
public abstract class ContextPage {
    public static final ContextPage EMPTY = builder().build();

    public static abstract class Builder {
        public abstract ContextPage build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        @JsonProperty("next_page_url")
        public abstract Builder nextPageUrl(String str);

        @JsonProperty("page_url")
        public abstract Builder pageUrl(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder tracks(ImmutableList<ContextTrack> immutableList);

        @JsonCreator
        public static Builder builder() {
            return ContextPage.builder();
        }

        @JsonProperty("tracks")
        public Builder tracks(List<ContextTrack> list) {
            return tracks(ImmutableList.a((Collection<? extends E>) list));
        }
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("next_page_url")
    public abstract String nextPageUrl();

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("page_url")
    public abstract String pageUrl();

    public abstract Builder toBuilder();

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracks")
    public abstract Optional<ImmutableList<ContextTrack>> tracks();

    public static Builder builder() {
        String str = "";
        return new Builder().pageUrl(str).nextPageUrl(str).metadata(Collections.emptyMap());
    }
}
