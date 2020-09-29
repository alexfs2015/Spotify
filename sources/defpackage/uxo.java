package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootResponse;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: uxo reason: default package */
interface uxo {
    @GET("sp://core-playlist/v1/rootlist/{folderId}")
    Single<ProtoPlaylistRootResponse> a(@Path("folderId") String str, @QueryMap Map<String, String> map);

    @GET("sp://core-playlist/v1/rootlist/{folderId}")
    Single<ProtoPlaylistRootResponse> a(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @GET("sp://core-playlist/v1/rootlist")
    Single<ProtoPlaylistRootResponse> a(@QueryMap Map<String, String> map);

    @GET("sp://core-playlist/v1/rootlist")
    Single<ProtoPlaylistRootResponse> a(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @SUB("sp://core-playlist/v1/rootlist/{folderId}")
    Observable<ProtoPlaylistRootResponse> b(@Path("folderId") String str, @QueryMap Map<String, String> map);

    @SUB("sp://core-playlist/v1/rootlist/{folderId}")
    Observable<ProtoPlaylistRootResponse> b(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @SUB("sp://core-playlist/v1/rootlist")
    Observable<ProtoPlaylistRootResponse> b(@QueryMap Map<String, String> map);

    @SUB("sp://core-playlist/v1/rootlist")
    Observable<ProtoPlaylistRootResponse> b(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);
}
