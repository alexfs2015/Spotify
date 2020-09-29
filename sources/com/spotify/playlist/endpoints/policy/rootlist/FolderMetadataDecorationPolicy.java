package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class FolderMetadataDecorationPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(Boolean bool);

        FolderMetadataDecorationPolicy a();

        a b(Boolean bool);

        a c(Boolean bool);

        a d(Boolean bool);

        a e(Boolean bool);

        a f(Boolean bool);

        a g(Boolean bool);
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("addTime")
    public abstract Boolean addTime();

    @JsonProperty("folders")
    public abstract Boolean folders();

    @JsonProperty("id")
    public abstract Boolean id();

    @JsonProperty("link")
    public abstract Boolean link();

    @JsonProperty("name")
    public abstract Boolean name();

    @JsonProperty("playlists")
    public abstract Boolean playlists();

    @JsonProperty("recursiveFolders")
    public abstract Boolean recursiveFolders();

    @JsonProperty("recursivePlaylists")
    public abstract Boolean recursivePlaylists();

    @JsonProperty("rowId")
    public abstract Boolean rowId();

    @JsonProperty("rows")
    public abstract Boolean rows();

    public abstract a toBuilder();
}
