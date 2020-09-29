package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.libs.facebook.PermissionRequestResponse;
import com.spotify.music.libs.facebook.PermissionsRequest;
import com.spotify.music.libs.facebook.SocialEvent;
import com.spotify.music.libs.facebook.SocialState;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: sal reason: default package */
public interface sal {
    @POST("sp://core-social/v1/post-permissions-dialog-hook")
    Completable a(@Query("accessToken") String str);

    @SUB("sp://core-social/v1/events")
    Observable<SocialEvent> a();

    @GET("sp://core-social/v1/request-permissions")
    Single<PermissionRequestResponse> a(@Body PermissionsRequest permissionsRequest);

    @POST("sp://core-social/v1/set-access-token")
    Completable b(@Query("accessToken") String str);

    @SUB("sp://core-social/v1/state")
    Observable<SocialState> b();
}
