package com.spotify.playlist.endpoints.policy.playlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class DecorationPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(HeaderPolicy headerPolicy);

        a a(ListPolicy listPolicy);

        DecorationPolicy a();
    }

    @JsonProperty("header")
    public abstract HeaderPolicy headerPolicy();

    @JsonProperty("list")
    public abstract ListPolicy listPolicy();

    public abstract a toBuilder();

    public static a builder() {
        return new a();
    }
}
