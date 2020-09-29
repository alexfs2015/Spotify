package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import io.reactivex.Single;

/* renamed from: vjw reason: default package */
interface vjw {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    Single<Response> a(@Body ModificationRequest modificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist/{folderId}?responseFormat=protobuf")
    Single<Response> a(@Path("folderId") String str, @Body ModificationRequest modificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    Single<Response> b(@Body ModificationRequest modificationRequest);
}
