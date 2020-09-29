package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonAlias;
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
public abstract class Context {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return Context.builder("");
        }

        public abstract Context build();

        public abstract Builder metadata(ImmutableMap<String, String> immutableMap);

        @JsonProperty("metadata")
        public Builder metadata(Map<String, String> map) {
            return metadata(ImmutableMap.a(map));
        }

        public abstract Builder pages(ImmutableList<ContextPage> immutableList);

        @JsonProperty("pages")
        public Builder pages(List<ContextPage> list) {
            return pages(ImmutableList.a((Collection<? extends E>) list));
        }

        @JsonProperty("restrictions")
        public abstract Builder restrictions(Restrictions restrictions);

        @JsonAlias({"entity_uri"})
        @JsonProperty("uri")
        public abstract Builder uri(String str);

        @JsonProperty("url")
        public abstract Builder url(String str);
    }

    public static Builder builder(String str) {
        return new Builder().uri(str).url("").metadata(Collections.emptyMap());
    }

    public static Context fromUri(String str) {
        Builder builder = builder(str);
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        return builder.url(sb.toString()).build();
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty("pages")
    public abstract Optional<ImmutableList<ContextPage>> pages();

    @JsonProperty("restrictions")
    public abstract Optional<Restrictions> restrictions();

    public abstract Builder toBuilder();

    @JsonProperty("uri")
    public abstract String uri();

    @JsonProperty("url")
    public abstract String url();
}
