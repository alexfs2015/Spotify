package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class ListPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        ListPolicy a();

        a b(ImmutableMap<String, Boolean> immutableMap);

        a c(ImmutableMap<String, Boolean> immutableMap);

        a d(ImmutableMap<String, Boolean> immutableMap);

        a e(ImmutableMap<String, Boolean> immutableMap);
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("addedBy")
    public abstract ImmutableMap<String, Boolean> addedByAttributes();

    @JsonProperty("album")
    public abstract ImmutableMap<String, Boolean> albumAttributes();

    @JsonProperty("artists")
    public abstract ImmutableMap<String, Boolean> artistsAttributes();

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> attributes();

    @JsonProperty("show")
    public abstract ImmutableMap<String, Boolean> showAttributes();

    public abstract a toBuilder();
}
