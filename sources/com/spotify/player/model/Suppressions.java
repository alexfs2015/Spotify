package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@JsonInclude(Include.NON_EMPTY)
public abstract class Suppressions {
    public static final Suppressions EMPTY = create();

    public static Suppressions create() {
        return create(Collections.emptySet());
    }

    @JsonCreator
    public static Suppressions create(@JsonProperty("providers") Set<String> set) {
        return new AutoValue_Suppressions(set == null ? ImmutableSet.h() : ImmutableSet.a((Collection<? extends E>) set));
    }

    @JsonProperty("providers")
    public abstract ImmutableSet<String> providers();
}
