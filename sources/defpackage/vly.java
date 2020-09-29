package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.QueryMap;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.Single;
import java.util.Map;

/* renamed from: vly reason: default package */
interface vly {
    @GET("sp://core-show/unstable/unfinished/episodes")
    Single<Response> a(@QueryMap Map<String, String> map);

    @GET("sp://core-show/unstable/unfinished/episodes")
    Single<Response> a(@QueryMap Map<String, String> map, @Body Policy policy);
}
