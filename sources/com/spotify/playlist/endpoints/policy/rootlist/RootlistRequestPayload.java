package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class RootlistRequestPayload implements Parcelable, JacksonModel {

    public interface a {
        a a(FolderRequestPolicy folderRequestPolicy);

        RootlistRequestPayload a();
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("policy")
    public abstract FolderRequestPolicy policy();

    public abstract a toBuilder();
}
