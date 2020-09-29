package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import io.reactivex.Single;

/* renamed from: sal reason: default package */
public interface sal {
    @GET("sp://offlinesearch/v1?limit=-1")
    Single<OfflineResults> a(@Query("query") String str);
}
