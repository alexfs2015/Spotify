package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class HeaderPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        HeaderPolicy a();

        a b(ImmutableMap<String, Boolean> immutableMap);

        a c(ImmutableMap<String, Boolean> immutableMap);
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> attributes();

    @JsonProperty("madeFor")
    public abstract ImmutableMap<String, Boolean> madeForAttributes();

    @JsonProperty("owner")
    public abstract ImmutableMap<String, Boolean> ownerAttributes();

    public abstract a toBuilder();

    public static a builder() {
        return new a();
    }
}
