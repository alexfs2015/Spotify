package defpackage;

import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.profile.proto.ProfileChangeDisplaynameRequest.ChangeDisplayNameRequest;
import com.spotify.music.features.profile.proto.ProfileProfilesRequest.GetProfilesRequest;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: pqw reason: default package */
public interface pqw {
    @SUB("sp://core-profile/v1/profiles?responseFormat=protobuf")
    Observable<Response> a(@Body GetProfilesRequest getProfilesRequest);

    @POST("sp://core-profile/v1/change_display_name?responseFormat=protobuf")
    Single<Response> a(@Body ChangeDisplayNameRequest changeDisplayNameRequest);
}
