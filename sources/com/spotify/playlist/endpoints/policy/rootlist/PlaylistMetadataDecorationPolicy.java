package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class PlaylistMetadataDecorationPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(PlaylistUserDecorationPolicy playlistUserDecorationPolicy);

        a a(Boolean bool);

        PlaylistMetadataDecorationPolicy a();

        a b(PlaylistUserDecorationPolicy playlistUserDecorationPolicy);

        a b(Boolean bool);

        a c(Boolean bool);

        a d(Boolean bool);

        a e(Boolean bool);

        a f(Boolean bool);

        a g(Boolean bool);

        a h(Boolean bool);

        a i(Boolean bool);

        a j(Boolean bool);

        a k(Boolean bool);

        a l(Boolean bool);
    }

    public static a builder() {
        return new a();
    }

    @JsonProperty("addTime")
    public abstract Boolean addTime();

    @JsonProperty("browsableOffline")
    public abstract Boolean browsableOffline();

    @JsonProperty("canReportAnnotationAbuse")
    public abstract Boolean canReportAnnotationAbuse();

    @JsonProperty("collaborative")
    public abstract Boolean collaborative();

    @JsonProperty("description")
    public abstract Boolean description();

    @JsonProperty("descriptionFromAnnotate")
    public abstract Boolean descriptionFromAnnotate();

    @JsonProperty("duration")
    public abstract Boolean duration();

    @JsonProperty("followed")
    public abstract Boolean followed();

    @JsonProperty("followers")
    public abstract Boolean followers();

    @JsonProperty("formatListAttributes")
    public abstract Boolean formatListAttributes();

    @JsonProperty("formatListType")
    public abstract Boolean formatListType();

    @JsonProperty("isOnDemandInFree")
    public abstract Boolean isOnDemandInFree();

    @JsonProperty("lastModification")
    public abstract Boolean lastModification();

    @JsonProperty("length")
    public abstract Boolean length();

    @JsonProperty("link")
    public abstract Boolean link();

    @JsonProperty("loadState")
    public abstract Boolean loadState();

    @JsonProperty("loaded")
    public abstract Boolean loaded();

    @JsonProperty("madeFor")
    public abstract PlaylistUserDecorationPolicy madeFor();

    @JsonProperty("name")
    public abstract Boolean name();

    @JsonProperty("offline")
    public abstract Boolean offline();

    @JsonProperty("ownedBySelf")
    public abstract Boolean ownedBySelf();

    @JsonProperty("owner")
    public abstract PlaylistUserDecorationPolicy owner();

    @JsonProperty("picture")
    public abstract Boolean picture();

    @JsonProperty("pictureFromAnnotate")
    public abstract Boolean pictureFromAnnotate();

    @JsonProperty("playable")
    public abstract Boolean playable();

    @JsonProperty("published")
    public abstract Boolean published();

    @JsonProperty("rowId")
    public abstract Boolean rowId();

    @JsonProperty("syncProgress")
    public abstract Boolean syncProgress();

    public abstract a toBuilder();

    @JsonProperty("totalLength")
    public abstract Boolean totalLength();
}
