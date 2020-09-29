package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

/* renamed from: uxu reason: default package */
interface uxu {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    Single<ModificationResponse> a(@Body ModificationRequest modificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist/{folderId}?responseFormat=protobuf")
    Single<ModificationResponse> a(@Path("folderId") String str, @Body ModificationRequest modificationRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @POST("sp://core-playlist/v1/rootlist?responseFormat=protobuf")
    Completable b(@Body ModificationRequest modificationRequest);
}
