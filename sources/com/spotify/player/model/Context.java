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

@JsonInclude(Include.NON_DEFAULT)
@JsonDeserialize(builder = Builder.class)
public abstract class Context {
    public static final Context EMPTY = builder().build();

    public static abstract class Builder {
        public abstract Context build();

        @JsonProperty("metadata")
        public abstract Builder metadata(Map<String, String> map);

        /* access modifiers changed from: 0000 */
        public abstract Builder pages(ImmutableList<ContextPage> immutableList);

        @JsonProperty("restrictions")
        public abstract Builder restrictions(Restrictions restrictions);

        @JsonAlias({"entity_uri"})
        @JsonProperty("uri")
        public abstract Builder uri(String str);

        @JsonProperty("url")
        public abstract Builder url(String str);

        @JsonCreator
        public static Builder builder() {
            return Context.builder();
        }

        @JsonProperty("pages")
        public Builder pages(List<ContextPage> list) {
            return pages(ImmutableList.a((Collection<? extends E>) list));
        }
    }

    @JsonProperty("metadata")
    public abstract ImmutableMap<String, String> metadata();

    @JsonProperty("pages")
    public abstract Optional<ImmutableList<ContextPage>> pages();

    @JsonProperty("restrictions")
    public abstract Restrictions restrictions();

    public abstract Builder toBuilder();

    @JsonProperty("uri")
    public abstract String uri();

    @JsonProperty("url")
    public abstract String url();

    public static Builder builder() {
        String str = "";
        return new Builder().uri(str).url(str).metadata(Collections.emptyMap()).restrictions(Restrictions.EMPTY);
    }
}
