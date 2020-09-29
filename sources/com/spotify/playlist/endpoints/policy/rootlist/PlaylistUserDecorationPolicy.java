package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class PlaylistUserDecorationPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(Boolean bool);

        PlaylistUserDecorationPolicy a();

        a b(Boolean bool);

        a c(Boolean bool);
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("link")
    public abstract Boolean link();

    @JsonProperty("name")
    public abstract Boolean name();

    public abstract a toBuilder();

    @JsonProperty("username")
    public abstract Boolean username();
}
