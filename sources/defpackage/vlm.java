package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.playlist.ondemand.proto.SetRequest;
import com.spotify.playlist.ondemand.proto.TemporaryRequest;
import io.reactivex.Completable;

/* renamed from: vlm reason: default package */
public interface vlm {
    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @PUT("sp://on-demand-set/v1/set")
    Completable a(@Body SetRequest setRequest);

    @Headers({"content-type: application/protobuf", "accept: application/protobuf"})
    @PUT("sp://on-demand-set/v1/temporary")
    Completable a(@Body TemporaryRequest temporaryRequest);
}
