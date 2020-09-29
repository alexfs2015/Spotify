package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.cappedondemand.core.model.CappedOndemandStatus;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: kvf reason: default package */
public interface kvf {
    @GET("hm://cap-notifier/cap/status")
    Single<CappedOndemandStatus> a();

    @SUB("hm://cap-notifier/cap/status")
    Observable<CappedOndemandStatus> b();

    @PUT("sp://product-state/v1/overrides/cappedondemand")
    Completable c();

    @DELETE("sp://product-state/v1/overrides/cappedondemand")
    Completable d();
}
