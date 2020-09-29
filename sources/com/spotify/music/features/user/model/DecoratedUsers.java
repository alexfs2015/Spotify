package com.spotify.music.features.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DecoratedUsers implements JacksonModel {
    @JsonProperty("users")
    public final List<DecoratedUser> decoratedUsers;

    public DecoratedUsers(@JsonProperty("users") List<DecoratedUser> list) {
        if (list == null) {
            list = Lists.a();
        }
        this.decoratedUsers = list;
    }
}
