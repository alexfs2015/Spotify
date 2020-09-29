package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: uxi reason: default package */
interface uxi {
    @DELETE("sp://core-playlist/v1/playlist/{uri}/offline")
    Completable a(@Path("uri") String str);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/playlist/{uri}?responseFormat=protobuf")
    Completable a(@Path("uri") String str, @Body ModificationRequest modificationRequest);

    @POST("sp://core-playlist/v1/playlist/{uri}/offline")
    Completable a(@Path("uri") String str, @QueryMap Map<String, String> map);

    @POST("sp://core-playlist/v1/playlist/{uri}/resync")
    Completable b(@Path("uri") String str);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/playlist/{uri}?responseFormat=protobuf")
    Single<Response> b(@Path("uri") String str, @Body ModificationRequest modificationRequest);
}
