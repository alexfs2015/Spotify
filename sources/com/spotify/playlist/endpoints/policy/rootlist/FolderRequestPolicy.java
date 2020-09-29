package com.spotify.playlist.endpoints.policy.rootlist;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonInclude(Include.NON_NULL)
public abstract class FolderRequestPolicy implements Parcelable, JacksonModel {

    public interface a {
        a a(FolderMetadataDecorationPolicy folderMetadataDecorationPolicy);

        a a(PlaylistMetadataDecorationPolicy playlistMetadataDecorationPolicy);

        a a(RootlistRequestDecorationPolicy rootlistRequestDecorationPolicy);

        FolderRequestPolicy a();
    }

    @JsonProperty("folder")
    public abstract FolderMetadataDecorationPolicy folder();

    @JsonProperty("playlist")
    public abstract PlaylistMetadataDecorationPolicy playlist();

    @JsonProperty("request")
    public abstract RootlistRequestDecorationPolicy request();

    public abstract a toBuilder();

    public static a builder() {
        a aVar = new a();
        aVar.a = PlaylistMetadataDecorationPolicy.builder().a();
        return aVar.a(FolderMetadataDecorationPolicy.builder().a()).a(RootlistRequestDecorationPolicy.builder().a());
    }
}
