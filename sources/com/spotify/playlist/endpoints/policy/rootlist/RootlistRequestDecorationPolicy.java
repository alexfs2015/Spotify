package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class RootlistRequestDecorationPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(Boolean bool);

        RootlistRequestDecorationPolicy a();

        a b(Boolean bool);

        a c(Boolean bool);
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("isLoadingContents")
    public abstract Boolean isLoadingContents();

    public abstract a toBuilder();

    @JsonProperty("unfilteredLength")
    public abstract Boolean unfilteredLength();

    @JsonProperty("unrangedLength")
    public abstract Boolean unrangedLength();
}
