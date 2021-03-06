package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonDeserialize(using = Storylines_Deserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Storylines implements JacksonModel {
    private final Set<String> mEntityUris;

    @JsonCreator
    public Storylines(@JsonProperty("entityUris") String[] strArr) {
        this((Set<String>) ImmutableSet.a((E[]) strArr));
    }

    public Storylines(Set<String> set) {
        this.mEntityUris = set;
    }

    public Set<String> getEntityUris() {
        return this.mEntityUris;
    }

    public boolean containsEntity(String str) {
        return this.mEntityUris.contains(str);
    }
}
