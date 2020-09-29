package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: vjq reason: default package */
interface vjq {
    @GET("sp://core-playlist/v1/rootlist/{folderId}")
    Single<Response> a(@Path("folderId") String str, @QueryMap Map<String, String> map);

    @GET("sp://core-playlist/v1/rootlist/{folderId}")
    Single<Response> a(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @GET("sp://core-playlist/v1/rootlist")
    Single<Response> a(@QueryMap Map<String, String> map);

    @GET("sp://core-playlist/v1/rootlist")
    Single<Response> a(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @SUB("sp://core-playlist/v1/rootlist/{folderId}")
    Observable<Response> b(@Path("folderId") String str, @QueryMap Map<String, String> map);

    @SUB("sp://core-playlist/v1/rootlist/{folderId}")
    Observable<Response> b(@Path("folderId") String str, @QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);

    @SUB("sp://core-playlist/v1/rootlist")
    Observable<Response> b(@QueryMap Map<String, String> map);

    @SUB("sp://core-playlist/v1/rootlist")
    Observable<Response> b(@QueryMap Map<String, String> map, @Body RootlistRequestPayload rootlistRequestPayload);
}
