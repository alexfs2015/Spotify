package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.endpoints.proto.PlaylistContainsRequest.ContainsRequest;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: vjf reason: default package */
public interface vjf {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/playlist/{uri}/contains?responseFormat=protobuf")
    Single<Response> a(@Path("uri") String str, @Body ContainsRequest containsRequest);

    @GET("sp://core-playlist/v1/playlist/{uri}")
    Single<Response> a(@Path("uri") String str, @QueryMap Map<String, String> map);

    @POST("sp://core-playlist/v1/playlist/{uri}/play")
    Single<Response> a(@Path("uri") String str, @QueryMap Map<String, String> map, @Body PlayPayload playPayload);

    @GET("sp://core-playlist/v1/playlist/{uri}")
    Single<Response> a(@Path("uri") String str, @QueryMap Map<String, String> map, @Body Policy policy);

    @SUB("sp://core-playlist/v1/playlist/{uri}")
    Observable<Response> b(@Path("uri") String str, @QueryMap Map<String, String> map);

    @SUB("sp://core-playlist/v1/playlist/{uri}")
    Observable<Response> b(@Path("uri") String str, @QueryMap Map<String, String> map, @Body Policy policy);
}
