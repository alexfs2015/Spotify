package defpackage;

import com.spotify.collection.endpoints.proto.TrackListMetadata.ProtoTrackListMetadataResponse;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.Observable;
import java.util.Map;

/* renamed from: gdg reason: default package */
interface gdg {
    @SUB("sp://core-collection/unstable/@/list/tracks/metadata")
    Observable<ProtoTrackListMetadataResponse> a(@QueryMap Map<String, String> map);
}
